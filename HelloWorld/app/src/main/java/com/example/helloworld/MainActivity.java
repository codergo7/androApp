package com.example.helloworld;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int count=0;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView3);
        if(savedInstanceState!=null){
            count = savedInstanceState.getInt("count");
            textView.setText(Integer.toString(count));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Deneme", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        count++;
        if(textView != null){
            textView.setText(Integer.toString(count));
        }
    }
}