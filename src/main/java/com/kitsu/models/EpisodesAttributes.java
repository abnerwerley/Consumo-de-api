package com.kitsu.models;

import java.util.Date;

public class EpisodesAttributes {

	public Date createdAt;
	public Date updatedAt;
	public String synopsis;
	public String description;
	public EpisodesTitles titles;
	public String canonicalTitle;
	public int seasonNumber;
	public int number;
	public int relativeNumber;
	public String airdate;
	public int length;

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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

	public EpisodesTitles getTitles() {
		return titles;
	}

	public void setTitles(EpisodesTitles titles) {
		this.titles = titles;
	}

	public String getCanonicalTitle() {
		return canonicalTitle;
	}

	public void setCanonicalTitle(String canonicalTitle) {
		this.canonicalTitle = canonicalTitle;
	}

	public int getSeasonNumber() {
		return seasonNumber;
	}

	public void setSeasonNumber(int seasonNumber) {
		this.seasonNumber = seasonNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getRelativeNumber() {
		return relativeNumber;
	}

	public void setRelativeNumber(int relativeNumber) {
		this.relativeNumber = relativeNumber;
	}

	public String getAirdate() {
		return airdate;
	}

	public void setAirdate(String airdate) {
		this.airdate = airdate;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

}
