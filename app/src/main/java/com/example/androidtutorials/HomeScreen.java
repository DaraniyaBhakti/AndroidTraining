package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    Button nextBtn;
    TextView tvBtnClicked;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        nextBtn = (Button)findViewById(R.id.nextBtn);
        tvBtnClicked = (TextView) findViewById(R.id.tvBtnCLicked);

    }

    public void toTextActivity(View view) {
        Intent intent = new Intent(this,TextViewActivity.class);
        startActivity(intent);

    }

    public void btnCLicked(View view) {
        tvBtnClicked.setVisibility(View.VISIBLE );

    }
}