package com.kitsu.models;

import java.util.List;

public class EpisodesResponse {

	List<EpisodesData> episodes;

	EpisodesData episode ;
	
	public List<EpisodesData> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<EpisodesData> episodes) {
		this.episodes = episodes;
	}

	public EpisodesData getEpidose() {
		return episode;
	}

	public void setEpidose(EpisodesData epidose) {
		this.episode = epidose;
	}
	
	
}
