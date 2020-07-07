package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView messageArea;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        messageArea = findViewById(R.id.textView4);
        Intent intent = getIntent();
        String birName = intent.getStringExtra(MainActivity.oneName);
        messageArea.setText(birName);
    }
}