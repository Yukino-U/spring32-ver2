package com.example.spring32ver2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class DiaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
        Button button = findViewById(R.id.home_button5);
        button.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        });
    }
}