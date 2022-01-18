package com.kitsu.models;

import java.util.Date;

public class AnimeAttributes {

	private Date createdAt;
	private String slug;
	private String description;
	private int popularityRank;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPopularityRank() {
		return popularityRank;
	}

	public void setPopularityRank(int popularityRank) {
		this.popularityRank = popularityRank;
	}

}
