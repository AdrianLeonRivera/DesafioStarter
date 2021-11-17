package com.bootcamp.desafiostater;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("status.mensaje")
public class StatusProperties {
	
	private String status="close";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
