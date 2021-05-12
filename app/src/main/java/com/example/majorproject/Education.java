package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Education extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
    }
    public void goToKgv(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("http://183.82.97.97:8020/deshyd/home.aspx") );
        startActivity(browse);
    }
    public void goToSchl(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://telanganaemrs.in/") );
        startActivity(browse);
    }
    public void goToAovn(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://telanganaepass.cgg.gov.in/OverseasReg.do") );
        startActivity(browse);
    }
    public void goToSchlr(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://telanganaepass.cgg.gov.in/epassonlinelinks.jsp") );
        startActivity(browse);
    }
    public void goToCm(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://telanganaepass.cgg.gov.in/OverseasLinks.do") );
        startActivity(browse);
    }

}