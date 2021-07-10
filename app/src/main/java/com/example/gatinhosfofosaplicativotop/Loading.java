package com.example.gatinhosfofosaplicativotop;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Loading extends AppCompatActivity {
    //definindo nomes
    ImageView gatito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        gatito = findViewById(R.id.gatito);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(), MainActivity.class));
                finish();
            }
        }, 5000);
    }
}
