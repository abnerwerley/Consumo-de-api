package com.kitsu.anime;

import com.kitsu.anime.model.AnimeData;
import com.kitsu.anime.model.AnimeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class AnimeService {

    private @Autowired WebClient webClientKitsu;

    public List<AnimeData> pesquisaPorTexto(String texto) {
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

    public List<AnimeData> pesquisaAnimePorCategory(String category) {
        Mono<AnimeResponse> monoAnime = this.webClientKitsu
                .method(HttpMethod.GET)
                .uri("/anime?filter[categories]={category}", category)
                .retrieve()
                .bodyToMono(AnimeResponse.class);

        AnimeResponse response = monoAnime.block();

        return response.getData();
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

