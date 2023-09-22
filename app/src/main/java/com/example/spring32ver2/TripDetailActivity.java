package com.example.spring32ver2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class TripDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_detail);
        Button nextButton = findViewById(R.id.next_button3);
        String trip = getIntent().getStringExtra("trip");
        TextView textView = findViewById(R.id.textView7);
        int day = getIntent().getIntExtra("day", 1);
        textView.setText(trip+"旅行🚋");
        nextButton.setOnClickListener(v -> {
//            finish();

            EditText editText = findViewById(R.id.time1_2);
            String time1 = editText.getText().toString();
            EditText editText2 = findViewById(R.id.place1);
            String place1 = editText2.getText().toString();
            Intent intent = new Intent(this, TripDetailActivity2.class);
            intent.putExtra("trip", trip);
            intent.putExtra("day", day);
            intent.putExtra("time1", time1);
            intent.putExtra("place1", place1);
            Log.d("place1", place1);
            startActivity(intent);

        });

    }


    //Listを作成
    private List<String> tripList;
    //Listにデータを追加
    private void addTripList(String trip) {
        tripList.add(trip);
    }
    //Listからデータを取得
    private String getTripList(int index) {
        return tripList.get(index);
    }
    //Listのデータを更新
    private void updateTripList(int index, String trip) {
        tripList.set(index, trip);
    }

    private List<String> list1;


}