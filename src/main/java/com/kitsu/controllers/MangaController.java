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
    @GetMapping("/get/{text}")
    List<MangaData> getMangasByText(@PathVariable String text) {
        return service.getMangasByText(text);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{manga}")
    MangaData getSpecificManga(@PathVariable String manga) {
        return service.getSpecificManga(manga);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/category/{category}")
    List<MangaData> getMangasByCategory(@PathVariable String category) {
        return service.getMangasByCategory(category);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/trending")
    List<MangaData> getTrendingMangas() {
        return service.getTrendingMangas();
    }

}
