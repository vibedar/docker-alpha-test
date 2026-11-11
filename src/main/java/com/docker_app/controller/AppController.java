package com.docker_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker_app.service.AppService;

@RestController
public class AppController {
	
	private final AppService appService;

	public AppController(AppService appService) {
		this.appService = appService;
	}
	
	@GetMapping("/hi")
	public String getMsg() {
		return "hi everyone";
	}
	
	@GetMapping("/hello")
	public String getHello() {
		return "hello guys";
	}
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to docker trails";
	}
	
	@GetMapping("/add")
	public int addNum(int a, int b) {
		return appService.add(a,b);
	}
	@GetMapping("/mul")
	public int addMul(int NUM1, int NUM2) {
		return NUM1*NUM2;
		
	}
}
