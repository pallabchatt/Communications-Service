package com.spring.rest.communicationsService.model;

public class GenericResponseModel {
	
	private final String statusCode;
	private final String statusMessage;
	
	private GenericResponseModel (String statusCode,String statusMessage) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}
	
	

}
