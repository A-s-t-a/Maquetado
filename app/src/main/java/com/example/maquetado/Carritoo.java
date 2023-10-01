package com.example.maquetado;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Carritoo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carritoo);

    }

    public void volver(View view) {
        Intent intent = new Intent(this, Catalogo.class);
        startActivity(intent);
    }

    public void pagarcarrito(View view) {
        Intent intent = new Intent(this, Catalogo.class);
        Toast.makeText(this, "Pedido Pagado :v", Toast.LENGTH_SHORT).show();

        startActivity(intent);
    }



}