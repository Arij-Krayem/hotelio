package com.example.hotelio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnViewRooms, btnMyReservations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // 🔹 Initialize buttons (VERY IMPORTANT)
        btnViewRooms = findViewById(R.id.btnViewRooms);
        btnMyReservations = findViewById(R.id.btnMyReservations);

        // 🔹 View rooms → requires login
        btnViewRooms.setOnClickListener(v -> {
            Toast.makeText(this, "Veuillez vous connecter pour réserver", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        });

        // 🔹 My reservations → requires login
        btnMyReservations.setOnClickListener(v -> {
            Toast.makeText(this, "Veuillez vous connecter pour voir vos réservations", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(HomeActivity.this, LoginActivity.class));
        });
    }
}
