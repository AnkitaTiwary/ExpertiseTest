package com.ankita.app.conversionApp.TO;

public class ApiResponse {

	private String statusMessage;
	private String statusCode;
	
	
	
	

	public ApiResponse() {
		super();
	}

	public ApiResponse(String statusMessage, String statusCode, Object data) {
		super();
		this.statusMessage = statusMessage;
		this.statusCode = statusCode;
		
	}

	
	public ApiResponse(String statusMessage) {
		super();
		this.statusMessage = statusMessage;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	

}
