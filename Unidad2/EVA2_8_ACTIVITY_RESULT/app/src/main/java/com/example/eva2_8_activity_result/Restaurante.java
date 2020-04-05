package com.example.eva2_8_activity_result;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class Restaurante extends AppCompatActivity{
    Button btnCancelar;
    ListView lstVwResta;
    String[] aDatos = {"Mc Donalds","Burguer King","Wendys","AppleBees","Dennys","Señor Camaron","Montados la junta","Buffalucas",
            "Boston","Top Wings","Kentucky Chicken"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        btnCancelar = findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setResult(Activity.RESULT_CANCELED);
                finish();
            }
        });

        lstVwResta = findViewById(R.id.lstVwResta);
        lstVwResta.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,aDatos));
        lstVwResta.setOnItemClickListener(new ListView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent inDatos = new Intent();
                inDatos.putExtra("aaaa",aDatos[position]);
                setResult(Activity.RESULT_OK,inDatos);
                finish();
            }
        });
    }


}
