package com.example.apppeliculas.entidad;

import com.google.gson.annotations.SerializedName;

public class PeliculaEntidades {
    @SerializedName("backdrop_path")
    String backdropPath;
    @SerializedName("original_title")
    String originalTitle;
    String overview;
    @SerializedName("release_date")
    String releaseDate;

}
