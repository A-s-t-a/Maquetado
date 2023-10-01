package com.example.maquetado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Jugos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugos);
    }



    public void volver(View view) {
        Intent intent = new Intent(this, Catalogo.class);
        startActivity(intent);
    }

    public void añadircarrito(View view) {
        Intent intent = new Intent(this, Catalogo.class);
        Toast.makeText(this, "Se ha añadido al carrito", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }
}