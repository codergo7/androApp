package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static String oneName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickTest(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        oneName="biisim";
        intent.putExtra(oneName,"bunu gorecek abdullah abi");
        startActivity(intent);


    }
}