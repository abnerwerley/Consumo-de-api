package com.kitsu.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class Client {

	@Bean
	public WebClient webCientKitsu(WebClient.Builder builder) {
		return builder
			.baseUrl("https://kitsu.io/api/edge")
			.defaultHeader(HttpHeaders.CONTENT_TYPE, "application/vnd.api+json")
			.defaultHeader(HttpHeaders.ACCEPT, "application/vnd.api+json")
			.build();
	}
}
