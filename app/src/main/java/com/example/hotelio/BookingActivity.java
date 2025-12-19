package com.example.hotelio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BookingActivity extends AppCompatActivity {

    ImageView roomImage;
    TextView roomTitle, roomPrice;
    Button btnReserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        // Init views
        roomImage = findViewById(R.id.roomImage);
        roomTitle = findViewById(R.id.roomTitle);
        roomPrice = findViewById(R.id.roomPrice);
        btnReserve = findViewById(R.id.btnReserve);

        // (Optional) get data from intent later
        // For now, static content is fine

        // Reserve button → LOGIN
        btnReserve.setOnClickListener(v -> {
            Intent intent = new Intent(BookingActivity.this, LoginActivity.class);
            intent.putExtra("TARGET", "BOOKING");
            startActivity(intent);
        });
    }
}
