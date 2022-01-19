package com.kitsu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitsu.models.MangaData;
import com.kitsu.services.MangaService;

@RestController
@RequestMapping("/manga")
public class MangaController {

	@Autowired
	private MangaService mangaService;

	@GetMapping("/busca/{texto}")
	public ResponseEntity<List<MangaData>> getMangasPorTexto(@PathVariable String texto) {
		
		List<MangaData> mangas = this.mangaService.pesquisaPorTexto(texto);
		
		return ResponseEntity.ok(mangas);
	}

	@GetMapping("/trending")
	public ResponseEntity<List<MangaData>> TrendingMangas() {
		
		List<MangaData> mangasPopoulares = this.mangaService.pesquisaPorPopulares();
		return ResponseEntity.ok(mangasPopoulares);
	}

}
