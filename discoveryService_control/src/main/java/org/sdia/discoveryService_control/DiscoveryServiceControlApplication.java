package org.sdia.discoveryService_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceControlApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceControlApplication.class, args);
	}

}
