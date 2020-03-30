package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Desicion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desicion);
    }
    public void Siguiente (View view){
        Intent siguiente = new Intent(this,calendario.class);
        startActivity(siguiente);
    }
    public void Anterior (View view){
        Intent anterior = new Intent(this,Frase.class);
        startActivity(anterior);
    }
}
