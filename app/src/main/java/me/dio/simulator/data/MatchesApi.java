package me.dio.simulator.data;

import java.util.List;

import me.dio.simulator.domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesApi {
//camada de acesso a dados está implementada
    @GET("matches.json")
    Call<List<Match>> getMatches();
}
