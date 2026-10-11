package com.example.authflowapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private Button btnCreateAccount, btnBackToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btnCreateAccount = findViewById(R.id.btnCreateAccount);
        btnBackToLogin = findViewById(R.id.btnBackToLogin);

        btnCreateAccount.setOnClickListener(v -> {
            Toast.makeText(
                    SignupActivity.this,
                    "Signup is not functional in this assignment.",
                    Toast.LENGTH_SHORT
            ).show();
        });

        btnBackToLogin.setOnClickListener(v -> finish());
    }
}
