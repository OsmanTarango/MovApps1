package com.example.eva3_1_threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Simular una actividad que tome mucho tiempo
        //Por ejemplo: Una conexión a una BD
        //Durante 10 segundos

        for(int i=0; 0<10; i++) {
            try {
                //Duerme, demora el hilo principal
                Thread.sleep(1000);   //1 seg. = 1000 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
