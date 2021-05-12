package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Schemes extends AppCompatActivity {
    private CardView agriCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schemes);
        agriCard = (CardView) findViewById(R.id.agri);
    }
    public void goToAgriculture(View view) {
        Intent i = new Intent(Schemes.this, Agriculture.class);
        i.putExtra("Category","Agriculture");
        startActivity(i);
    }
    public void goToBasicServices(View view) {
        Intent i = new Intent(Schemes.this, Basic.class);
        i.putExtra("Category","Normal");
        startActivity(i);
    }
    public void goToEducation(View view) {
        Intent i = new Intent(Schemes.this, Education.class);
        i.putExtra("Category","Education");
        startActivity(i);
    }
    public void goToHN(View view) {
        Intent i = new Intent(Schemes.this, Health.class);
        i.putExtra("Category","Health and Nutrition");
        startActivity(i);
    }
    public void goToHousing(View view) {
        Intent i = new Intent(Schemes.this, Housing.class);
        i.putExtra("Category","Housing");
        startActivity(i);
    }
    public void goToInsurance(View view) {
        Intent i = new Intent(Schemes.this, Insurance.class);
        i.putExtra("Category","Insurance");
        startActivity(i);
    }
    public void goToLE(View view) {
        Intent i = new Intent(Schemes.this, Livelihood.class);
        i.putExtra("Category","Livelihood and employment");
        startActivity(i);
    }
    public void goToOthers(View view) {
        Intent i = new Intent(Schemes.this, Others.class);
        i.putExtra("Category","Livelihood and employment");
        startActivity(i);
    }
    public void goToSD(View view) {
        Intent i = new Intent(Schemes.this, Skill.class);
        i.putExtra("Category","Skill Development");
        startActivity(i);
    }
    public void goToSS(View view) {
        Intent i = new Intent(Schemes.this, Social.class);
        i.putExtra("Category","Social Security");
        startActivity(i);
    }
    public void goToWCD(View view) {
        Intent i = new Intent(Schemes.this, Women.class);
        i.putExtra("Category","Women and Child Development");
        startActivity(i);
    }
    public void goToCall(View view) {
        Intent i = new Intent(Schemes.this, Helpline.class);
        startActivity(i);
    }
}