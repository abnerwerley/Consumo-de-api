package com.kitsu.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kitsu.models.Anime;
import com.kitsu.models.Anime.Attributes;

@RestController
@RequestMapping("/anime")
public class AnimeController {

	@Value("${url.api}") // Responsável por ir na application.properties e pegar as variáveis de
							// ambiente.
	private String urlApi;

	@GetMapping("/{id}")
	public Attributes getById(@PathVariable String id) {

		System.out.println("Chegou aqui");
		RestTemplate restTemplate = new RestTemplate();
		StringBuilder stringBuilder = new StringBuilder();
		String urlFinal = stringBuilder.append(urlApi).append("/anime").append("/").append(id).toString();

		System.out.println(urlFinal);
		
		ResponseEntity<Attributes> entity = restTemplate.getForEntity(urlFinal, Attributes.class);
		
		Attributes body = entity.getBody();
		System.out.println(body);
		
		//HttpStatus statusCode = entity.getStatusCode();
		//System.out.println(statusCode);
		
		return body;

	}

	@GetMapping("/listarTodos")
	public Anime[] pegarTodos(){

		System.out.println("Entrou aqui");
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Anime[]> response = restTemplate.getForEntity("https://kitsu.io/api/edge/anime", Anime[].class);
		Anime[] animes = response.getBody();

		System.out.println(animes);
		return animes;
	}
	
	
	
	

}
