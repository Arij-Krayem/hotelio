package com.example.hotelio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;
    private Button btnLogin;
    private TextView tvRegister, btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Récupération des éléments du XML
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvRegister = findViewById(R.id.tvRegister);
        btnClose = findViewById(R.id.btnClose);

        // ➤ Action du bouton "Se connecter"
        btnLogin.setOnClickListener(v -> {

            String email = etEmail.getText().toString().trim();
            String password = etPassword.getText().toString().trim();

            // Vérification si les champs sont remplis
            if (email.isEmpty()) {
                etEmail.setError("Champ obligatoire");
                return;
            }
            if (password.isEmpty()) {
                etPassword.setError("Champ obligatoire");
                return;
            }

            // ✔Vérification simple (exemple)
            if (email.equals("admin@gmail.com") && password.equals("123456")) {

                // Redirection directe vers Home
                startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                finish();

            } else {
                //  Erreur email / mot de passe incorrect
                Toast.makeText(LoginActivity.this, "Email ou mot de passe incorrect", Toast.LENGTH_SHORT).show();
            }
        });

        // ➤ Redirection vers Inscription
        tvRegister.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
        });

        // ➤ Bouton X (continuer sans se connecter)
        btnClose.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            finish();
        });
    }
}
