package com.ts.controller;

import java.util.Collection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ts.dao.AdviceDao;
import com.ts.model.Advice;

@RestController
@CrossOrigin(methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
@RequestMapping("/sentences")
public class AdviceController {

	private static final Logger log = LoggerFactory.getLogger(AdviceController.class);
	
	@Autowired
	private AdviceDao adviceDao;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Collection<Advice> getAdvices(){
		log.info("Sending all sentences");
		return adviceDao.list();
	}
	
	@RequestMapping(value = "/random", method = RequestMethod.GET)
	public ResponseEntity<Advice> getRandomAdvice(){
		log.info("Random sentence request");
		
		Advice advice = adviceDao.getRandom();
		
		ResponseEntity<Advice> response = new ResponseEntity<Advice>(advice, HttpStatus.OK);
		
		return response;
	}
	
	@RequestMapping(value="/id={id}", method = RequestMethod.GET)
	public ResponseEntity<Advice> getAdvice(@PathVariable long id){
		log.info("Sentence request with id \""+id+"\"");
		
		Advice advice = adviceDao.get(id);
		
		ResponseEntity<Advice> response = new ResponseEntity<Advice>(advice, HttpStatus.OK);
		
		return response;
	}
	
	@RequestMapping(value="/newAdvice", method = RequestMethod.POST)
	public ResponseEntity<Advice> newAdvice(@RequestBody Advice advice){
		log.info("Creando consejo: "+advice.toString());
		ResponseEntity<Advice> response;
		
		adviceDao.saveOrUpdate(advice);
		
		response = new ResponseEntity<Advice>(advice, HttpStatus.CREATED);
		
		return response; 
	}
	
	@RequestMapping(value="/deleteAdvice/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteAdvice(@PathVariable long id){
		log.info("Eliminando consejo con id="+id);
		
		ResponseEntity<String> response;
//		Advice advice = adviceDao.get(id);
		
//		if(advice==null){
//			response = new ResponseEntity<Advice>(advice, HttpStatus.CONFLICT);
//			log.info("No se ha podido eliminar el consejo con id="+id+" porque no existe");
//		}else{
			adviceDao.delete(id);
			response = new ResponseEntity<String>("Se ha eliminado con exito", HttpStatus.NO_CONTENT);
//			log.info("Eliminado consejo "+advice.toString());
//		}
		
		return response;
	}
	
}
