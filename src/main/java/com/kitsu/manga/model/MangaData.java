package com.kitsu.manga.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MangaData {

    private String id;
    private String type;
    private MangaLinks links;
    private MangaAttributes attributes;
    private MangaRelationships relationships;

}