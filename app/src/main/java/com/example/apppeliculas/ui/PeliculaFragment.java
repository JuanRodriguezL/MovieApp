package com.example.apppeliculas.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.apppeliculas.R;
import com.example.apppeliculas.interf.ImvpPelicula;
import com.example.apppeliculas.presenter.PeliculaPresenter;


public class PeliculaFragment extends Fragment implements ImvpPelicula.View {
    ImvpPelicula.Presenter presenter;

    public PeliculaFragment() {
        // Required empty public constructor
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter = new PeliculaPresenter(this);
        presenter.ConsultarListaPeliculaP();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pelicula, container, false);
    }

    @Override
    public void RecyclerPeliculas() {

    }
}