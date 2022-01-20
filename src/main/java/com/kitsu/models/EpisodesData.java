package com.kitsu.models;

public class EpisodesData {

	public String id;
	public String type;
	public EpisodesAttributes attributes;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public EpisodesAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(EpisodesAttributes attributes) {
		this.attributes = attributes;
	}

}
