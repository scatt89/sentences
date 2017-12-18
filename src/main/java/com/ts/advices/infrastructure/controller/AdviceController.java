package com.ts.advices.infrastructure.controller;

import com.ts.advices.Constants;
import com.ts.advices.domain.model.Advice;
import com.ts.advices.domain.model.Author;
import com.ts.advices.domain.service.AdviceService;
import com.ts.advices.infrastructure.DTO.AdviceRequestDTO;
import com.ts.advices.infrastructure.DTO.AdviceResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.provider.certpath.OCSPResponse;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(Constants.SENTENCE_BASE)
public class AdviceController {

    private AdviceService adviceService;

    @Autowired
    public AdviceController(AdviceService adviceService) {
        this.adviceService = adviceService;
    }

    @RequestMapping(value="/id={id}", method = RequestMethod.GET)
    public ResponseEntity<?> getAdviceById(@PathVariable String id){
        try{
            return ResponseEntity.ok(mapToDTO(adviceService.getAdviceBy(id)));
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value="/userName={userName}", method = RequestMethod.GET)
    public ResponseEntity<?> getAdvicesByAuthor(@PathVariable String userName){
        try{
            return ResponseEntity.ok(mapToDTO(adviceService.getAdvicesByUserName(userName)));
        }catch (Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    @RequestMapping(value="/random", method = RequestMethod.GET)
    public ResponseEntity<?> getRandomAdvice(){
        try{
            return ResponseEntity.ok(mapToDTO(adviceService.getRandomAdvice()));
        }catch(Exception e){
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @RequestMapping(value="/insert", method = RequestMethod.POST)
    public ResponseEntity<?> insertAdvice(@RequestBody AdviceRequestDTO adviceRequestDTO){
        try{
            Long adviceId = adviceService.save(mapFromDTO(adviceRequestDTO));
            return ResponseEntity.created(new URI(Constants.SENTENCE_BASE + "id=" + adviceId)).body(adviceId);
        }catch(Exception e){
            return ResponseEntity.unprocessableEntity().build();
        }
    }

    @RequestMapping(value="/delete/id={id}", method = RequestMethod.GET)
    public ResponseEntity<?> deleteAdviceById(@PathVariable String id){
        try{
            adviceService.deleteAdviceBy(id);
            return ResponseEntity.ok().build();
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
    }

    private Advice mapFromDTO(AdviceRequestDTO adviceRequestDTO) {
        Author author = adviceService.getAuthorByUserName(adviceRequestDTO.getUserName());

        return new Advice(adviceRequestDTO.getSentence(), author);
    }

    private List<AdviceResponseDTO> mapToDTO(List<Advice> advicesByUserName) {
        return advicesByUserName.stream()
                .map(advice -> mapToDTO(advice))
                .collect(Collectors.toList());
    }

    private AdviceResponseDTO mapToDTO(Advice advice) {
        return new AdviceResponseDTO(advice.getId(), advice.getSentence(), advice.getAuthor().getUserName(), advice.getAuthor().getName());
    }

}
