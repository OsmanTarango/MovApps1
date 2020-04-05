package com.example.eva1_11_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lstVwClima;
    Weather[] cities =  {
      new Weather("Chihuahua", "Nublado", 18, R.drawable.cloudy),
            new Weather("Cuauhtemoc", "Lluvia Fuerte", 22, R.drawable.rainy),
            new Weather("Ciudad Juarez", "Nieve", 2, R.drawable.snow),
            new Weather("Delicias", "Tormentas dispersas", 26, R.drawable.thunderstorm),
            new Weather("Saucillo", "Nublado", 15, R.drawable.cloudy),
            new Weather("Camargo", "Soleado", 24, R.drawable.sunny),
            new Weather("Jimenez", "Alerta de Tornados", 10, R.drawable.tornado),
            new Weather("Parral", "Lluvia ligera", 16, R.drawable.light_rain),
            new Weather("Villa Ahumada", "Nieve", 1, R.drawable.snow),
            new Weather("Ojinaga", "Tormentas aisladas", 20, R.drawable.thunderstorm),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new WeatherAdapter(this, R.layout.mi_layout, cities));
    }
}
