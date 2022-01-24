package com.kitsu.models;

import java.util.List;

public class EpisodesResponse {

	List<EpisodesData> data;
	
	public List<EpisodesData> getData() {
		return data;
	}

	public void setData(List<EpisodesData> data) {
		this.data = data;
	}
	
}
