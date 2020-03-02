package com.example.eva1_6_idioma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    RadioButton rbEs, rbEn;
    EditText etNomb, etAp, etEdad;
    RadioGroup rgIdioma;
    TextView txtTitulo, txtNomb, txtAp, txtEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbEs = findViewById(R.id.rbEs);
        rbEn = findViewById(R.id.rbEn);
        etNomb = findViewById(R.id.etNomb);
        etEdad = findViewById(R.id.etEdad);
        etAp = findViewById(R.id.etAp);
        txtNomb = findViewById(R.id.txtNomb);
        txtEdad = findViewById(R.id.txtEdad);
        txtAp = findViewById(R.id.txtAp);
        txtTitulo = findViewById(R.id.txtTitulo);
        rgIdioma = findViewById(R.id.rgIdioma);

        rgIdioma.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        if (checkedId == R.id.rbEs) {
           txtTitulo.setText(R.string.idioma_es);
           rbEs.setText(R.string.rdEsEs);
           rbEn.setText(R.string.rdEnEs);
            txtNomb.setText(R.string.txtNombEs);
            txtAp.setText(R.string.txtApEs);
           // txtEdad.setText(R.string.);
            txtNomb.setText(R.string.txtNombEs);
            txtAp.setText(R.string.txtApEs);
        }else {
            txtTitulo.setText(R.string.idioma_en);
            rbEs.setText(R.string.rdEsEn);
            rbEn.setText(R.string.rdEnEn);
        }
    }
}
