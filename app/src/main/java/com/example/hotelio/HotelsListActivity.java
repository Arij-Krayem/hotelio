package com.example.hotelio;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class HotelsListActivity extends AppCompatActivity {

    LinearLayout hotelSunrise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels_list);

        // Link Sunrise Palace hotel
        hotelSunrise = findViewById(R.id.hotelSunrise);

        hotelSunrise.setOnClickListener(v -> {
            Intent intent = new Intent(
                    HotelsListActivity.this,
                    BookingActivity.class
            );
            startActivity(intent);
        });
    }
}
