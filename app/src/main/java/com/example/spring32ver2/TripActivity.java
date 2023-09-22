package com.example.spring32ver2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class TripActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip);
        Button nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(v -> {
//            finish();
            //edittextの値を取得
            EditText editText = findViewById(R.id.trip_place);
            String trip = editText.getText().toString();
            EditText dateText = findViewById(R.id.trip_day);
            int day = Integer.parseInt(dateText.getText().toString());
            Intent intent = new Intent(this, TripDetailActivity.class);
            intent.putExtra("trip", trip);
            intent.putExtra("day", day);

            startActivity(intent);
        });
        Button homeButton = findViewById(R.id.home_button4);
        homeButton.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);



        });
    }

}