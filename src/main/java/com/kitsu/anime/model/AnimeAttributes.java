package com.kitsu.anime.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AnimeAttributes {

    private Date createdAt;
    private String slug;
    private String description;
    private int popularityRank;

}
