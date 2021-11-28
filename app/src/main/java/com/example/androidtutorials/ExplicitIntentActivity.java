package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

    public void toImplicitIntentActivity(View view) {

        Intent intent = new Intent(this,ImplicitIntentActivity.class);
        startActivity(intent);
    }
}