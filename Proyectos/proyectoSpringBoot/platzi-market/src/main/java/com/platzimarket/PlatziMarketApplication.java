package com.platzimarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlatziMarketApplication {

	public static void main(String[] args) {
		System.out.println("hola chica");
		SpringApplication.run(PlatziMarketApplication.class, args);
		System.out.println("hola chica fin");
	}

}
