package com.ejemplo.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{
    private TextView txtUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main2);
        getSupportActionBar().hide();

        txtUsuario = findViewById (R.id.txtusuario);
        txtUsuario.setText ("Hola "+getIntent ().getStringExtra ("Usuario"));
    }
}