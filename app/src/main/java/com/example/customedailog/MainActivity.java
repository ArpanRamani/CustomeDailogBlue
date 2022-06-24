package com.example.customedailog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button btnDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDialog = findViewById(R.id.btnDialog);

        InitView();
    }

    private void InitView() {

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenDialog();
            }
        });

    }

    private void OpenDialog() {

        Dialog d = new Dialog(MainActivity.this);
        d.setContentView(R.layout.dialog_custom);
        Window window = d.getWindow();
        d.getWindow().setBackgroundDrawable(getDrawable(R.drawable.round));
        window.setLayout(ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.WRAP_CONTENT);
        d.setCancelable(false);
        d.show();


        Button ok = findViewById(R.id.btnOkay);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Okay", Toast.LENGTH_SHORT).show();
                d.dismiss();
            }
        });

    }


}