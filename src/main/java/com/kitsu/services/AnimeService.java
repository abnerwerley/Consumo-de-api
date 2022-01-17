package com.kitsu.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.kitsu.models.Anime;

import reactor.core.publisher.Mono;

@Service
public class AnimeService {

	private @Autowired WebClient webClientKitsu;
	
	public Anime pesquisaPorFiltro(String texto) {
		Mono<Anime> monoAnime = this.webClientKitsu
				.method(HttpMethod.GET)
				.uri("/anime?filter[text]={texto}", texto)
				.retrieve()
				.bodyToMono(Anime.class);

		monoAnime.subscribe(anime->{
			System.out.println("Terminou.");
			System.out.println(monoAnime);
			
		});
			return null;
	}
}
