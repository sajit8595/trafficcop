package com.trafficapp.trafficcop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrafficcopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrafficcopApplication.class, args);
		System.out.println("Server Started");
	}

}
