package com.jaunos.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaunos.microservices.config.Configuration;
import com.jaunos.microservices.config.LimitConfiguration;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@RestController
@EnableDiscoveryClient()
public class LimitConfigurationController {
	
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(
				configuration.getMaximum(), 
				configuration.getMinimum());
	}
	
	@GetMapping("/fault-to-tolerance-example")
	@HystrixCommand(fallbackMethod="fallbackRetrieveConfiguration")
	public LimitConfiguration retrieveConfiguration() {
		throw new RuntimeException("Not avaliable");
	}
	
	
	public LimitConfiguration fallbackRetrieveConfiguration() {
		return new LimitConfiguration(999,9);
	}
	
	
}
