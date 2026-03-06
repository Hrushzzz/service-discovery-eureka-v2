package com.hrushikesh.service_discovery_eureka_v2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryEurekaV2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryEurekaV2Application.class, args);
	}

}
