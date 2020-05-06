/**
 * 
 */
package com.practice.service2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author dnaramala
 *
 */
@EnableHystrix
@RestController
public class service2Controller {
	@Autowired
	private RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "returnfallback")
	@GetMapping("/fallback")
	public String retrunMessage() {
		return restTemplate.getForObject("http://SERVICE3/hello", String.class);
	}
	public String returnfallback() {
		return "Service 3 is down fallback Service3";
	}
	@GetMapping("/hello")
	public String returnvValue() {
		return "Service2 is working fine";
	}
}
