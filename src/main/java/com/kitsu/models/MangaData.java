package com.kitsu.models;

public class MangaData {

	private String id;
	private String type;
	private MangaLinks links;
	private MangaAttributes attributes;
	private MangaRelationships relationships;

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

	public MangaLinks getLinks() {
		return links;
	}

	public void setLinks(MangaLinks links) {
		this.links = links;
	}

	public MangaAttributes getAttributes() {
		return attributes;
	}

	public void setAttributes(MangaAttributes attributes) {
		this.attributes = attributes;
	}

	public MangaRelationships getRelationships() {
		return relationships;
	}

	public void setRelationships(MangaRelationships relationships) {
		this.relationships = relationships;
	}

}