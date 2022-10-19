package com.kitsu.manga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.manga.model.MangaData;
import com.kitsu.manga.model.MangaResponse;

import reactor.core.publisher.Mono;

@Service
public class MangaService {

	private @Autowired WebClient webClientKitsu;

	public List<MangaData> pesquisaPorTexto(String texto){
		Mono<MangaResponse> monoManga = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/manga?filter[text]={texto}", texto)
				.retrieve()
				.bodyToMono(MangaResponse.class);
		
		MangaResponse response = monoManga.block();
		
		return response.getData();
	}
	
	public MangaData pesquisaMangaEspecifico(String manga) {
		Mono<MangaResponse> monoManga = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/manga?filter[text]={manga}", manga)
				.retrieve()
				.bodyToMono(MangaResponse.class);

		MangaResponse response = monoManga.block();

		return response.getData().get(0);
	}

	public List<MangaData> pesquiaMangaPorCategory(String category){
		Mono<MangaResponse> monoManga = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/manga?filter[categories]={category}", category)
				.retrieve()
				.bodyToMono(MangaResponse.class);
		
		MangaResponse response = monoManga.block();
		
		return response.getData();
	}
	
	public List<MangaData> pesquisaPorPopulares(){
		Mono<MangaResponse> monoManga = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/manga?sort=popularityRank")
				.retrieve()
				.bodyToMono(MangaResponse.class);
		
		MangaResponse response = monoManga.block();
		
		return response.getData();
	}
	
}
