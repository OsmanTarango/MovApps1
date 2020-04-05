package com.example.eva2_7_bundles_extras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Button.OnClickListener {
    Button btnLanzar;
    EditText edtTxtDatos;
    Intent intento;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLanzar = findViewById(R.id.btnLanzar);
        edtTxtDatos = findViewById(R.id.edtTxtDatos);
        btnLanzar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String cadena = edtTxtDatos.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("El_Bundle",cadena);
        bundle.putInt("El_Entero",10);
        intento = new Intent(this,SecondaryActivity.class);

        intento.putExtra("DATOS",cadena);
        intento.putExtra("Datillos",11.5);
        intento.putExtras(bundle);
        startActivity(intento);
    }
}
