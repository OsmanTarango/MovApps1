package com.example.eva1_11_clima;

public class Weather {

    /* Nombre de la ciudad - String
        Temperatura - int
        descripcion del clima - String
        Imagen - int
     */
    private String city, desc;
    private int temp, image;

    public Weather(String city, String desc, int temp, int image) {
        this.city = city;
        this.desc = desc;
        this.temp = temp;
        this.image = image;
    }

    public String getCity() {
        return city;
    }

    public String getDesc() {
        return desc;
    }

    public int getTemp() {
        return temp;
    }

    public int getImage() {
        return image;
    }
}
