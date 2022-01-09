package com.kitsu.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kitsu.models.Anime.Attributes;

@RestController
@RequestMapping("/anime")
public class AnimeController {

	@Value("${url.api}") // Responsável por ir na application.properties e pegar as variáveis de
							// ambiente.
	private String urlApi;

	@GetMapping("/{id}")
	public Attributes getById(@PathVariable String id) {

		RestTemplate restTemplate = new RestTemplate();
		StringBuilder stringBuilder = new StringBuilder();
		String urlFinal = stringBuilder.append(urlApi).append(id).toString();

		ResponseEntity<Attributes> entity = restTemplate.getForEntity(urlFinal, Attributes.class);

		System.out.println(entity.getBody());

		return entity.getBody();

	}
}
