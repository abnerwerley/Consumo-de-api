package com.kitsu.manga.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MangaAttributes {

    private Date createdAt;
    private String slug;
    private String synopsis;
    private String canonicalTitle;
    private int popularityRank;
    private int ratingRank;
    private String status;
    private int chapterCount;
    private int volumeCount;

}
