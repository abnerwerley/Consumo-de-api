package com.kitsu.controllers;

import java.util.List;
import java.util.Optional;

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
	
	/*
	@GetMapping("/texto/{id}")
	public ResponseEntity<EpisodesData> getEpisode(@PathVariable String id){
		EpisodesData episode = this.episodesService.pesquisaEpisodio(id);
		return ResponseEntity.ok(episode);
	}
	
	*/
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<EpisodesData>> getEpisodeById(@PathVariable String id){
		Optional<EpisodesData> episode = this.episodesService.pesquisaEpisodio(id);
		
		if(episode.isPresent()) {
			return ResponseEntity.status(200).body(episode);
		} else {
			return ResponseEntity.status(404).build();
		}
	}
	
	@GetMapping("/listarTodos")
	public ResponseEntity<List<EpisodesData>> getTodosEpisodes(){
		List<EpisodesData> todosEpisodes = this.episodesService.pegarTodosEpisodes();
		return ResponseEntity.ok(todosEpisodes);
	}
	
}
