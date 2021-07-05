package com.example.parserrestservice;

import org.gbif.common.parsers.date.DateParsers;
import org.gbif.common.parsers.date.TemporalParser;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import org.gbif.common.parsers.core.ParseResult;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParserRestServiceApplication {

	public static void main(String[] args) {
		System.out.println("service running");
		SpringApplication.run(ParserRestServiceApplication.class, args);
	}

}
