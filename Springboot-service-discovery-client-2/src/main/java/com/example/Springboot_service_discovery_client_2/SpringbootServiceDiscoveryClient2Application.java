package com.example.Springboot_service_discovery_client_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootServiceDiscoveryClient2Application {

	@Bean
	public RestTemplate restTemplet()
	{
		return new RestTemplate();
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiceDiscoveryClient2Application.class, args);
	}

}
