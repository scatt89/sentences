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
import java.util.stream.Collectors;

@Component
public class AdviceRepositoryManager {

    private AdviceRepository adviceRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public AdviceRepositoryManager(AdviceRepository adviceRepository, AuthorRepository authorRepository) {
        this.adviceRepository = adviceRepository;
        this.authorRepository = authorRepository;
    }

    public List<Advice> getAdvicesByUserName(String userName){
        AuthorVO authorVO = authorRepository.findByUserName(userName);
        return getAdvicesBy(authorVO);
    }

    public Advice getAdviceBy(String id) {
         return mapFromVO(adviceRepository.findOne(Long.parseLong(id)));
    }

    public List<Advice> getAdvicesBy(AuthorVO authorVO) {
        List<Advice> adviceList = mapFromVO(adviceRepository.findByAuthor(authorVO));
        return adviceList;
    }

    public Author getAuthorByUserName(String userName) {
        AuthorVO authorVO = authorRepository.findByUserName(userName);
        return mapFromVO(authorVO);
    }

    public Advice getRandomAdvice() {
        return mapFromVO(adviceRepository.findRandom().get(0));
    }

    public Long save(Advice advice) {
        return adviceRepository.save(mapToVO(advice)).getId();
    }

    private List<Advice> mapFromVO(List<AdviceVO> adviceVOList) {
        if(adviceVOList == null ) return null;
        if(adviceVOList.size() == 0) return new ArrayList<>();

        return adviceVOList.stream()
                .map(adviceVO -> new Advice(adviceVO.getId().toString(), adviceVO.getSentence(), mapFromVO(adviceVO.getAuthor())))
                .collect(Collectors.toList());
    }

    public void deleteAdviceBy(String id) {
        adviceRepository.delete(Long.parseLong(id));
    }

    private Advice mapFromVO(AdviceVO adviceVO) {
        if(adviceVO == null) return null;

        return new Advice(adviceVO.getId().toString(), adviceVO.getSentence(), mapFromVO(adviceVO.getAuthor()));
    }

    private Author mapFromVO(AuthorVO authorVO){
        if(authorVO == null) return null;

        return new Author(authorVO.getName(), authorVO.getUserName());
    }

    private AuthorVO mapToVO(Author author) {
        if(author == null) return null;

        return authorRepository.findByUserName(author.userName());
    }

    private AdviceVO mapToVO(Advice advice){
        return new AdviceVO(mapToVO(advice.author()), advice.sentece());
    }
}
