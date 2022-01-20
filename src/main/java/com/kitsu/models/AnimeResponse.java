package com.kitsu.models;

import java.util.List;

public class AnimeResponse{

	private List<AnimeData> data;
	
	private List<EpisodesData> episode;

	public List<AnimeData> getData() {
		return data;
	}

	public void setData(List<AnimeData> data) {
		this.data = data;
	}

	public List<EpisodesData> getEpisode() {
		return episode;
	}

	public void setEpisode(List<EpisodesData> episode) {
		this.episode = episode;
	}


	
	
}
