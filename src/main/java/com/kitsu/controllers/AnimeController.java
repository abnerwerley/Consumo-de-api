package com.kitsu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitsu.models.AnimeData;
import com.kitsu.models.AnimeEpisodes;
import com.kitsu.services.AnimeService;


@RestController
@RequestMapping("/anime")
public class AnimeController {

	private @Autowired AnimeService animeService;
	
	@GetMapping("/busca/{texto}")
	public ResponseEntity<List<AnimeData>> getAnimePorTexto(@PathVariable String texto) {
		
		List<AnimeData> animesDoTexto = this.animeService.pesquisaPorFiltro(texto);
		
		return ResponseEntity.ok(animesDoTexto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AnimeData> getById(@PathVariable String id) {
		return null;
	}

	@GetMapping("/listarTodos")
	public AnimeData[] pegarTodos(){
		return null;
	}
	
	
	@GetMapping("/trending")
	public AnimeData[] TrendingAnimes(){
		return null;
	}
	
	
	@GetMapping("/episode/{anime}")
	public AnimeEpisodes getEpisodePorAnime(@PathVariable String anime) {
		return null;
	}

}
