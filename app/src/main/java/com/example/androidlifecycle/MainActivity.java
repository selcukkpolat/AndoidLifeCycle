package com.example.androidlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Message", "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Message", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Message", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Message", "onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Message", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Message", "onResume");
    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Log.e("Message","onRestart");
    }
}
