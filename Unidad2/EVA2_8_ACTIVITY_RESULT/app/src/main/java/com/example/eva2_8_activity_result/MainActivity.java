package com.example.eva2_8_activity_result;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSelRest;
    Button btnCont;
    Button btnVideos;
    Button btnImg;
    Button btnAudios;

    Intent inSelRest;
    Intent inSelCon;
    Intent inSelVideo;
    Intent inSelImg;
    Intent inSelAudio;
    final int RESTA = 500;
    final int CONTACT = 1000;
    final int VIDEO = 1500;
    final int IMG = 2000;
    final int AUDIO = 2500;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVideos = findViewById(R.id.btnVideos);
        btnImg = findViewById(R.id.btnImg);
        btnAudios = findViewById(R.id.btnAudios);
        btnCont = findViewById(R.id.btnCont);
        btnVideos.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelVideo,VIDEO);
            }
        });
        btnImg.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelImg,IMG);
            }
        });
        btnAudios.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelAudio,AUDIO);
            }
        });
        btnCont.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelCon ,CONTACT);
            }
        });
        inSelCon = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
        inSelVideo = new Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
        inSelImg = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        inSelAudio = new Intent(Intent.ACTION_PICK, MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);

        btnSelRest = findViewById(R.id.btnSelRest);
        inSelRest = new Intent(this,Restaurante.class);
        btnSelRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(inSelRest,RESTA);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){//Que actividad respondió
            case RESTA:
                if (resultCode == Activity.RESULT_OK){//Cual fue la respuesta
                    Toast.makeText(this, data.getStringExtra("aaaa"), Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show();
                }
                break;
            case CONTACT:
            case VIDEO:
            case IMG:
            case AUDIO:
                if (resultCode == Activity.RESULT_OK){//Cual fue la respuesta
                    Toast.makeText(this, data.getDataString(), Toast.LENGTH_LONG).show();
                }
                break;
        }
    }
}
