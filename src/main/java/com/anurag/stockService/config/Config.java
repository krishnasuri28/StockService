package com.anurag.stockService.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Config {
	
	@LoadBalanced
	@Bean
	public RestTemplate restTemplate() {
		 return new RestTemplate();
	}

}
