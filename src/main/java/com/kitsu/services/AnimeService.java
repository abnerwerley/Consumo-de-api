package com.kitsu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.models.AnimeData;
import com.kitsu.models.AnimeResponse;
//import com.kitsu.models.EpisodeData;

import reactor.core.publisher.Mono;

@Service
public class AnimeService {

	private @Autowired WebClient webClientKitsu;
	
	public List<AnimeData> pesquisaPorFiltro(String texto) {
		Mono<AnimeResponse> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/anime?filter[text]={texto}", texto)
				.retrieve()
				.bodyToMono(AnimeResponse.class);

		AnimeResponse response = monoAnime.block();

		return response.getData();
	}
	
	public List<AnimeData> pesquisaPorRanking() {
		Mono<AnimeResponse> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/anime?sort=popularityRank")
				.retrieve()
				.bodyToMono(AnimeResponse.class);

		AnimeResponse response = monoAnime.block();

		return response.getData();
	}
	
	public List<AnimeData> pegarTodosAnimes() {
		Mono<AnimeResponse> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/anime")
				.retrieve()
				.bodyToMono(AnimeResponse.class);

		AnimeResponse response = monoAnime.block();

		return response.getData();
	}
	
	
	public AnimeData pesquisaAnimeEspecifico(String anime) {
		Mono<AnimeResponse> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/anime?filter[text]={anime}", anime)
				.retrieve()
				.bodyToMono(AnimeResponse.class);

		AnimeResponse response = monoAnime.block();

		return response.getData().get(0);
	}
	/*
	public List<EpisodeData> pesquisaEpisodio(String id) {
		Mono<AnimeResponse> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/episodes/{id}", id)
				.retrieve()
				.bodyToMono(AnimeResponse.class);

		AnimeResponse response = monoAnime.block();

		return response.getEpisode();
	}
	*/
	
}

