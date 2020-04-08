package com.daydayup.confgin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConfginApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfginApplication.class, args);
	}

}
