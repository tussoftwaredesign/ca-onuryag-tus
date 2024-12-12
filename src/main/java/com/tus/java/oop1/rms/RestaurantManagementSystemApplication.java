package com.tus.java.oop1.rms;

import com.netflix.discovery.EurekaClient;
import com.tus.java.oop1.rms.rest.controller.GreetingController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Lazy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaServer
public class RestaurantManagementSystemApplication implements GreetingController {

	@Autowired
	@Lazy
	private EurekaClient eurekaClient;

	@Value("${spring.application.name}")
	private String appName;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantManagementSystemApplication.class, args);
	}

	@Override
	public String greeting() {
		return String.format(
				"Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}
}
