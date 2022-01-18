package com.kitsu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitsu.models.Anime;
import com.kitsu.models.Anime.Episodes;
import com.kitsu.models.AnimeCustom;
import com.kitsu.services.AnimeService;


@RestController
@RequestMapping("/anime")
public class AnimeController {

	private @Autowired AnimeService animeService;
	
	@GetMapping("/busca/{texto}")
	public ResponseEntity<AnimeCustom> getAnimePorTexto(@PathVariable String texto) {
		
		AnimeCustom animeDoTexto = this.animeService.pesquisaPorFiltro(texto);
		
		return ResponseEntity.ok(animeDoTexto);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<AnimeCustom> getById(@PathVariable String id) {
		return null;
	}

	@GetMapping("/listarTodos")
	public Anime[] pegarTodos(){
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
