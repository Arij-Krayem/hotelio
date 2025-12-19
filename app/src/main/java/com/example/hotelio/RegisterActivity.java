package com.example.hotelio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private EditText etName, etEmail, etPassword;
    private Button btnRegister;
    private TextView tvLogin;

    // To know where to go after login
    private String target;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Get target if exists
        target = getIntent().getStringExtra("TARGET");

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnRegister = findViewById(R.id.btnRegister);
        tvLogin = findViewById(R.id.tvLogin);

        // 👉 Register button
        btnRegister.setOnClickListener(v -> {

            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                        RegisterActivity.this,
                        "Veuillez remplir tous les champs",
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            // ✅ Demo registration success
            Toast.makeText(
                    RegisterActivity.this,
                    "Compte créé avec succès !",
                    Toast.LENGTH_SHORT
            ).show();

            // Go to login after registration
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);

            // Pass target if exists
            if (target != null) {
                intent.putExtra("TARGET", target);
            }

            startActivity(intent);
            finish();
        });

        // 👉 Back to login
        tvLogin.setOnClickListener(v -> {
            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);

            if (target != null) {
                intent.putExtra("TARGET", target);
            }

            startActivity(intent);
            finish();
        });
    }
}
