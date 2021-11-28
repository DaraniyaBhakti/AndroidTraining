package com.example.androidtutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ImplicitIntentActivity extends AppCompatActivity {
    EditText etSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        etSearch = findViewById(R.id.etSearch);
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
                Intent searchIntent = new Intent(Intent.ACTION_WEB_SEARCH);
                String query = etSearch.getText().toString();
                searchIntent.putExtra(SearchManager.QUERY,query);
                startActivity(searchIntent);

        }
    }

    public void toLifeCycleActivity(View view) {

        Intent intent = new Intent(this,LifeCycleActivity.class);
        startActivity(intent);
    }
}