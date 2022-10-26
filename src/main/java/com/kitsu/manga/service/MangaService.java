package com.kitsu.manga.service;

import java.util.List;

import com.kitsu.exception.RequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.manga.model.MangaData;
import com.kitsu.manga.model.MangaResponse;

import reactor.core.publisher.Mono;

@Service
@Slf4j
public class MangaService {

	private @Autowired WebClient webClientKitsu;

	public List<MangaData> getMangasByText(String texto){
		try {
			Mono<MangaResponse> monoManga = this.webClientKitsu
					.method(HttpMethod.GET)
					.uri("/manga?filter[text]={texto}", texto)
					.retrieve()
					.bodyToMono(MangaResponse.class);

			MangaResponse response = monoManga.block();

			return response.getData();
		}catch (Exception e){
			log.error("Error getting mangas by text.");
			throw new RequestException("Error getting mangas by text.");
		}
	}
	
	public MangaData getSpecificManga(String manga) {
		try {
			Mono<MangaResponse> monoManga = this.webClientKitsu
					.method(HttpMethod.GET)
					.uri("/manga?filter[text]={manga}", manga)
					.retrieve()
					.bodyToMono(MangaResponse.class);

			MangaResponse response = monoManga.block();

			return response.getData().get(0);
		} catch (Exception e) {
			log.error("Error geting popular mangas.");
			throw new RequestException("Error getting popular mangas.");
		}
	}

	public List<MangaData> getMangasByCategory(String category){
		try {
			Mono<MangaResponse> monoManga = this.webClientKitsu
					.method(HttpMethod.GET)
					.uri("/manga?filter[categories]={category}", category)
					.retrieve()
					.bodyToMono(MangaResponse.class);

			MangaResponse response = monoManga.block();

			return response.getData();
		}catch (Exception e) {
			log.error("Error getting manga by category.");
			throw new RequestException("Error getting manga by category.");
		}

	}
	
	public List<MangaData> getTrendingMangas(){
		try {
			Mono<MangaResponse> monoManga = this.webClientKitsu
					.method(HttpMethod.GET)
					.uri("/manga?sort=popularityRank")
					.retrieve()
					.bodyToMono(MangaResponse.class);

			MangaResponse response = monoManga.block();

			return response.getData();
		} catch (Exception e) {
			log.error("Error geting popular mangas.");
			throw new RequestException("Error getting popular mangas.");
		}

	}
	
}
