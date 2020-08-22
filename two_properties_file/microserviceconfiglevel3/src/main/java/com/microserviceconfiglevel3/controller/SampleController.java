package com.microserviceconfiglevel3.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@Value("${message1}")
	private String message1;
	@GetMapping("/message")
	public String getMess()
	{
		return message1;
	}
	
}
