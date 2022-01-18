package com.kitsu.models;

import java.util.List;

public class AnimeResponse {

	private List<AnimeCustom> data;

	public List<AnimeCustom> getData() {
		return data;
	}

	public void setData(List<AnimeCustom> data) {
		this.data = data;
	}
}
