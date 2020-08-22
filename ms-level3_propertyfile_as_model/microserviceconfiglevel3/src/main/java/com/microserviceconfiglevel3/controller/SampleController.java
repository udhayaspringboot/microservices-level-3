package com.microserviceconfiglevel3.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceconfiglevel3.model.ConfigFiles;

@RestController
public class SampleController {

	//@Value("${message1}")
	@Value("${message1:default value}")
	private String message1;
	
	@Value(" static values")
	private String staticMessage;
	
	@Value("${mess.listval}")
	private List<String> listMessage;
	
	@Autowired
	private ConfigFiles configFiles;
	/*
	 * @Value("#{${dbValues}}") private Map<String,String> dbValues;
	 */
	
	@GetMapping("/message")
	public String getMess()
	{
		
		return message1 + staticMessage +listMessage  + configFiles.getConnection() + configFiles.getHost() + " " +configFiles.getPort();
				
	}
	
	
	
}
