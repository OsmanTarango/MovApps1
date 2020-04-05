package com.example.eva2_10_toastview2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showCustomToast(View v){
        Toast customToast = makeCustomToast(this);
        customToast.show();
    }
    protected Toast makeCustomToast(Context context) {

        android.view.LayoutInflater inflater = getLayoutInflater();

        View layout = inflater.inflate( R.layout.custom_toast, null);

        text = layout.findViewById(R.id.toast_text);
        text.setText("This is a Custom Toast");

        Toast toast = new Toast(context);

        toast.setDuration(Toast.LENGTH_LONG);
        toast.setMargin(50,-50); //lower-right corner
        toast.setView(layout);

        return toast;

    }


}



