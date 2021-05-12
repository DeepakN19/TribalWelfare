package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Skill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
    }

    public void goToTask(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://tstask.com/Student-Registration") );
        startActivity(browse);
    }
    public void goToTssm(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://www.tssm.cgg.gov.in/") );
        startActivity(browse);
    }

    public void goToRyk(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("http://ryk.cgg.gov.in/CandidateRequirement.do?lang=english") );
        startActivity(browse);
    }

    public void goToNaps(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://apprenticeshipindia.org/candidate-registration") );
        startActivity(browse);
    }

    public void goToCts(View view) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse("https://www.dvet.gov.in/en/craftsman-training-scheme/") );
        startActivity(browse);
    }
}