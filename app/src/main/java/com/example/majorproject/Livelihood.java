package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Livelihood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livelihood);
    }

    public void goToAasara(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://gwmc.gov.in/pensions/pensiononlineappl.aspx") );
        startActivity(browse);
    }
    public void goToIfds(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("http://103.122.129.64/MGNREGSOnlineTG/UserInterface/Application/MCC/WageSeeker/JCOpenAppHome.aspx") );
        startActivity(browse);
    }
}