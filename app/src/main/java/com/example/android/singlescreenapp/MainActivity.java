package com.example.android.singlescreenapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void goToMaps(View view) {
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=48.858370,2.294481"));
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    protected void callNumber(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+33123456789"));
        startActivity(callIntent);
    }
}
