package com.example.spring32ver2;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.List;

public class DiaryActivity extends AppCompatActivity {
    static List<String> dataList = new ArrayList<String>();
    static ArrayAdapter<String> adapter;
    ListView listView;

    private boolean isShowFragment = false;
    private FragmentManager fragmentManager;
    private DiaryFragment diaryFragment;

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

        listView = findViewById(R.id.diarylist);

        adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                dataList);
        listView.setAdapter(adapter);



        ConstraintLayout frameLayout = findViewById(R.id.container);
        frameLayout.setVisibility(View.INVISIBLE);

        fragmentManager = getSupportFragmentManager();
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isShowFragment) {
                    // 表示処理
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    diaryFragment = DiaryFragment.newInstance();
                    transaction.add(R.id.container, diaryFragment);
                    transaction.commit();

                    ConstraintLayout frameLayout = findViewById(R.id.container);
                    frameLayout.setVisibility(View.VISIBLE);
                    isShowFragment = true;
                } else {
                    // 非表示処理
                    FragmentTransaction transaction = fragmentManager.beginTransaction();
                    transaction.remove(diaryFragment);
                    transaction.commit();

                    ConstraintLayout frameLayout = findViewById(R.id.container);
                    frameLayout.setVisibility(View.INVISIBLE);
                    isShowFragment = false;
                }
            }
        });

        Button enter = findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText content = findViewById(R.id.diarycontent);
                adapter.add(String.valueOf(content.getText()));
                ConstraintLayout frameLayout = findViewById(R.id.container);
                frameLayout.setVisibility(View.INVISIBLE);
                isShowFragment = false;
            }
        });
    }

}






