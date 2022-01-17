package com.kitsu.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kitsu.models.Anime;
import com.kitsu.models.Anime.Attributes;
import com.kitsu.models.Anime.Episodes;

@RestController
@RequestMapping("/anime")
public class AnimeController {

	@Value("${url.api}") // Responsável por ir na application.properties e pegar as variáveis de
							// ambiente.
	private String urlApi;

	RestTemplate restTemplate = new RestTemplate();
	StringBuilder stringBuilder = new StringBuilder();
	
	@GetMapping("/busca/{id}")
	public Attributes getById(@PathVariable String id) {
		return null;
	}

	@GetMapping("/listarTodos")
	public Anime[] pegarTodos(){
		return null;
	}
	
	@GetMapping("/busca/{texto}")
	public Attributes getAnimePorTexto(@PathVariable String texto) {
		return null;
	}
	
	@GetMapping("/trending")
	public Anime[] TrendingAnimes(){
		return null;
	}
	
	
	@GetMapping("/episode/{anime}")
	public Episodes getEpisodePorAnime(@PathVariable String anime) {
		return null;
	}

}
