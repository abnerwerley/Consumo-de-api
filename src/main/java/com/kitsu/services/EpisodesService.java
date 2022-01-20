package com.kitsu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.models.EpisodesData;
import com.kitsu.models.EpisodesResponse;

import reactor.core.publisher.Mono;

@Service
public class EpisodesService {

	private @Autowired WebClient webClientKitsu;
	
	public EpisodesData pesquisaEpisodio(String id) {
		Mono<EpisodesResponse> monoEpisodes = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/episodes/{id}", id)
				.retrieve()
				.bodyToMono(EpisodesResponse.class);

		EpisodesResponse response = monoEpisodes.block();

		return response.getData().get(0);
	}
	
	public List<EpisodesData> pesquisaEpisodiosPorId(String id) {
		Mono<EpisodesResponse> monoEpisodes = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/episodes/{id}", id)
				.retrieve()
				.bodyToMono(EpisodesResponse.class);

		EpisodesResponse response = monoEpisodes.block();

		return response.getData();
	}
	
	public List<EpisodesData> pegarTodosEpisodes() {
		System.out.println("Service");
		Mono<EpisodesResponse> monoEpisodes = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/episodes")
				.retrieve()
				.bodyToMono(EpisodesResponse.class);

		EpisodesResponse response = monoEpisodes.block();

		return response.getData();
	}
}
