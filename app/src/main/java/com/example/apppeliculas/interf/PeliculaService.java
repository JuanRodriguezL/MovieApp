package com.example.apppeliculas.interf;

import com.example.apppeliculas.entidad.PeliculaEntidades;
import com.example.apppeliculas.entidad.PeliculasInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PeliculaService {

    @GET("/3/movie/popular")
    Call<PeliculasInfo> getCharacterList(@Query("api_key") String key/*,
                                  @Query("page") int page*/);
}
