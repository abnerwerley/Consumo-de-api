package com.kitsu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitsu.models.AnimeData;
//import com.kitsu.models.EpisodeData;
import com.kitsu.services.AnimeService;

@RestController
@RequestMapping("/anime")
public class AnimeController {

	private @Autowired AnimeService animeService;

	@GetMapping("/busca/{texto}")
	public ResponseEntity<List<AnimeData>> getAnimesPorTexto(@PathVariable String texto) {

		List<AnimeData> animesDoTexto = this.animeService.pesquisaPorFiltro(texto);

		return ResponseEntity.ok(animesDoTexto);
	}

	/*
	@GetMapping("/{id}")
	public ResponseEntity<AnimeData> getById(@PathVariable String id) {
		return null;
	}
	*/

	@GetMapping("/listarTodos")
	public ResponseEntity<List<AnimeData>> getTodosAnimes() {
		List<AnimeData> todosAnimes = this.animeService.pegarTodosAnimes();
		
		return ResponseEntity.ok(todosAnimes);
	}

	@GetMapping("/trending")
	public ResponseEntity<List<AnimeData>> getTrendingAnimes() {

		List<AnimeData> animesPopulares = this.animeService.pesquisaPorRanking();

		return ResponseEntity.ok(animesPopulares);
	}

	/*
	@GetMapping("/episodes/{id}")
	public ResponseEntity<List<EpisodeData>> getEpisodePorAnime(@PathVariable String id) {
		
		List<EpisodeData> episodios = this.animeService.pesquisaEpisodio(id);
		
		return ResponseEntity.ok(episodios);
	}
	
	*/

}
