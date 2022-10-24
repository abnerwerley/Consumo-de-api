package com.kitsu.episodes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EpisodesUniqueResponse {

    private EpisodesData data;

    public EpisodesData getData() {
        return data;
    }

}
