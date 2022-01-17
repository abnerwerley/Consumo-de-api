package com.kitsu.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kitsu.models.Manga.Attributes;
import com.kitsu.models.Manga.Chapters;
import com.kitsu.models.Manga;

@RestController
@RequestMapping("/manga")
public class MangaController {

	@Value("${url.api}")
	private String urlApi;

	RestTemplate restTemplate = new RestTemplate();
	StringBuilder stringBuilder = new StringBuilder();

	@GetMapping("/busca/{id}")
	public Attributes getById(@PathVariable String id) {
		return null;
	}

	@GetMapping("/listarTodos")
	public Manga[] getAll() {
		return null;
	}

	@GetMapping("/busca/{texto}")
	public Attributes getMangaPorTexto(@PathVariable String texto) {
		return null;
	}

	@GetMapping("/trending")
	public Manga[] TrendingAnimes() {
		return null;
	}

	@GetMapping("/chapter/{manga}")
	public Chapters getEpisodePorAnime(@PathVariable String manga) {
		return null;
	}

}
