package com.example.eva3_3_runnable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Runnable rRun1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<10; i++) {
                    try {
                        Thread.sleep(1000);
                        Log.wtf("Hilo 1 ", "Vuelta " + (i+1));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread tHilo = new Thread(rRun1);
        tHilo.start();
            //rRun1.run(); Se invoca en el hilo principal


   /*        Thread tHilo1 = new Thread() {
            @Override
            public void run() { //Aqui va el trabajo en segundo plano
                super.run();
                //Codigo de la tarea, aqui
                for(int i=0; i<10; i++) {
                    try {
                        Thread.sleep(1000);
                        Log.wtf("Hilo 1 ", "Vuelta " + (i+1));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        tHilo1.start(); //Crea un nuevo hilo    */
    }
}
