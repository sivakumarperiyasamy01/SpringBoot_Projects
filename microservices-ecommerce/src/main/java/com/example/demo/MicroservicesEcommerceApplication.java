package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/*
@EnableEurekaServer activates all the configurations, 
endpoints, and dashboard needed for a Spring Boot app to function as a Netflix Eureka Service Registry
 in a microservice architecture. 
 */


@SpringBootApplication
@EnableEurekaServer
public class MicroservicesEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesEcommerceApplication.class, args);
	}

}
