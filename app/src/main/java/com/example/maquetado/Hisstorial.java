package com.example.maquetado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Hisstorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hisstorial);
    }

    public void volver(View view) {
        Intent intent = new Intent(this, Catalogo.class);
        startActivity(intent);
    }

    public void borrarhistorial(View view) {
        Intent intent = new Intent(this, Catalogo.class);
        Toast.makeText(this, "Historial Borrado", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }



}