package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootCicdBuildAwsApplication {

	@GetMapping("/success")
	public String suceess() {
		return "CI CD build success in Aws";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCicdBuildAwsApplication.class, args);
	}

}
