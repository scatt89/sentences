package com.ts.advices.infrastructure.controller;

import com.ts.advices.domain.model.Advice;
import com.ts.advices.domain.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/advices")
public class AdviceSimpleController {

    private AdviceService adviceService;

    @Autowired
    public AdviceSimpleController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @RequestMapping(value="/id={id}", method = RequestMethod.GET)
    public ResponseEntity<Advice> getAdviceById(@PathVariable String id){
        Advice advice = adviceService.getAdviceBy(id);

        return new ResponseEntity<>(advice, HttpStatus.OK);
    }

    @RequestMapping(value="/authorName={authorName}", method = RequestMethod.GET)
    public ResponseEntity<List<Advice>> getAdvicesByAuthor(@PathVariable String authorName){
        List<Advice> result = adviceService.getAdvicesByAuthorName(authorName);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
