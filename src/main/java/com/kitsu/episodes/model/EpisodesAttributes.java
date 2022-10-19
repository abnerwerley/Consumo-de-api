package com.kitsu.episodes.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EpisodesAttributes {

    public Date createdAt;
    public Date updatedAt;
    public String synopsis;
    public String description;
    public EpisodesTitles titles;
    public String canonicalTitle;
    public int seasonNumber;
    public int number;
    public int relativeNumber;
    public String airdate;
    public int length;


}
