package com.example.apppeliculas.interf;

public interface ImvpPelicula {


    interface  View{
        void RecyclerPeliculas();
    }

    interface  Presenter{
        void RecyclerPeliculaP();
        void ConsultarListaPeliculaP();
    }

    interface  Model{
        void ConsultarListaPeliculaM();
    }
}
