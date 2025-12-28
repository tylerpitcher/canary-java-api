package com.tylerpitcher.canary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class CanaryJavaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanaryJavaApiApplication.class, args);
	}
}
