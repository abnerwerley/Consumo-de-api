package com.kitsu.models;

public class MangaRelationships {

	private MangaGenres genres;
	private MangaCategories categories;
	private MangaChapters chapters;

	public MangaGenres getGenres() {
		return genres;
	}

	public void setGenres(MangaGenres genres) {
		this.genres = genres;
	}

	public MangaCategories getCategories() {
		return categories;
	}

	public void setCategories(MangaCategories categories) {
		this.categories = categories;
	}

	public MangaChapters getChapters() {
		return chapters;
	}

	public void setChapters(MangaChapters chapters) {
		this.chapters = chapters;
	}

}
