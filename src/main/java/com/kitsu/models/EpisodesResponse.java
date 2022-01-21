package com.kitsu.models;

import java.util.List;

public class EpisodesResponse {

	List<EpisodesData> data;

	EpisodesData episode ;

	
	public List<EpisodesData> getData() {
		return data;
	}

	public void setData(List<EpisodesData> data) {
		this.data = data;
	}

	public EpisodesData getEpidose() {
		return episode;
	}

	public void setEpidose(EpisodesData epidose) {
		this.episode = epidose;
	}
	
	
}
