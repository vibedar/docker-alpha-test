package com.docker_app.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {

	public int add(int a, int b) {
		return a+b;
	}
	
	
}
