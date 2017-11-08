package com.example.diaemoharrar.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Lab2";
    int create = 0;
    int start = 0;
    int pause = 0;
    int resume = 0;
    int restart = 0;
    int stop = 0;
    int destroy = 0;

    TextView txtOnCreate;
    TextView txtOnStart;
    TextView txtOnPause;
    TextView txtOnResume;
    TextView txtOnRestart;
    TextView txtOnStop;
    TextView txtOnDestroy;


    @Override
    protected void onSaveInstanceState(Bundle outState) {

        outState.putInt("onCreate value", create);
        outState.putInt("onStart value", start);
        outState.putInt("onPause value", pause);
        outState.putInt("onResume value", resume);
        outState.putInt("onRestart value", restart);
        outState.putInt("onStop value", stop);
        outState.putInt("onDestroy value", destroy);

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button_1);
        txtOnCreate = (TextView) findViewById(R.id.onCreateNum);
        txtOnStart = (TextView) findViewById(R.id.onStartNum);
        txtOnPause = (TextView) findViewById(R.id.onPauseNum);
        txtOnResume = (TextView) findViewById(R.id.onResumeNum);
        txtOnRestart = (TextView) findViewById(R.id.onRestartNum);
        txtOnStop = (TextView) findViewById(R.id.onStopNum);
        txtOnDestroy = (TextView) findViewById(R.id.onDestroyNum);


        if (savedInstanceState!=null) {
            create = savedInstanceState.getInt("onCreate value");
            start = savedInstanceState.getInt("onStart value");
            pause = savedInstanceState.getInt("onPause value");
            resume = savedInstanceState.getInt("onResume value");
            restart = savedInstanceState.getInt("onRestart value");
            stop = savedInstanceState.getInt("onStop value");
            destroy = savedInstanceState.getInt("onDestroy value");
        }



        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

        create++;
        displayCounts();


    }

    public void displayCounts () {
        txtOnCreate.setText(create+"");
        txtOnStart.setText(start+"");
        txtOnPause.setText(pause+"");
        txtOnResume.setText(resume+"");
        txtOnRestart.setText(restart+"");
        txtOnStop.setText(stop+"");
        txtOnDestroy.setText(destroy+"");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Activity is currently in onStart");
        start++;
        displayCounts();
    }

    @Override
    protected void onRestart(){
       super.onRestart();
        Log.d(TAG, "Activity is currently in onRestart");
        restart++;
        displayCounts();

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Activity is currently in onResume");
        resume++;
        displayCounts();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d(TAG, "Activity is currently in onPause");
        pause++;
        displayCounts();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.d(TAG, "Activity is currently in onStop");
        stop++;
        displayCounts();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d(TAG, "Activity is currently in onDestroy");
        destroy++;
        displayCounts();
    }



}
