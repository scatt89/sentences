package com.ts.advices.domain.service;

import com.ts.advices.domain.AdviceManager;
import com.ts.advices.domain.model.Advice;
import com.ts.advices.domain.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AdviceService {

    private AdviceManager adviceManager;

    @Autowired
    public AdviceService(AdviceManager adviceManager) {
        this.adviceManager = adviceManager;
    }

    public List<Advice> getAdvicesByAuthorName(String authorName) {
        return adviceManager.getAdvicesByAuthorName(authorName);
    }

    public List<Advice> getAdvicesBy(Author author){
        return adviceManager.getAdvicesBy(author);
    }

    public Advice getAdviceBy(String id){
        return adviceManager.getAdviceBy(id);
    }
}
