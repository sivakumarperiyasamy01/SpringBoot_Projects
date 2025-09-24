package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/*
 * @EnableDiscoveryClient is a Spring Cloud annotation that lets a Spring Boot application register itself with a service registry
 *  (like Eureka, Consul, or Zookeeper) and discover other services.

 */





@SpringBootApplication
@EnableDiscoveryClient
public class MicroservicesProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProductsApplication.class, args);
	}

}
