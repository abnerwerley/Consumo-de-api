package com.kitsu.models;

import java.util.List;

public class AnimeResponse extends AnimeData{

	private List<AnimeData> data;
	
	private List<EpisodeData> episode;

	public List<AnimeData> getData() {
		return data;
	}

	public void setData(List<AnimeData> data) {
		this.data = data;
	}

	public List<EpisodeData> getEpisode() {
		return episode;
	}

	public void setEpisode(List<EpisodeData> episode) {
		this.episode = episode;
	}


	
	
}
