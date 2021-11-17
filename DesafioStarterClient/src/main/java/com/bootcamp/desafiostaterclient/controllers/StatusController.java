package com.bootcamp.desafiostaterclient.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.bootcamp.desafiostater.Status;

public class StatusController {

	@Autowired
	private Status status;
	
	@GetMapping("/open")
	public ResponseEntity<String> estadoOpen(@Selector String estado) {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(status.mensajeEstado());
	}
	
	@GetMapping("/halfopen")
	public ResponseEntity<String> estadoHalfOpen(@Selector String estado) {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(status.mensajeEstado());
	}
	
	@GetMapping("/close")
	public ResponseEntity<String> estadoClose(@Selector String estado) {
		
		return new ResponseEntity<String>(HttpStatus.OK).ok(status.mensajeEstado());
	}
}
