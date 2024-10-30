package com.example.kalkulatorbangundata;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PersegiPanjang extends AppCompatActivity {

    private EditText txtPanjang, txtLebar;
    private Button btnPanjang, btnClear;

    private RadioGroup Grup;
    private RadioButton rdrLuas, rdrKeliling;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_persegi_panjang);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        txtPanjang = findViewById(R.id.panjang);
        txtLebar = findViewById(R.id.lebar);

    }
}