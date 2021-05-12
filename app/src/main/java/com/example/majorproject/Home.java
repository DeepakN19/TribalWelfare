package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    private CardView schemesCard,accountCard,complaintCard;
    private String userId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Bundle extras=getIntent().getExtras();
        userId=extras.getString("userId");
        schemesCard = (CardView) findViewById(R.id.schemes_card);
        accountCard = (CardView) findViewById(R.id.account_card);
        complaintCard = (CardView) findViewById(R.id.complaint_card);
    }
    public void goToSchemes(View view) {
        Intent i = new Intent(Home.this, Schemes.class);
        startActivity(i);
    }
    public void goToAccount(View view) {
        Intent i = new Intent(Home.this, Account.class);
        i.putExtra("userId",userId);
        startActivity(i);
    }
    public void goToComplaint(View view) {
        Intent i = new Intent(Home.this, Complaint.class);
        startActivity(i);
    }
}