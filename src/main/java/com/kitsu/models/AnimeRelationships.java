package com.kitsu.models;

public class AnimeRelationships {

	private AnimeEpisodes episodes;
	private AnimeStreamingLinks streamingLinks;
	public AnimeEpisodes getEpisodes() {
		return episodes;
	}
	public void setEpisodes(AnimeEpisodes episodes) {
		this.episodes = episodes;
	}
	public AnimeStreamingLinks getStreamingLinks() {
		return streamingLinks;
	}
	public void setStreamingLinks(AnimeStreamingLinks streamingLinks) {
		this.streamingLinks = streamingLinks;
	}
	
}
