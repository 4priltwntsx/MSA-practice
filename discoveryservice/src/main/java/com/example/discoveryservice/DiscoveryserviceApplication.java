package com.example.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 자동적으로 유레카 서버
public class DiscoveryserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryserviceApplication.class, args);
	}

}
