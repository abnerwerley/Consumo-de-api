package com.kitsu.models;

import java.util.Date;

public class MangaAttributes {

	private Date createdAt;
	private String slug;
	private String synopsis;
	private String canonicalTitle;
	private int popularityRank;
	private int ratingRank;
	private String status;
	private int chapterCount;
	private int volumeCount;

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

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCanonicalTitle() {
		return canonicalTitle;
	}

	public void setCanonicalTitle(String canonicalTitle) {
		this.canonicalTitle = canonicalTitle;
	}

	public int getPopularityRank() {
		return popularityRank;
	}

	public void setPopularityRank(int popularityRank) {
		this.popularityRank = popularityRank;
	}

	public int getRatingRank() {
		return ratingRank;
	}

	public void setRatingRank(int ratingRank) {
		this.ratingRank = ratingRank;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getChapterCount() {
		return chapterCount;
	}

	public void setChapterCount(int chapterCount) {
		this.chapterCount = chapterCount;
	}

	public int getVolumeCount() {
		return volumeCount;
	}

	public void setVolumeCount(int volumeCount) {
		this.volumeCount = volumeCount;
	}

}
