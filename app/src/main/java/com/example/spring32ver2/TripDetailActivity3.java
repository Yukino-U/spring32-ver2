package com.example.spring32ver2;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class TripDetailActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trip_detail3);
        String trip = getIntent().getStringExtra("trip");
        TextView textView = findViewById(R.id.textView7);
        int day = getIntent().getIntExtra("day", 1);
        String time1 = getIntent().getStringExtra("time1");
        String place1 = getIntent().getStringExtra("place1");
        String time2 = getIntent().getStringExtra("time2");
        String place2 = getIntent().getStringExtra("place2");
        textView.setText(trip+"旅行🚋");
        TextView textView2 = findViewById(R.id.time1_1);
        textView2.setText(time1);
        Log.d("day",place1);
        TextView textView3 = findViewById(R.id.place2);
        textView3.setText(place1);
        TextView textView4 = findViewById(R.id.time1_);
        textView4.setText(time2);
        TextView textView5 = findViewById(R.id.place);
        textView5.setText(place2);
        Log.d("day",place1);


        Button nextButton = findViewById(R.id.next_button3);
        nextButton.setOnClickListener(v -> {
//            finish();
            Intent intent = new Intent(this, TripActivity2.class);
            intent.putExtra("trip", trip);
            intent.putExtra("day", day);
            intent.putExtra("time1", time1);
            intent.putExtra("place1", place1);
            intent.putExtra("time2", time2);
            intent.putExtra("place2", place2);
            EditText editText = findViewById(R.id.editTextTime3);
            String time3 = editText.getText().toString();
            EditText editText2 = findViewById(R.id.place1);
            String place3 = editText2.getText().toString();
            intent.putExtra("time3", time3);
            intent.putExtra("place3", place3);
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