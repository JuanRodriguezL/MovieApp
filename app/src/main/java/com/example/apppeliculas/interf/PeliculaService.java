package com.example.apppeliculas.interf;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PeliculaService {

    @GET("/3/movie/popular")
    Call<String> getCharacterList(@Query("api_key") String key/*,
                                  @Query("page") int page*/);
}
