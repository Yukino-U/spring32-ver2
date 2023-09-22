package com.example.spring32ver2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button tripButton = findViewById(R.id.trip_button);
        tripButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),TripActivity.class);
            startActivity(intent);
        });
        Button exploreButton = findViewById(R.id.explore_button);
        exploreButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),ExploreActivity.class);
            startActivity(intent);
        });
        Button diaryButton = findViewById(R.id.diary_button);
        diaryButton.setOnClickListener(v -> {
            Intent intent = new Intent(getApplication(),DiaryActivity.class);
            startActivity(intent);
        });
    }
}