package com.infy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRestApplication {
	final static Logger log = LoggerFactory.getLogger(SpringRestApplication.class);
	public static void main(String[] args) {
		
		log.error("calling run method");
		SpringApplication.run(SpringRestApplication.class, args);
	}
}
