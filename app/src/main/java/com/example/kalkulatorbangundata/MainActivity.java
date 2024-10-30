package com.example.kalkulatorbangundata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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

    }

    public void opensegitiga(View view) {
        Intent intent = new Intent(MainActivity.this, segitiga.class);
        startActivity(intent);
    }
    public void openlingkaran(View view) {
        Intent intent = new Intent(MainActivity.this, Lingkaran.class);
        startActivity(intent);
    }
    public void openPersegiPanjang(View view){
        Intent intent = new Intent(MainActivity.this, PersegiPanjang.class);
        startActivity(intent);
    }
    public void openPersegi(View view){
        Intent intent = new Intent(MainActivity.this, Persegi.class);
        startActivity(intent);
    }



}
