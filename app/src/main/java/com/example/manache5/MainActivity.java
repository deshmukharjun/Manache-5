package com.example.manache5;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Set window insets for the layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Get button references
        Button englishButton = findViewById(R.id.english_button);
        Button marathiButton = findViewById(R.id.marathi_button);
        Button darshanButton = findViewById(R.id.darshan_button);

        // Set click listeners for each button
        englishButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Manacha1Eng.class);
            startActivity(intent);
        });

        marathiButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Manacha1Mar.class);
            startActivity(intent);
        });

        darshanButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, DarshanActivity.class);
            startActivity(intent);

        });
    }
}
