package com.kitsu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.models.EpisodesData;
import com.kitsu.models.EpisodesResponse;
import com.kitsu.models.EpisodesUniqueResponse;

import reactor.core.publisher.Mono;

@Service
public class EpisodesService {

	private @Autowired WebClient webClientKitsu;
	
	public Optional<EpisodesData> pesquisaEpisodio(String id) {
		Mono<EpisodesUniqueResponse> monoEpisodes = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/episodes/{id}", id)
				.retrieve()
				.bodyToMono(EpisodesUniqueResponse.class);

		EpisodesUniqueResponse response = monoEpisodes.block();

		return Optional.of(response.getData());
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