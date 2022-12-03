package com.dondapati.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleRestApiApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SimpleRestApiApplication.class, args);
		forTest();
	}

	private static void forTest() {
		System.out.println("Sample print");		
	}
	
	

}
