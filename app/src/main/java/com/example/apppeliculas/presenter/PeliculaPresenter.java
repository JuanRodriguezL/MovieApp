package com.example.apppeliculas.presenter;

import com.example.apppeliculas.interf.ImvpPelicula;
import com.example.apppeliculas.model.PeliculasModel;

public class PeliculaPresenter implements ImvpPelicula.Presenter {

    ImvpPelicula.View viewC;
    ImvpPelicula.Model modelC;

    public  PeliculaPresenter(ImvpPelicula.View viewI){
        this.viewC = viewI;
        modelC = new PeliculasModel(this);

    }

    @Override
    public void RecyclerPeliculaP() {

    }

    @Override
    public void ConsultarListaPeliculaP() {
        if (modelC != null) {
            modelC.ConsultarListaPeliculaM();
        }
    }
}
