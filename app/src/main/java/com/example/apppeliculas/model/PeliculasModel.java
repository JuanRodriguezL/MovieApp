package com.example.apppeliculas.model;

import com.example.apppeliculas.entidad.PeliculasInfo;
import com.example.apppeliculas.interf.ImvpPelicula;
import com.example.apppeliculas.interf.PeliculaService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PeliculasModel implements ImvpPelicula.Model {
    ImvpPelicula.Presenter presenter;
    String ApiKey = "323ec36a8c772aafdd22991235ba0ce5";

    PeliculasInfo peliculasInfo;

    public PeliculasModel(ImvpPelicula.Presenter presenterP) {
        this.presenter = presenterP;
    }


    @Override
    public void ConsultarListaPeliculaM() {
        peliculasInfo = new PeliculasInfo();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PeliculaService peliculaService = retrofit.create(PeliculaService.class);
        Call<PeliculasInfo> call = peliculaService.getCharacterList(ApiKey);
        call.enqueue(new Callback<PeliculasInfo>() {
            @Override
            public void onResponse(Call<PeliculasInfo> call, Response<PeliculasInfo> response) {
                peliculasInfo = response.body();
                presenter.RecyclerPeliculaP(peliculasInfo);
            }

            @Override
            public void onFailure(Call<PeliculasInfo> call, Throwable t) {

            }
        });


    }
}
