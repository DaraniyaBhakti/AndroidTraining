package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {

    TextView tvExplicitIntentName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);

        tvExplicitIntentName=findViewById(R.id.tvExplicitIntentName);

       Bundle bundle =  getIntent().getExtras();
       String name = bundle.getString("name");
       tvExplicitIntentName.setText("Hello "+name+"!");
    }
}