package br.com.fiap.techchellenge.controllers;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.fiap.techchellenge.exception.ControllerNotFoundException;
import br.com.fiap.techchellenge.exception.DefaultError;
import jakarta.servlet.http.HttpServletRequest;

//Handller Quando quer lhe dar com erro na controller
@ControllerAdvice
public class ControllerExceptionHandler {
  
	private DefaultError error = new DefaultError();
    
	@ExceptionHandler(ControllerNotFoundException.class)
    public ResponseEntity<DefaultError>entityNotFound(ControllerNotFoundException exception, HttpServletRequest request){
	HttpStatus status = HttpStatus.NOT_FOUND;
	error.setTimestamp(Instant.now());
	error.setStatus(status.value());
	error.setError("Entidade não encontrada");
	error.setMessage(exception.getMessage());
	error.setPath(request.getRequestURI());
	return ResponseEntity.status(status).body(this.error);
  }
	
}
