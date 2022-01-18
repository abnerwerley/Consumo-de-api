package com.kitsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class KitsuApplication {

	@Bean
	public WebClient webCientKitsu(WebClient.Builder builder) {
		return builder
			.baseUrl("https://kitsu.io/api/edge")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/vnd.api+json")
			.defaultHeader(HttpHeaders.ACCEPT, "application/vnd.api+json")
			.build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(KitsuApplication.class, args);
	}

}
