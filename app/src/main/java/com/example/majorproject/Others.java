package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Others extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
    }

    public void goToAasara(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://scholarships.gov.in/") );
        startActivity(browse);
    }
    public void goToIfds(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://telanganaepass.cgg.gov.in/KalyanaLakshmiLinks.jsp") );
        startActivity(browse);
    }


}