package com.example.appprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText etn;
    private EditText etu;
    private EditText etc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //MÉTODO BOTON SIGUIENTE//
    public void Siguieten(View view){
        Intent siguiente = new Intent(this,Frase.class);
        startActivity(siguiente);
    }
}
