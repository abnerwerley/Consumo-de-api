package com.kitsu.episodes;

import com.kitsu.episodes.model.EpisodesData;
import com.kitsu.episodes.model.EpisodesResponse;
import com.kitsu.episodes.model.EpisodesUniqueResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class EpisodesService {

    private @Autowired WebClient webClientKitsu;

    public EpisodesData pesquisaEpisodio(String id) {
        Mono<EpisodesUniqueResponse> monoEpisodes = this.webClientKitsu
                .method(HttpMethod.GET)
                .uri("/episodes/{id}", id)
                .retrieve()
                .bodyToMono(EpisodesUniqueResponse.class);

        EpisodesUniqueResponse response = monoEpisodes.block();

        return response.getData();
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
        Mono<EpisodesResponse> monoEpisodes = this.webClientKitsu
                .method(HttpMethod.GET)
                .uri("/episodes")
                .retrieve()
                .bodyToMono(EpisodesResponse.class);

        EpisodesResponse response = monoEpisodes.block();

        return response.getData();
    }
}
