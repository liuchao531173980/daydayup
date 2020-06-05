package com.daydayup.daybegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DaybeginApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaybeginApplication.class, args);
	}

}
