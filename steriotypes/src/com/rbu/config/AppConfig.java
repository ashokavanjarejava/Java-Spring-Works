package com.rbu.config;

import java.sql.Connection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	public AppConfig() {
	System.out.println("AppConfig object create:@Configuration-1");
	}
	
	@Bean//singleton
	public RestTemplate createCon() {
		System.out.println("RestTemplate object create:@Bean -6");
		return new RestTemplate();
	}
	/* 
	 * <bean class="RegController"/>
	 * <bean class="RegService"/>
	 * <bean class="RestTemplate"/> */
}
