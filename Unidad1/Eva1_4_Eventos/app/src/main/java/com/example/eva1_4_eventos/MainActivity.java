package com.example.eva1_4_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnListener;
    Button btnClaseAnon;
    Button btnPorClase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btnListener = findViewById(R.id.btnListener);
    btnListener.setOnClickListener(this);

    btnClaseAnon = findViewById(R.id.btnClaseAnon);
    btnClaseAnon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText( getApplicationContext(), "Evento por Clase Anonima", Toast.LENGTH_LONG).show();
        }
    });

        btnPorClase = findViewById(R.id.btnPorClase);
        btnPorClase.setOnClickListener(new MiClickListener(getApplicationContext()));

    }

    public void miClick (View v) {
        Toast.makeText( this, "Evento por XML", Toast.LENGTH_LONG).show();
}

    @Override
    public void onClick(View v) {
        Toast.makeText( this, "Evento por Listener", Toast.LENGTH_LONG).show();
    }
}
