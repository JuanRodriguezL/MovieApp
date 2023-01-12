package com.example.apppeliculas.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.apppeliculas.R;
import com.example.apppeliculas.interf.ImvpPelicula;


public class PeliculaFragment  extends Fragment implements ImvpPelicula.View {


    public PeliculaFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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