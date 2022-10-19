package com.kitsu.manga.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MangaLinks {
    private String self;
    private String related;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

}
