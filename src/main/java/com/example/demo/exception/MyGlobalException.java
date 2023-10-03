package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.entity.AcEntity;

@RestControllerAdvice
public class MyGlobalException {
	@ExceptionHandler(PriceNotFoundException.class)
	public ResponseEntity<Object> handlePrice(){
		return new ResponseEntity<Object>("please return valid price",HttpStatus.BAD_REQUEST);
		
	}
	
	@ExceptionHandler(ModelNotFoundException.class)
	public ResponseEntity<Object> handleModel(){
		return new ResponseEntity<Object>("Please valid model",HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ColorNotException.class)
	public ResponseEntity<Object> handleColor(){
		return new ResponseEntity<Object>("please valid color",HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(ColorNotException.class)
//	public String handleColor1(){
//		return new String("please valid color");
//	}
	
	@ExceptionHandler(YearException.class)
	public ResponseEntity<Object> handlYear(){
		return new ResponseEntity<Object>("valid Year",HttpStatus.BAD_REQUEST);
	}

}
