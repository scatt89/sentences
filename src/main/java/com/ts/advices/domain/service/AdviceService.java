package com.ts.advices.domain.service;

import com.ts.advices.domain.AdviceRepositoryManager;
import com.ts.advices.domain.model.Advice;
import com.ts.advices.domain.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class AdviceService {

    private AdviceRepositoryManager adviceRepositoryManager;

    @Autowired
    public AdviceService(AdviceRepositoryManager adviceRepositoryManager) {
        this.adviceRepositoryManager = adviceRepositoryManager;
    }

    public List<Advice> getAdvicesByUserName(String userName) {
        return adviceRepositoryManager.getAdvicesByUserName(userName);
    }

    public Advice getAdviceBy(String id){
        return adviceRepositoryManager.getAdviceBy(id);
    }

    public Author getAuthorByUserName(String userName) {
        return adviceRepositoryManager.getAuthorByUserName(userName);
    }

    public Advice getRandomAdvice() {
        return adviceRepositoryManager.getRandomAdvice();
    }

    @Transactional
    public void deleteAdviceBy(String id) {
        adviceRepositoryManager.deleteAdviceBy(id);
    }

    @Transactional
    public Long save(Advice advice) {
        return adviceRepositoryManager.save(advice);
    }
}
