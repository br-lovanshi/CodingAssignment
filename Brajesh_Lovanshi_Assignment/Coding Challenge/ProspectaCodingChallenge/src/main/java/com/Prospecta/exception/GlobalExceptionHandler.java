package com.Prospecta.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptionHandler {
	

	@ExceptionHandler(Scienceexception.class)
	public ResponseEntity<MyErrorDetails> Scienceexception(Scienceexception ex,WebRequest req){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setMessage(ex.getMessage());
		error.setDateTimenow(LocalDateTime.now());
		error.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exception(Exception ex,WebRequest req){
		
		MyErrorDetails error = new MyErrorDetails();
		
		error.setMessage(ex.getMessage());
		error.setDateTimenow(LocalDateTime.now());
		error.setDescription(req.getDescription(false));
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}

}
