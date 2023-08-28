package com.example.movilestp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.movilestp3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> lista= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        cargarDatos();
        generarListView();
    }

    public void generarListView(){
        ArrayAdapter<Inmueble> adapter= new ListaAdapter(this,R.layout.item,lista, getLayoutInflater());
        ListView lv=findViewById(R.id.lvLista);
        lv.setAdapter(adapter);
    }
    public void cargarDatos(){
        lista.add(new Inmueble(R.drawable.casa, "Merlo", 1000000));
        lista.add(new Inmueble(R.drawable.casa3, "Carpintería", 1200000));
        lista.add(new Inmueble(R.drawable.casa2, "Los molles", 2000000));
    }
}