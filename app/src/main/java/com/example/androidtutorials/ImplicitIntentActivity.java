package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ImplicitIntentActivity extends AppCompatActivity {
    EditText etSearch,etSend;
    TextView tvScrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        etSearch = findViewById(R.id.etSearch);
        etSend = findViewById(R.id.etSend);
        tvScrollView = findViewById(R.id.tvScrollView);
    }

    public void clickIntent(View view) {

        switch (view.getId()){

            case R.id.btnWeb:
                Intent webIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.tatvasoft.com"));
                startActivity(webIntent);

                break;

            case R.id.btnCall:
                Intent callIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:+91 960 142 1472"));
                startActivity(callIntent);
                break;

            case R.id.btnMap:
                Intent mapIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:23.033863,72.585022"));
                startActivity(mapIntent);
                break;

            case R.id.btnSearch:
                Intent searchIntent = new Intent(Intent.ACTION_VIEW);
                String query = etSearch.getText().toString();
                searchIntent.putExtra(SearchManager.QUERY,query);
                startActivity(searchIntent);

            case R.id.btnSend:

                String msg = etSend.getText().toString();

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,msg+" ");
                sendIntent.setType("text/plain");


                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
        }
    }

    public void toLifeCycleActivity(View view) {

        Intent intent = new Intent(this,LifeCycleActivity.class);
        startActivity(intent);
    }
}