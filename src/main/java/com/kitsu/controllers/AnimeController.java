package com.kitsu.controllers;

import com.kitsu.anime.service.AnimeService;
import com.kitsu.anime.model.AnimeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private @Autowired AnimeService service;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/busca/{texto}")
    List<AnimeData> getAnimesPorTexto(@PathVariable String texto) {
        return service.pesquisaPorTexto(texto);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{anime}")
    AnimeData getAnimeEspecifico(@PathVariable String anime) {
        return service.pesquisaAnimeEspecifico(anime);
    }

    @GetMapping("/listarTodos")
    List<AnimeData> getTodosAnimes() {
        return service.pegarTodosAnimes();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/trending")
    List<AnimeData> getTrendingAnimes() {
        return service.pesquisaPorRanking();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/categoria/{category}")
    List<AnimeData> getAnimesPorCategoria(@PathVariable String category) {
        return service.pesquisaAnimePorCategory(category);
    }

}
