package com.kitsu.models;

import java.util.Date;

public class AnimeAttributes {

	private Date createdAt;
	private String slug;
	private String synopsis;
	private String description;
	private AnimeTitles titles;
	private String canonicalTitle;
	private String averageRating;
	private int popularityRank;
	private int ratingRank;
	private String status;
	private int episodeCount;
	private String youtubeVideoId;
	
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
	public AnimeTitles getTitles() {
		return titles;
	}
	public void setTitles(AnimeTitles titles) {
		this.titles = titles;
	}
	public String getCanonicalTitle() {
		return canonicalTitle;
	}
	public void setCanonicalTitle(String canonicalTitle) {
		this.canonicalTitle = canonicalTitle;
	}
	
	public String getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(String averageRating) {
		this.averageRating = averageRating;
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
	public int getEpisodeCount() {
		return episodeCount;
	}
	public void setEpisodeCount(int episodeCount) {
		this.episodeCount = episodeCount;
	}
	public String getYoutubeVideoId() {
		return youtubeVideoId;
	}
	public void setYoutubeVideoId(String youtubeVideoId) {
		this.youtubeVideoId = youtubeVideoId;
	}
	
	
}
