package com.example.spring32ver2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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

        Button upButton = findViewById(R.id.button2);
        Button downButton = findViewById(R.id.button);


        upButton.setOnClickListener(v -> {
            EditText editText = findViewById(R.id.editTextTime2);
            String str = editText.getText().toString();
            DateFormat formatter = new SimpleDateFormat("mm:ss");
            try {
                Date time = formatter.parse(str);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(time);
                calendar.add(Calendar.MINUTE, -1);
                SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
                editText.setText(sdf.format(calendar.getTime()));
            } catch (ParseException e) {
                e.printStackTrace();
            }

        });
        downButton.setOnClickListener(v -> {
            EditText editText = findViewById(R.id.editTextTime2);
            String str = editText.getText().toString();


            DateFormat formatter = new SimpleDateFormat("mm:ss");
            try {
                Date time = formatter.parse(str);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(time);
                calendar.add(Calendar.MINUTE, 1);
                SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
                editText.setText(sdf.format(calendar.getTime()));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });


    }
}