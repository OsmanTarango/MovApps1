package com.example.eva2_1_ciclo_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mensaje(String mensa){
        Toast.makeText(this, mensa, Toast.LENGTH_SHORT).show();
        Log.wtf("APP",mensa);
    }

    @Override
    protected void onStart() {
        super.onStart();
        mensaje("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        mensaje("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mensaje("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mensaje("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mensaje("onDestroy");
    }
}
