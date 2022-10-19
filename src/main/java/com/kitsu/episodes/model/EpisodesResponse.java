package com.kitsu.episodes.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EpisodesResponse {

    List<EpisodesData> data;

    public List<EpisodesData> getData() {
        return data;
    }

}
