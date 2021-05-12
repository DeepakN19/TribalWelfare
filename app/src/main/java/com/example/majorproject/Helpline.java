package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Helpline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);
    }

    public void goToState(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://tstribalwelfare.cgg.gov.in/twdHods.do") );
        startActivity(browse);
    }
    public void goToCentral(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://tribal.nic.in/ContactUs.aspx") );
        startActivity(browse);
    }
}