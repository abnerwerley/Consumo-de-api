package com.kitsu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class KitsuApplication {

	@GetMapping
	public ModelAndView sawggerUi() {
		return new ModelAndView("redirect/swagger-ui/");
	}
	
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
