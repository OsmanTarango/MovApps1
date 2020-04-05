package com.example.eva2_7_bundles_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {
    TextView txtVwDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        txtVwDatos = findViewById(R.id.txtVwDatos);


        Intent inDatos = getIntent();
        Bundle bundle = inDatos.getExtras();
        String datos = inDatos.getStringExtra("DATOS");
        double numero = inDatos.getDoubleExtra("Datillos", 0.0);
        txtVwDatos.setText(datos);
        txtVwDatos.append("\n");
        txtVwDatos.append(bundle.getString("El_Bundle"));

    }
}
