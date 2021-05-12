package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Health extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }

    public void goToKcr(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://kcrkit.telangana.gov.in/") );
        startActivity(browse);
    }
    public void goToNhm(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://nhm.gov.in/registration.php") );
        startActivity(browse);
    }
    public void goToAmc(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://www.telangana.gov.in/Services/MeeSeva") );
        startActivity(browse);
    }

}