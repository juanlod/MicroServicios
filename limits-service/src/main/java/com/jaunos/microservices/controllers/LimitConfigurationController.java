package com.jaunos.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jaunos.microservices.config.Configuration;
import com.jaunos.microservices.config.LimitConfiguration;

@RestController
public class LimitConfigurationController {
	
	@Autowired
	Configuration configuration;

	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(
				configuration.getMaximum(), 
				configuration.getMinimum());
	}
}
