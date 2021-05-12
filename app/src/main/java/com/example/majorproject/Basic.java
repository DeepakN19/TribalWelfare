package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }
    public void goToFsc(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse(" http://www.tg.meeseva.gov.in/DeptPortal/UserInterface/LoginForm.aspx") );
        startActivity(browse);
    }
}