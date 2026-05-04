package com.example.matchux;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainAcitivity extends AppCompatActivity {

    ListView studyListView;
    Button createButton;

    String[] studies = {
            "첫번쨰 스터디 방",
            "두번째 스터디 방"
    };

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studyListView = findViewById(R.id.studyListView);
        createButton = findViewById(R.id.createButton);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,android.R.layout.simple_list_item_1,
                studies
        );

        studyListView.setAdapter(adapter);

        createButton.setOnClickListener(v -> {

            Toast.makeText(this, "스터디방 생성", Toast.LENGTH_SHORT).show();


    }




}
