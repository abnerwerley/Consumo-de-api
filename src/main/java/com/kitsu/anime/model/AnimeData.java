package com.kitsu.anime.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimeData {

    private String id;
    private String type;
    private AnimeAttributes attributes;
    private AnimeEpisodes episodes;

}
