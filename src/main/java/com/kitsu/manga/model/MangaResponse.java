package com.kitsu.manga.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class MangaResponse {

    private List<MangaData> data;

    public List<MangaData> getData() {
        return data;
    }

}
