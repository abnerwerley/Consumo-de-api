package com.kitsu.anime.service;

import com.kitsu.anime.model.AnimeData;
import com.kitsu.anime.model.AnimeResponse;
import com.kitsu.exception.RequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@Slf4j
public class AnimeService {

    private @Autowired WebClient webClientKitsu;

    public List<AnimeData> getAnimesByText(String texto) {
        try {
            Mono<AnimeResponse> monoAnime = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/anime?filter[text]={texto}", texto)
                    .retrieve()
                    .bodyToMono(AnimeResponse.class);

            AnimeResponse response = monoAnime.block();

            return response.getData();
        } catch (Exception e) {
            log.error("Error getting anime by text.");
            throw new RequestException("Error getting anime by text.");
        }
    }

    public List<AnimeData> getTrendingAnimes() {
        try {
            Mono<AnimeResponse> monoAnime = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/anime?sort=popularityRank")
                    .retrieve()
                    .bodyToMono(AnimeResponse.class);

            AnimeResponse response = monoAnime.block();

            return response.getData();
        } catch (Exception e) {
            log.error("Error geting popular animes.");
            throw new RequestException("Error getting popular animes.");
        }
    }

    public List<AnimeData> getAllAnimes() {
        try {
            Mono<AnimeResponse> monoAnime = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/anime")
                    .retrieve()
                    .bodyToMono(AnimeResponse.class);

            AnimeResponse response = monoAnime.block();

            return response.getData();
        } catch (Exception e) {
            log.error("Error getting all animes.");
            throw new RequestException("Error getting all animes.");
        }
    }


    public AnimeData getSpecificAnime(String anime) {
        try {
            Mono<AnimeResponse> monoAnime = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/anime?filter[text]={anime}", anime)
                    .retrieve()
                    .bodyToMono(AnimeResponse.class);

            AnimeResponse response = monoAnime.block();

            return response.getData().get(0);
        } catch (Exception e) {
            log.error("Error getting a specific anime.");
            throw new RequestException("Error getting a specific anime.");
        }
    }

    public List<AnimeData> getAnimesByCategory(String category) {
        try {
            Mono<AnimeResponse> monoAnime = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/anime?filter[categories]={category}", category)
                    .retrieve()
                    .bodyToMono(AnimeResponse.class);

            AnimeResponse response = monoAnime.block();

            return response.getData();
        } catch (Exception e) {
            log.error("Error getting anime by category.");
            throw new RequestException("Error getting anime by category.");
        }
    }
}

