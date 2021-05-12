package com.example.majorproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserLogin extends AppCompatActivity {

    Button loginBtn,regBtn;
    EditText emailField, passwordField;
    private FirebaseAuth mAuth;
    private SharedPreferences preferences;
    public static String preferenceName="preferenceName";
    public static String lan="language";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);
        mAuth = FirebaseAuth.getInstance();
        loginBtn = findViewById(R.id.btlogin);
        regBtn=findViewById(R.id.btreg);
        emailField = findViewById(R.id.et1);
        passwordField = findViewById(R.id.et2);
        preferences=this.getSharedPreferences(preferenceName,MODE_PRIVATE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.translatemenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        SharedPreferences.Editor editor=preferences.edit();
        switch (item.getItemId()) {
            case R.id.telugu:
                Toast.makeText(UserLogin.this, "Language switched to Telugu", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 0);
                editor.apply();
                break;
            case R.id.english:
                Toast.makeText(UserLogin.this, "Language switched to English", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 1);
                editor.apply();
                break;
            case R.id.hindi:
                Toast.makeText(UserLogin.this, "Language switched to Hindi", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 2);
                editor.apply();
                break;
            case R.id.marathi:
                Toast.makeText(UserLogin.this, "Language switched to Marathi", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 3);
                editor.apply();
                break;
            case R.id.tamil:
                Toast.makeText(UserLogin.this, "Language switched to Tamil", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 4);
                editor.apply();
                break;
            case R.id.bengali:
                Toast.makeText(UserLogin.this, "Language switched to Bengali", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 5);
                editor.apply();
                break;
            case R.id.urdu:
                Toast.makeText(UserLogin.this, "Language switched to Urdu", Toast.LENGTH_SHORT).show();
                editor.putInt(lan, 6);
                editor.apply();
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            reload();
        }
    }

    public void loginUser(View view){
        String email = emailField.getText().toString();
        String password = passwordField.getText().toString();
        if(email.matches("") || password.matches("")){
            Toast.makeText(UserLogin.this, "Enter both email and password", Toast.LENGTH_SHORT).show();
            return;
        }
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            FirebaseUser user = mAuth.getCurrentUser();
                            Intent i = new Intent(UserLogin.this, Home.class);
                            i.putExtra("userId", user.getUid());
                            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(i);
                            UserLogin.this.finish();
                        } else {
                            Toast.makeText(UserLogin.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }
    public void goToRegister(View view) {
        Intent i = new Intent(UserLogin.this, MainActivity.class);
        startActivity(i);
    }

    private void reload() { }
}