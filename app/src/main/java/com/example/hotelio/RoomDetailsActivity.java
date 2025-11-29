package com.example.hotelio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.hotelio.models.Room;

public class RoomDetailsActivity extends AppCompatActivity {

    ImageView roomImage;
    TextView roomTitle, roomPrice, roomAvailable, roomDescription;
    Button btnReserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_details);

        roomImage = findViewById(R.id.roomImage);
        roomTitle = findViewById(R.id.roomTitle);
        roomPrice = findViewById(R.id.roomPrice);
        roomAvailable = findViewById(R.id.roomAvailable);
        roomDescription = findViewById(R.id.roomDescription);
        btnReserve = findViewById(R.id.btnReserve);

        Room room = (Room) getIntent().getSerializableExtra("room");

        if (room != null) {
            roomTitle.setText(room.getTitle());
            roomPrice.setText(room.getPrice() + " DT / nuit");
            roomDescription.setText(room.getDescription());

            if (room.getAvailable() == 1) {
                roomAvailable.setText("Disponible");
                roomAvailable.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            } else {
                roomAvailable.setText("Non disponible");
                roomAvailable.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            }

            Glide.with(this)
                    .load(room.getImageUrl())
                    .into(roomImage);
        }

        btnReserve.setOnClickListener(v -> {
            // Naviguer vers ReservationActivity
        });
    }
}

}
