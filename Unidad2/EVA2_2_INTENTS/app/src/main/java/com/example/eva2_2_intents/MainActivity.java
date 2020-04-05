package com.example.eva2_2_intents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Intent intento;
    EditText editTelefono;
    Button btnMarcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTelefono = findViewById(R.id.ediNumero);
        btnMarcar = findViewById(R.id.btnMarcar);
    }

    public void onClick(View view) {
        String numero = "tel:" + editTelefono.getText().toString();
        if (view.getId() == R.id.btnMarcar){
            intento = new Intent(Intent.ACTION_DIAL, Uri.parse(numero));
        }else{
            intento = new Intent(Intent.ACTION_CALL, Uri.parse(numero));
        }
        startActivity(intento);

    }
}
