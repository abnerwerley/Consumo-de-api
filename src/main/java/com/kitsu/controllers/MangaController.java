package com.kitsu.controllers;

import com.kitsu.manga.MangaService;
import com.kitsu.manga.model.MangaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/{manga}")
    public ResponseEntity<MangaData> getMangaEspecifico(@PathVariable String manga) {
        MangaData mangaEspecifico = this.mangaService.pesquisaMangaEspecifico(manga);
        return ResponseEntity.ok(mangaEspecifico);
    }

    @GetMapping("/categoria/{category}")
    public ResponseEntity<List<MangaData>> getMangaPorCategory(@PathVariable String category) {
        List<MangaData> mangasDaCategory = this.mangaService.pesquiaMangaPorCategory(category);
        return ResponseEntity.ok(mangasDaCategory);
    }

    @GetMapping("/trending")
    public ResponseEntity<List<MangaData>> getTrendingMangas() {

        List<MangaData> mangasPopoulares = this.mangaService.pesquisaPorPopulares();
        return ResponseEntity.ok(mangasPopoulares);
    }

}
