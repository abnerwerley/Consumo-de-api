package com.kitsu.episodes.service;

import com.kitsu.episodes.model.EpisodesData;
import com.kitsu.episodes.model.EpisodesResponse;
import com.kitsu.episodes.model.EpisodesUniqueResponse;
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
public class EpisodesService {

    private @Autowired WebClient webClientKitsu;

    public EpisodesData getEpisodeById(String id) {
        try {
            Mono<EpisodesUniqueResponse> monoEpisodes = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/episodes/{id}", id)
                    .retrieve()
                    .bodyToMono(EpisodesUniqueResponse.class);

            EpisodesUniqueResponse response = monoEpisodes.block();

            return response.getData();
        } catch (Exception e) {
            log.error("Error getting episode by id.");
            throw new RequestException("Error getting episode by id.");
        }
    }

    public List<EpisodesData> getAllEpisodes() {
        try {
            Mono<EpisodesResponse> monoEpisodes = this.webClientKitsu
                    .method(HttpMethod.GET)
                    .uri("/episodes")
                    .retrieve()
                    .bodyToMono(EpisodesResponse.class);

            EpisodesResponse response = monoEpisodes.block();

            return response.getData();
        } catch (Exception e) {
            log.error("Error getting all episodes.");
            throw new RequestException("Error getting all episodes.");
        }

    }
}
