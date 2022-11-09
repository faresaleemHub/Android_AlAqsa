package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","onCreate lifecycle");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","onStart lifecycle");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume lifecycle");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy");
    }
}
