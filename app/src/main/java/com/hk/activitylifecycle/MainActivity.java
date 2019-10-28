package com.hk.activitylifecycle;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

private final String TAG = MainActivity.class.getSimpleName();
private Button second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate()");

        second = findViewById(R.id.secondActivityBtn);

        //when go second activity
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });
    }

    @Override
    protected void onRestart() {       //when activity is back after onStop state
        super.onRestart();
        Log.i(TAG,"onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart()");
    }

    @Override
    protected void onResume() {      //activity are visible and user interaction enabled
        super.onResume();
        Log.i(TAG,"onResume()");
    }


    //onPause and onStop are called when activity gone background state and called second activity
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop()");
    }


    @Override
    protected void onDestroy() {     //activity is destroyed
        super.onDestroy();
        Log.i(TAG,"onDestroy()");
    }
}
