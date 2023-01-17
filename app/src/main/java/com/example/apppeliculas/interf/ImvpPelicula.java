package com.example.apppeliculas.interf;

import com.example.apppeliculas.entidad.PeliculasInfo;

public interface ImvpPelicula {


    interface  View{
        void RecyclerPeliculas(PeliculasInfo peliculasInfo);
    }

    interface  Presenter{
        void RecyclerPeliculaP(PeliculasInfo peliculasInfo);
        void ConsultarListaPeliculaP();
    }

    interface  Model{
        void ConsultarListaPeliculaM();
    }
}
