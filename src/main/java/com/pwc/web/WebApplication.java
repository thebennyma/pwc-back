package com.pwc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebApplication {

	public static void main(String[] args) {
                System.out.print("Creando api");
		SpringApplication.run(WebApplication.class, args);
	}

}
