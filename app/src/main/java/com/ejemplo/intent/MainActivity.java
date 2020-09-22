package com.ejemplo.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private EditText edtUsuario;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        getSupportActionBar().hide();

        edtUsuario = findViewById (R.id.usuario);
        findViewById (R.id.ingresar).setOnClickListener (new View.OnClickListener ()
        {
            @Override
            public void onClick(View v)
            {
                if(edtUsuario.getText ().toString ().equals (""))
                {
                    Toast.makeText (getApplicationContext (),"Ingrese un Nombre",Toast.LENGTH_SHORT).show ();
                }
                else
                {
                    enviarDatos();
                    edtUsuario.setText ("");

                }
            }
        });
    }
    private void enviarDatos()
    {
        Intent i = new Intent (this, MainActivity2.class);
        i.putExtra ("Usuario",edtUsuario.getText ().toString ());
        startActivity (i);

    }
}