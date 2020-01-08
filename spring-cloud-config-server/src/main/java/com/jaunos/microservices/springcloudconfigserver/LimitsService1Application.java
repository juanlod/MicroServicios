package com.jaunos.microservices.springcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LimitsService1Application {

	public static void main(String[] args) {
		SpringApplication.run(LimitsService1Application.class, args);
	}

}
