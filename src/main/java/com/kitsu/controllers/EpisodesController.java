package com.kitsu.controllers;

import com.kitsu.episodes.service.EpisodesService;
import com.kitsu.episodes.model.EpisodesData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/episodes")
public class EpisodesController {

    private @Autowired EpisodesService service;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{id}")
    EpisodesData getEpisodeById(@PathVariable String id) {
        return service.pesquisaEpisodio(id);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/listarTodos")
    List<EpisodesData> getTodosEpisodes() {
        return service.pegarTodosEpisodes();
    }

}
