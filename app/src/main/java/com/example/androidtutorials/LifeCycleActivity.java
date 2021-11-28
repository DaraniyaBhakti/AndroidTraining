package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        Toast.makeText(this,"OnCreate Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"OnStart Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"OnResume Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"OnPause Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"OnStop Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnStop");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"OnRestart Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnRestart");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"OnDestroy Finished",Toast.LENGTH_SHORT).show();
        Log.d("Lifecycle","OnDestroy");
    }
}