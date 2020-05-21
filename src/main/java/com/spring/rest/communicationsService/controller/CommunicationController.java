package com.spring.rest.communicationsService.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.communicationsService.model.GenericResponseModel;


@RestController
@RequestMapping(value ="/communicationService")
public class CommunicationController {
	
	@RequestMapping(value="/email", 
			method = RequestMethod.GET, 
			produces = APPLICATION_JSON_VALUE,
			consumes = APPLICATION_JSON_VALUE)
	public ResponseEntity<GenericResponseModel> sendEmail(@RequestBody JSONObject inputJSONObj){
		try {
		JSONObject requestService = new JSONObject(inputJSONObj);
		String toEmail = requestService.getString("email");
		String subject = requestService.getString("subject");
		String ccEmail = requestService.getString("cc");
		String bccEmail = requestService.getString("bcc");
		
		
		System.out.println("toEmail =>"+toEmail);
		System.out.println("subject =>"+subject);
		System.out.println("ccEmail =>"+ccEmail);
		System.out.println("bccEmail =>"+bccEmail);
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}
		return null;
		
	}

}
