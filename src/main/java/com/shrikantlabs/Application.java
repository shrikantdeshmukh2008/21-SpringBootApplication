package com.shrikantlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	private static final String REST_URL="https://www.fleetfarm.com";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("This is first application");
		//changes for ECOM-333
		int a=10;
	}

}
