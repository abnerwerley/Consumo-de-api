package com.kitsu.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitsu.models.MangaResponse;

@RestController
@RequestMapping("/manga")
public class MangaController {

	@GetMapping("/busca/{id}")
	public ResponseEntity<MangaResponse> getById(@PathVariable String id) {
		return null;
	}

	@GetMapping("/listarTodos")
	public ResponseEntity<List<MangaResponse>> getAll() {
		return null;
	}

	@GetMapping("/busca/{texto}")
	public ResponseEntity<List<MangaResponse>> getMangaPorTexto(@PathVariable String texto) {
		return null;
	}

	@GetMapping("/trending")
	public ResponseEntity<List<MangaResponse>> TrendingAnimes() {
		return null;
	}

	@GetMapping("/chapter/{manga}")
	public ResponseEntity<List<MangaResponse>> getEpisodePorAnime(@PathVariable String manga) {
		return null;
	}

}
