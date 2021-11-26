package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class IntentActivity extends AppCompatActivity {

    EditText etIntentName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        etIntentName=findViewById(R.id.etIntentName);
    }

    public void explicitIntentDataPass(View view) {
        Intent intent = new Intent(this,ExplicitIntentActivity.class);
        intent.putExtra("name",etIntentName.getText().toString());
        startActivity(intent);
    }
}