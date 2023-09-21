package com.example.spring32ver2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class TripDetailActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_detail);
//        String trip = getIntent().getStringExtra("trip");
//        TextView textView = findViewById(R.id.textView7);
        int day = getIntent().getIntExtra("day", 1);
        String time1 = getIntent().getStringExtra("time1");
        String place1 = getIntent().getStringExtra("place1");
//        textView.setText(trip);
//        TextView textView2 = findViewById(R.id.time1_1);
//        textView2.setText(time1);
        Log.d("day",place1);
        TextView textView3 = findViewById(R.id.place1_1);
        textView3.setText(place1);
//        Log.d("day",place1);


        Button nextButton = findViewById(R.id.next_button3);
        nextButton.setOnClickListener(v -> {
//            finish();
            Intent intent = new Intent(this, TripActivity2.class);
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