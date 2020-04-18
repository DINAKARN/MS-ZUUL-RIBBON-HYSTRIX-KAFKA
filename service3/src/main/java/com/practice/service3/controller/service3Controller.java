/**
 * 
 */
package com.practice.service3.controller;

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
@RestController()
@EnableHystrix
public class service3Controller {
	@Autowired
	private RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "returnfallback")
	@GetMapping("/fallback")
	public String retrunMessage() {
		return restTemplate.getForObject("http://SERVICE2/service2/hello", String.class);
	}
	public String returnfallback() {
		return "Servie 2 is Down fallback Service2";
	}
	@GetMapping("/service3/hello")
	public String returnvValue() {
		return "Service3";
	}
}
