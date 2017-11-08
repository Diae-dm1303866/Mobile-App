package com.example.diaemoharrar.lab2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {

    private static final String TAG = "Lab2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Button finishButton = findViewById(R.id.button2);
        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "Activity is onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d(TAG, "Activity is onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG,"Activity is onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG,"Activity is onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "Activity is onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "Activity is onResume");
    }
}