package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Complaint extends AppCompatActivity {
    EditText sub,mes;
    Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint);
        sub=(EditText)findViewById(R.id.subject);
        mes=(EditText)findViewById(R.id.content);
        send=(Button)findViewById(R.id.mail);
    }
    public void sendMail(View view){
        String subject=sub.getText().toString();
        String message=mes.getText().toString();
        String[] to={"support-tribalwelfare@yopmail.com"};
        Intent email=new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL,to);
        email.putExtra(Intent.EXTRA_SUBJECT,subject);
        email.putExtra(Intent.EXTRA_TEXT,message);
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email,"Choose an Email app:"));
    }
}