package com.example.myapplication.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.myapplication.R;
import com.example.myapplication.SessionClass.SessionClass;

import androidx.appcompat.app.AppCompatActivity;

public class SnapScreen extends AppCompatActivity {

    SessionClass sessionClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snap_screen);

        sessionClass = SessionClass.getInstance(this);

        if (sessionClass.isLoggedIn()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {

                    Intent intent = new Intent(SnapScreen.this, MainActivity.class);
                    startActivity(intent);
                    finish();


                }
            }, 2000);
        } else {

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(SnapScreen.this, Login.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        }
    }
}
