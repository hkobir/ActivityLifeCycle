package com.hk.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    private final String TAG = SecondActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(TAG,"onCreate()");
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


    //onPause and onStop are called when activity gone background state
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
