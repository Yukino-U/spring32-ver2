package com.example.spring32ver2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class TripActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip2);
        String trip = getIntent().getStringExtra("trip");
        Log.d("trip", trip);
        int day = getIntent().getIntExtra("day", 1);
        String time1 = getIntent().getStringExtra("time1");
        Log.d("time1", time1);
        String place1 = getIntent().getStringExtra("place1");
        Log.d("place1", place1);
        String time2 = getIntent().getStringExtra("time2");
        Log.d("time2", time2);
        String place2 = getIntent().getStringExtra("place2");
        Log.d("place2", place2);
        String time3 = getIntent().getStringExtra("time3");
        Log.d("time3", time3);
        String place3 = getIntent().getStringExtra("place3");
        Log.d("place3", place3);
        TextView textView = findViewById(R.id.textView8);
        textView.setText(String.valueOf(day)+"日");
        //
        TextView textView3 = findViewById(R.id.textView20);
        textView3.setText(time1+"  "+place1);
        TextView textView4 = findViewById(R.id.textView21);
        textView4.setText(time2+"  "+place2);
        TextView textView5 = findViewById(R.id.textView22);
        textView5.setText(time3+"  "+place3);
        Button homebutton = findViewById(R.id.home_button2);
        homebutton.setOnClickListener(v -> {
            finish();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);

        });
    }
}