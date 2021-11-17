package com.bootcamp.desafiostater;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Status.class)
@EnableConfigurationProperties(StatusProperties.class)
public class StatusAutoconfigure {
	
	private final StatusProperties properties;

	public StatusAutoconfigure(StatusProperties properties) {
		this.properties = properties;
	}
	
	@Bean
	public Status estado() {
		System.out.println("Estado: "+properties.getStatus());
		return new Status(properties.getStatus());
	}
	
}
