package com.example.spring32ver2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class TripActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip2);
        Button homebutton = findViewById(R.id.home_button2);
        homebutton.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        });
    }
}