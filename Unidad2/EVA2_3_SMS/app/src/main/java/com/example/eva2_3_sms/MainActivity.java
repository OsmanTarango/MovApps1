package com.example.eva2_3_sms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Intent itSms;
    EditText etTel, etMsj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTel = findViewById(R.id.etTel);
        etMsj = findViewById(R.id.etMsj);

    }

        public void OnClick (View v) {
            String mensaje = etMsj.getText().toString();
            String tel = ("smsto:" + etTel.getText().toString());
            itSms = new Intent(Intent.ACTION_SENDTO, Uri.parse(tel));
            itSms.putExtra("sms_body", mensaje);
            startActivity(itSms);
        }

}
