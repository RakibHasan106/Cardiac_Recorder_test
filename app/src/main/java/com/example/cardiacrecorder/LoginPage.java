package com.example.cardiacrecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    Button loginbutton;
    Button signupbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginbutton  = findViewById(R.id.btn_login);
        signupbutton = findViewById(R.id.btn_signup);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this, HomePage.class);
                startActivity(intent);
            }
        });
        signupbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginPage.this, SignupPage.class);
                startActivity(intent);
            }
        });

        Toast.makeText(LoginPage.this,"testing",Toast.LENGTH_SHORT).show();
        Toast.makeText(LoginPage.this,"testing 2",Toast.LENGTH_SHORT).show();
        Toast.makeText(LoginPage.this,"testing 3",Toast.LENGTH_SHORT).show();
        Toast.makeText(LoginPage.this,"testing 4",Toast.LENGTH_SHORT).show();
    }
}