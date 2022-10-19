package com.kitsu.anime.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnimeData {

    private String id;
    private String type;
    private AnimeLinks links;
    private AnimeAttributes attributes;
    private AnimeRelationships relationships;

}
