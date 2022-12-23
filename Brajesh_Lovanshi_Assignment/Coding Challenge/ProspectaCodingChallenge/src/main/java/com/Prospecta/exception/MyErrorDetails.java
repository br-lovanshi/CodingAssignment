package com.Prospecta.exception;

import java.time.LocalDateTime;

public class MyErrorDetails {
	
	private String message;
	private LocalDateTime dateTimenow;
	private String description;
	
	
	 
	
	public MyErrorDetails() {
		// TODO Auto-generated constructor stub
	}




	public MyErrorDetails(String message, LocalDateTime dateTimenow, String description) {
		super();
		this.message = message;
		this.dateTimenow = dateTimenow;
		this.description = description;
	}




	public String getMessage() {
		return message;
	}




	public void setMessage(String message) {
		this.message = message;
	}




	public LocalDateTime getDateTimenow() {
		return dateTimenow;
	}




	public void setDateTimenow(LocalDateTime dateTimenow) {
		this.dateTimenow = dateTimenow;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
