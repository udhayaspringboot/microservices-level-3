package com.springcloudconfigprojserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringcloudconfigprojserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigprojserverApplication.class, args);
	}

}
