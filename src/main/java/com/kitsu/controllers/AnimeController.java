package com.kitsu.controllers;

import com.kitsu.anime.AnimeService;
import com.kitsu.anime.model.AnimeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private @Autowired AnimeService animeService;

    @GetMapping("/busca/{texto}")
    public ResponseEntity<List<AnimeData>> getAnimesPorTexto(@PathVariable String texto) {

        List<AnimeData> animesDoTexto = this.animeService.pesquisaPorTexto(texto);

        return ResponseEntity.ok(animesDoTexto);
    }

    @GetMapping("/{anime}")
    public ResponseEntity<AnimeData> getAnimeEspecifico(@PathVariable String anime) {

        AnimeData animeEspecifico = this.animeService.pesquisaAnimeEspecifico(anime);
        return ResponseEntity.ok(animeEspecifico);
    }

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

    @GetMapping("/categoria/{category}")
    public ResponseEntity<List<AnimeData>> getAnimesPorCategoria(@PathVariable String category) {

        List<AnimeData> animes = this.animeService.pesquisaAnimePorCategory(category);

        return ResponseEntity.ok(animes);
    }

}
