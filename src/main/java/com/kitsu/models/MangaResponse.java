package com.kitsu.models;

import java.util.List;

public class MangaResponse extends MangaData{

	private List<MangaData> data;

	public List<MangaData> getData() {
		return data;
	}

	public void setData(List<MangaData> data) {
		this.data = data;
	}
	
	
}
