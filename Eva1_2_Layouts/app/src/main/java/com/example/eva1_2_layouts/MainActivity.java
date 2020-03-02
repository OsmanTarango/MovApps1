package com.example.eva1_2_layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtTxtNomb, edtTxtAp, edtTxtEdad;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Conectar Componentes
        edtTxtNomb = findViewById(R.id.edtTxtNomb);
        edtTxtAp = findViewById(R.id.edtTxtAp);
        edtTxtEdad = findViewById(R.id.edtTxtEdad);
        edtTxtAp.setText("¡Hola Mundo!");
    }
}
