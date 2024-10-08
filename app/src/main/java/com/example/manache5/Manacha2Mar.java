package com.example.manache5;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Manacha2Mar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_manacha2_mar);


        // Get button references
        Button backButton = findViewById(R.id.backbutton);
        Button locationButton = findViewById(R.id.locationbutton);
        Button forwardButton = findViewById(R.id.forwardbutton);


        // Set click listeners for each button
        backButton.setOnClickListener(v -> finish());

        locationButton.setOnClickListener(v -> {
            String mapUrl = "https://maps.app.goo.gl/EJDezii4U48VpPZD9"; // Tambdi Jogeshwari Ganapati Link
            Uri mapUri = Uri.parse(mapUrl);

            // Create an intent to open the map link
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, mapUri);
            // Check if any app can handle the intent
            if (mapIntent.resolveActivity(getPackageManager()) != null) {
                startActivity(mapIntent);
            }
        });

        forwardButton.setOnClickListener(v -> {
            Intent intent = new Intent(Manacha2Mar.this, Manacha3Mar.class);
            startActivity(intent);
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}