package com.hk.activitylifecycle;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView message;
private EditText input;
private Button second,login;
    private final String TAG = MainActivity.class.getSimpleName();
    private final String messageKey="Btntext";
    private final String btnTextKey="messageText";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate()");

        second = findViewById(R.id.secondActivityBtn);
        login = findViewById(R.id.loginBtn);
        input = findViewById(R.id.inputET);
        message = findViewById(R.id.messageTV);

        //when go second activity
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,SecondActivity.class));
            }
        });

        //explore screen oriantation problem
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login.setText("Logout");
                message.setText("Welcome: "+input.getText().toString());
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


    //method for solving screen rotation problem  save data before destroy and restore there by restarting activity

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState()");
        outState.putString(btnTextKey,login.getText().toString());
        outState.putString(messageKey,message.getText().toString());

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG,"onRestoreInstanceState()");
        if(savedInstanceState!=null){
            login.setText(savedInstanceState.getString(btnTextKey));
            message.setText(savedInstanceState.getString(messageKey));
        }


    }
}
