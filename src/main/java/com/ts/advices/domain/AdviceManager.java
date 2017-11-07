package com.ts.advices.domain;

import com.ts.advices.domain.model.Advice;
import com.ts.advices.domain.model.Author;
import com.ts.advices.infrastructure.DAO.AdviceRepository;
import com.ts.advices.infrastructure.DAO.AuthorRepository;
import com.ts.advices.infrastructure.VO.AdviceVO;
import com.ts.advices.infrastructure.VO.AuthorVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdviceManager {

    private AdviceRepository adviceRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public AdviceManager(AdviceRepository adviceRepository, AuthorRepository authorRepository) {
        this.adviceRepository = adviceRepository;
        this.authorRepository = authorRepository;
    }

    public List<Advice> getAdvicesByAuthorName(String authorName){
        AuthorVO authorVO = authorRepository.findByName(authorName);
        return getAdvicesBy(mapFromVO(authorVO));
    }

    public List<Advice> getAdvicesBy(Author author) {
        AuthorVO authorVO = mapToVO(author);
        List<Advice> adviceList = mapFromVO(adviceRepository.findByAuthor(authorVO));
        return adviceList;
    }

    public Advice getAdviceBy(String id) {
         return mapFromVO(adviceRepository.findOne(Long.parseLong(id)));
    }

    private List<Advice> mapFromVO(List<AdviceVO> adviceVOList) {
        if(adviceVOList == null ) return null;
        if(adviceVOList.size() == 0) return new ArrayList<>();

        List<Advice> result = new ArrayList<>();
        for(AdviceVO adviceVO: adviceVOList){

            result.add(new Advice(adviceVO.getId().toString(), adviceVO.getSentence(), mapFromVO(adviceVO.getAuthor())));
        }
        return result;
    }

    private Advice mapFromVO(AdviceVO adviceVO) {
        if(adviceVO == null) return null;

        return new Advice(adviceVO.getId().toString(), adviceVO.getSentence(), mapFromVO(adviceVO.getAuthor()));
    }

    private Author mapFromVO(AuthorVO authorVO){
        if(authorVO == null) return null;

        return new Author(authorVO.getId().toString(), authorVO.getName());
    }

    private AuthorVO mapToVO(Author author) {
        if(author == null) return null;

        return authorRepository.findOne(Long.parseLong(author.id()));
    }
}
