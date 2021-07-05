package com.example.parserrestservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParserRestServiceApplication {

	public static void main(String[] args) {
		System.out.println("service running");
		SpringApplication.run(ParserRestServiceApplication.class, args);
	}

}
