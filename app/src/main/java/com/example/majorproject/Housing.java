package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Housing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing);
    }

    public void goToBhk(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://2bhk.telangana.gov.in/") );
        startActivity(browse);
    }
    public void goToNhm(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://pmaymis.gov.in") );
        startActivity(browse);
    }

    public void goToNhm2(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://pmaymis.gov.in") );
        startActivity(browse);
    }
}