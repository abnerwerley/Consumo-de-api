package com.kitsu.controllers;

import com.kitsu.manga.service.MangaService;
import com.kitsu.manga.model.MangaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manga")
public class MangaController {

    @Autowired
    private MangaService service;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/busca/{texto}")
    List<MangaData> getMangasPorTexto(@PathVariable String texto) {
        return service.pesquisaPorTexto(texto);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{manga}")
    MangaData getMangaEspecifico(@PathVariable String manga) {
        return service.pesquisaMangaEspecifico(manga);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/categoria/{category}")
    List<MangaData> getMangaPorCategory(@PathVariable String category) {
        return service.pesquiaMangaPorCategory(category);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/trending")
    List<MangaData> getTrendingMangas() {
        return service.pesquisaPorPopulares();
    }

}
