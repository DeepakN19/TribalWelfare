package com.example.majorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Account extends AppCompatActivity {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference usersRef = database.getReference("Users");
    TextView mobileNumber, email, name;
    String userMobile, userName;
    FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        mobileNumber = findViewById(R.id.phoneText);
        email = findViewById(R.id.emailText);
        name = findViewById(R.id.nameText);

        //GETTING USERID FROM PREVIOUS ACTIVITY
        Bundle extras = getIntent().getExtras();
        String userId = extras.getString("userId");

        //GETTING REF TO THE USER WITH THE USERID
        final DatabaseReference userRef = usersRef.child(userId);

        //SNAPSHOT OF USER OBJECT
        userRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                email.setText(dataSnapshot.child("Email").getValue().toString());
                name.setText(dataSnapshot.child("name").getValue().toString());
                mobileNumber.setText(dataSnapshot.child("MobileNumber").getValue().toString());
                userMobile = dataSnapshot.child("MobileNumber").getValue().toString();
                userName = dataSnapshot.child("name").getValue().toString();
            }
            @Override
            public void onCancelled(DatabaseError error) {
                //
            }
        });
    }

    public void logOut(View view){
        firebaseAuth.getInstance().signOut();
        Intent i = new Intent(Account.this, UserLogin.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        Account.this.finish();
    }
}