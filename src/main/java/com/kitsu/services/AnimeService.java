package com.kitsu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.models.AnimeData;
import com.kitsu.models.AnimeResponse;

import reactor.core.publisher.Mono;

@Service
public class AnimeService {

	private @Autowired WebClient webClientKitsu;
	
	public AnimeData pesquisaPorFiltro(String texto) {
		Mono<AnimeResponse> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/anime?filter[text]={texto}", texto)
				.retrieve()
				.bodyToMono(AnimeResponse.class);

		AnimeResponse response = monoAnime.block();

		return response.getData().get(0);
	}
}

