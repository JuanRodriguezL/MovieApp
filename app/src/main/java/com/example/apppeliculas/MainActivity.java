package com.example.apppeliculas;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.apppeliculas.ui.PeliculaFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = findViewById(R.id.navigationOption);
        navigation.setOnItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.pelicuf:
                    replaceFragment(new PeliculaFragment());
                    break;


            }

            return true;
        });


    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fragment).addToBackStack(null).commit();
    }
}
