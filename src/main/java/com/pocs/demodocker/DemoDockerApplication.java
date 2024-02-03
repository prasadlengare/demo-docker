package com.pocs.demodocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerApplication {

	@GetMapping(value = "/getResponse")
	public String getApiResponse(){
		return "This docker POC!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerApplication.class, args);
	}

}
