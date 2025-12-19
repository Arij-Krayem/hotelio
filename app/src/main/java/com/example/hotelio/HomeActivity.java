package com.example.hotelio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    LinearLayout layoutHotels, layoutApartments;
    Button btnViewRooms, btnMyReservations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // 🔹 Categories
        layoutHotels = findViewById(R.id.layoutHotels);
        layoutApartments = findViewById(R.id.layoutApartments);

        // 🔹 Action buttons
        btnViewRooms = findViewById(R.id.btnViewRooms);
        btnMyReservations = findViewById(R.id.btnMyReservations);

        // ==============================
        // HOTELS → Hotels list
        // ==============================
        layoutHotels.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HotelsListActivity.class);
            startActivity(intent);
        });

        // ==============================
        // APARTMENTS → (later)
        // ==============================
        layoutApartments.setOnClickListener(v -> {
            Toast.makeText(
                    HomeActivity.this,
                    "Apartments list coming soon",
                    Toast.LENGTH_SHORT
            ).show();
            // Later: ApartmentsListActivity
        });

        // ==============================
        // VIEW ROOMS → Rooms list
        // ==============================
        btnViewRooms.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, HotelsListActivity.class);
            startActivity(intent);
        });

        // ==============================
        // MY RESERVATIONS → LOGIN REQUIRED
        // ==============================
        btnMyReservations.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            intent.putExtra("TARGET", "MY_RESERVATIONS");
            startActivity(intent);
        });
    }
}
