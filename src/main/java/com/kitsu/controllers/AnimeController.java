package com.kitsu.controllers;

import com.kitsu.anime.model.AnimeData;
import com.kitsu.anime.service.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anime")
public class AnimeController {

    private @Autowired AnimeService service;

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/get/{text}")
    List<AnimeData> getAnimesByText(@PathVariable String text) {
        return service.getAnimesByText(text);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/{anime}")
    AnimeData getSpecificAnime(@PathVariable String anime) {
        return service.getSpecificAnime(anime);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/listAll")
    List<AnimeData> getAllAnimes() {
        return service.getAllAnimes();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/trending")
    List<AnimeData> getTrendingAnimes() {
        return service.getTrendingAnimes();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping("/category/{category}")
    List<AnimeData> getAnimesByCategory(@PathVariable String category) {
        return service.getAnimesByCategory(category);
    }

}
