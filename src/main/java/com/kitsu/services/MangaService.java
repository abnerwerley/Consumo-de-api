package com.kitsu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.models.MangaData;
import com.kitsu.models.MangaResponse;

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
