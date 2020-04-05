package com.example.eva2_4_intentos_explicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Intent cambiar;
    Button btnIr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnIr = findViewById(R.id.btnIr);
        Intent inIntento = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:5555"));
    }

    public void onClick(View w) {
        cambiar = new Intent(this, Main2Activity.class);
        startActivity(cambiar);
    }

}
