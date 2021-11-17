package com.bootcamp.desafiostater;

public class Status {

	private String status;

	public Status(String status) {
		this.status = status;
	}
	
	public String mensajeEstado() {
		String mensaje = "";
		switch (status) {
		case "open":
			mensaje = "half-open";
			break;
		case "half-open":
			mensaje="close";
		default:
			mensaje = "open";
			break;
		}
		
		return mensaje;
	}
}
