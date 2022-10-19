package com.kitsu.controllers;

import com.kitsu.episodes.EpisodesService;
import com.kitsu.episodes.model.EpisodesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/episodes")
public class EpisodesController {

    private @Autowired EpisodesService episodesService;

    @GetMapping("/{id}")
    public ResponseEntity<EpisodesData> getEpisodeById(@PathVariable String id) {
        EpisodesData episode = this.episodesService.pesquisaEpisodio(id);

        return ResponseEntity.status(200).body(episode);

    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<EpisodesData>> getTodosEpisodes() {
        List<EpisodesData> todosEpisodes = this.episodesService.pegarTodosEpisodes();
        return ResponseEntity.ok(todosEpisodes);
    }

}
