package com.example.qr_code_scanner_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the button
        Button scanQRButton = findViewById(R.id.scanQRButton);

        // Set click listener for the button
        scanQRButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start QRScannerActivity
                startActivity(new Intent(MainActivity.this, QRScannerActivity.class));
            }
        });
    }
}
