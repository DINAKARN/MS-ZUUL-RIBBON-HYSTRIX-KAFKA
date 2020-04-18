package com.practice.service1Register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication
@EnableEurekaServer
@EnableZuulProxy
@EnableDiscoveryClient
public class Service1RegisterApplication {

	public static void main(String[] args) {
		SpringApplication.run(Service1RegisterApplication.class, args);
	}

}
