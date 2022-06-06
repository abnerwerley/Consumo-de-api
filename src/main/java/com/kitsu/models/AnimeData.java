package com.kitsu.models;

public class AnimeData {

	private String id;
	private String type;
	private AnimeLinks links;
	private AnimeAttributes attributes;
	private AnimeRelationships relationships;
	
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
	public AnimeLinks getLinks() {
		return links;
	}
	public void setLinks(AnimeLinks links) {
		this.links = links;
	}
	public AnimeAttributes getAttributes() {
		return attributes;
	}
	public void setAttributes(AnimeAttributes attributes) {
		this.attributes = attributes;
	}
	public AnimeRelationships getRelationships() {
		return relationships;
	}
	public void setRelationships(AnimeRelationships relationships) {
		this.relationships = relationships;
	}
	
}
