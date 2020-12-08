package com.example.demo.error;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fasterxml.jackson.databind.JsonMappingException;

@RestControllerAdvice
public class GlobalControllerAdvice {
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiError> handleProcutorNoEncontrado(ProductNotFoundException ex){
		ApiError apiError=new ApiError();
		apiError.setEstado(HttpStatus.NOT_FOUND);
		apiError.setFecha(LocalDateTime.now());
		apiError.setMensaje(ex.getMessage());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(apiError);
		
	}
	@ExceptionHandler(JsonMappingException.class) // bad request
	public ResponseEntity<ApiError> handleJsonMappingException(JsonMappingException ex){
		ApiError apiError=new ApiError();
		apiError.setEstado(HttpStatus.BAD_REQUEST);
		apiError.setFecha(LocalDateTime.now());
		apiError.setMensaje(ex.getMessage());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(apiError);
		
	}
/**
 * responseEntityEXCEPTIONHANDLER
 * */
}
