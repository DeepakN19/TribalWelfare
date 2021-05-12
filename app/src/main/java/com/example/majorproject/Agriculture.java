package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Agriculture extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agriculture);
        //Bundle extras = getIntent().getExtras();
        //String Category = extras.getString("Category");
        //InputStream is = getResources().openRawResource(R.raw.a);
        //CSVReader.readData(Category,is);
    }
public void goToAsb(View view) {
    Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("http://annadathasukhibhava.ap.gov.in/ADSBAPP/kisan/index") );
    startActivity(browse);
}
    public void goToRbs(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("http://rythubandhu.telangana.gov.in/Default_RB1.aspx") );
        startActivity(browse);
    }
    public void goToSds(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://ossds.telangana.gov.in/Tseedlogin.aspx") );
        startActivity(browse);
    }
    public void goToPmfby(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://pmfby.gov.in/selfRegistration") );
        startActivity(browse);
    }
    public void goToPkvy(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://pgsindia-ncof.gov.in/pkvy/index.aspx") );
        startActivity(browse);
    }
    public void goToFm(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://www.telangana.gov.in/Services/MeeSeva") );
        startActivity(browse);
    }
}