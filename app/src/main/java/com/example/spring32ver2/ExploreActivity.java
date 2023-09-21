package com.example.spring32ver2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class ExploreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);
        Button nextButton = findViewById(R.id.next_button2);
        nextButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, ExploreActivity2.class);
            startActivity(intent);
        });
        Button homeButton = findViewById(R.id.home_button);
        homeButton.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        });

    }
}