package com.example.maquetado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Catalogo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
    }

    public void jugos(View view) {
        Intent intent = new Intent(this, Jugos.class);
        startActivity(intent);
    }
    public void mantequilla(View view) {
        Intent intent = new Intent(this, Mantequillas.class);
        startActivity(intent);
    }
    public void dulceleche(View view) {
        Intent intent = new Intent(this, Dulceleche.class);
        startActivity(intent);
    }
    public void cremas(View view) {
        Intent intent = new Intent(this, Crema.class);
        startActivity(intent);
    }

    public void yogurt(View view) {
        Intent intent = new Intent(this, Yoghurt.class);
        startActivity(intent);
    }

    public void leches(View view) {
        Intent intent = new Intent(this, Leches.class);
        startActivity(intent);
    }

    public void carrito(View view) {
        Intent intent = new Intent(this, Carritoo.class);
        startActivity(intent);
    }

    public void cerrar(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void historial(View view) {
        Intent intent = new Intent(this, Hisstorial.class);
        startActivity(intent);
    }
}