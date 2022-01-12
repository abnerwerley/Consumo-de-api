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
import com.kitsu.models.Anime.Episodes;
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

		System.out.println("Chegou aqui");
		String urlFinal = stringBuilder.append(urlApi).append("/manga").append("/").append(id).toString();
		System.out.println(urlFinal);

		ResponseEntity<Attributes> entity = restTemplate.getForEntity(urlFinal, Attributes.class);

		Attributes body = entity.getBody();
		return body;
	}

	@GetMapping("/listarTodos")
	public Manga[] getAll() {

		System.out.println("Entrou aqui");
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Manga[]> response = restTemplate.getForEntity("https://kitsu.io/api/edge/manga", Manga[].class);
		Manga[] mangas = response.getBody();

		System.out.println(mangas);
		return mangas;
	}

	@GetMapping("/busca/{texto}")
	public Attributes getMangaPorTexto(@PathVariable String texto) {

		System.out.println("Chegou aqui");
		String urlFinal = stringBuilder.append(urlApi).append("/manga").append("?filter[text]=").append(texto)
				.toString();

		System.out.println(urlFinal);
		ResponseEntity<Attributes> entity = restTemplate.getForEntity(urlFinal, Attributes.class);

		Attributes body = entity.getBody();
		System.out.println(body);
		return body;
	}

	@GetMapping("/trending")
	public Manga[] TrendingAnimes() {

		System.out.println("Entrou aqui");
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Manga[]> response = restTemplate.getForEntity("https://kitsu.io/api/edge/trending/manga",
				Manga[].class);
		Manga[] TrendingMangas = response.getBody();

		System.out.println(TrendingMangas);
		return TrendingMangas;
	}

	@GetMapping("/chapter/{manga}")
	public Episodes getEpisodePorAnime(@PathVariable String anime) {

		System.out.println("Chegou aqui");
		String urlFinal = stringBuilder.append(urlApi).append("/manga").append("?filter[text]=").append(anime)
				.toString();

		System.out.println(urlFinal);
		ResponseEntity<Episodes> entity = restTemplate.getForEntity(urlFinal, Episodes.class);

		Episodes body = entity.getBody();
		System.out.println(body);
		return body;
	}

}
