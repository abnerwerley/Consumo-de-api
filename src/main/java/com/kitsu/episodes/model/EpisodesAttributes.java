package com.kitsu.episodes.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EpisodesAttributes {

    private Date createdAt;
    private Date updatedAt;
    private String synopsis;
    private String description;
    private EpisodesTitles titles;
    private String canonicalTitle;
    private int seasonNumber;
    private int number;
    private int relativeNumber;
    private String airdate;
    private int length;


}
