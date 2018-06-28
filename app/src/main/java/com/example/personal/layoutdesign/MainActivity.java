package com.example.personal.layoutdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goTOSecondActivity(View view) {
        Intent intent = new Intent(packageContext:MainActivity.this, SecondActivity.class)
        startActivity(intent);
    }


}
