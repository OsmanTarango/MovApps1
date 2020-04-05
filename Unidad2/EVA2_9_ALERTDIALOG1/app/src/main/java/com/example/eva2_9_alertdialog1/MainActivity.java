package com.example.eva2_9_alertdialog1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtMsg;
Button btnADB;
Button btnCDB;
Button btnADF;
Context activityContext;
String msg = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityContext = this;

    txtMsg = findViewById(R.id.txtMsg);
    btnADB = findViewById(R.id.btnADB);
    btnCDB = findViewById(R.id.btnCDB);
    btnADF = findViewById(R.id.btnADF);

    btnADB.setOnClickListener(this);
    btnCDB.setOnClickListener(this);
    btnADF.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnADB.getId()) {
            showMyAlertDialog(this);
        }
        if(v.getId() == btnCDB.getId()) {
            showCustomDialogBox();
        }
        if(v.getId() == btnADF.getId()) {
            showMyAlertDialogFragment(this);
        }
    }

    private void showMyAlertDialog(MainActivity mainActivity) {
        new AlertDialog.Builder(mainActivity)
                .setTitle("Terminator")
                .setMessage("Are you sure that you want to quit?")
                .setIcon(R.drawable.icon1)

        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                msg = "YES" + Integer.toString(which);
                txtMsg.setText(msg);
            }
        })
        .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                msg = "CANCEL" + Integer.toString(which);
                txtMsg.setText(msg);
            }
        })
        .setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                msg = "NO" + Integer.toString(which);
                txtMsg.setText(msg);
            }
        })
                .create()
                .show();
    }

    private void showCustomDialogBox() {

        final Dialog customDialog = new Dialog(activityContext);
        customDialog.setTitle("Custom Dialog Title");

        customDialog.setContentView(R.layout.custom_dialog_layout);

        ((TextView) customDialog.findViewById(R.id.sd_textView1))
                .setText("\nMessage line1\nMessage line2\n"
                        +"Dismiss: Back btn, Close, or touch outside");

        final EditText sd_txtInputData = (EditText) customDialog
                .findViewById(R.id.sd_editText1);

        ((Button) customDialog.findViewById(R.id.sd_btnClose))
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        txtMsg.setText(sd_txtInputData.getText().toString());
                        customDialog.dismiss();
                    }
                });

        customDialog.show();
    }

    private void showMyAlertDialogFragment(MainActivity mainActivity) {

        DialogFragment dialogFragment = MyAlertDialogFragment.newInstance(R.string.app_name);

        dialogFragment.show(getFragmentManager(), "TAG_MYDIALOGFRAGMENT1");
    }

    public void doPositiveClick (Date time) {
        txtMsg.setText("POSITIVE - DialogFragment picked @ "+ time);

    }

    public void doNegativeClick (Date time) {
        txtMsg.setText("NEGATIVE - DialogFragment picked @ "+ time);

    }

    public void doNeutralClick (Date time) {
        txtMsg.setText("NEUTRAL - DialogFragment picked @ "+ time);

    }

}
