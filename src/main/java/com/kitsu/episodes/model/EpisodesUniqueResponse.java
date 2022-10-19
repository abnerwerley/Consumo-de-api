package com.kitsu.episodes.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EpisodesUniqueResponse {

    EpisodesData data;

    public EpisodesData getData() {
        return data;
    }

}
