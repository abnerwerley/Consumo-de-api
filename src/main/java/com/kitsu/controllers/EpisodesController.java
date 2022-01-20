package com.kitsu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kitsu.models.EpisodesData;
import com.kitsu.services.EpisodesService;

@RestController
@RequestMapping("/episodes")
public class EpisodesController {

	private @Autowired EpisodesService episodesService;
	
	@GetMapping("/{id}")
	public ResponseEntity<EpisodesData> getEpisodeById(@PathVariable String id){
		EpisodesData episode = this.episodesService.pesquisaEpisodio(id);
		return ResponseEntity.ok(episode);
	}
	
	@GetMapping("/texto/{id}")
	public ResponseEntity<List<EpisodesData>> getEpisodesByTexto(@PathVariable String id){
		List<EpisodesData> episode = this.episodesService.pesquisaEpisodioPorTexto(id);
		return ResponseEntity.ok(episode);
	}
	
}
