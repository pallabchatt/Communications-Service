package com.spring.rest.communicationsService.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.communicationsService.model.GenericResponseModel;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping(value ="/communicationService")
public class CommunicationController {
	
	@RequestMapping(value="/email", 
			method = RequestMethod.GET, 
			produces = APPLICATION_JSON_VALUE,
			consumes = APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponseModel> sendEmail(){
		System.out.println("Inside /communicationService/email Controller");
		return null;
		
	}

}
