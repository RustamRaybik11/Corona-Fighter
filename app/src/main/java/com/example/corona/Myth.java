package com.example.corona;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Myth extends AppCompatActivity {

    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myth);


        BottomNavigationView bottomNavigationView =findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.nav_myths);

        webView = (WebView) findViewById(R.id.webview);

        webView.loadUrl("file:///android_asset/webview/myths.html");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_symptoms:
                        startActivity(new Intent(getApplicationContext(),Symptoms.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),MainActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_preventions:
                        startActivity(new Intent(getApplicationContext(),Mood.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_myths:
                        return true;
                    case R.id.nav_statistic:
                        startActivity(new Intent(getApplicationContext(),Statistic.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });
    }
}
