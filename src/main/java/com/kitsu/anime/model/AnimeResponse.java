package com.kitsu.anime.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class AnimeResponse {

    private List<AnimeData> data;

}
