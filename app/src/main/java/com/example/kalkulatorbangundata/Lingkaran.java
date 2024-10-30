package com.example.kalkulatorbangundata;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Lingkaran extends AppCompatActivity {
    private EditText Vjarijari, Vhasil;
    private Button btnHitung, btnHapus;
    private RadioButton btnLuas, btnKeliling;
    private RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_lingkaran);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

            Vjarijari = findViewById(R.id.jarijari);
            Vhasil = findViewById(R.id.hasil);

            rg = findViewById(R.id.radioGroup);

            btnHitung = findViewById(R.id.hitung);
            btnHapus = findViewById(R.id.clear);

            btnLuas = findViewById(R.id.luas);
            btnKeliling = findViewById(R.id.keliling);

            btnHitung.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    hitung();
                }
            });
            btnHapus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Vjarijari.setText("");
                    Vhasil.setText("");
                    rg.clearCheck();
                }
            });
    }
    private void hitung() {

        String Jari = Vjarijari.getText().toString();

        if (Jari.isEmpty()) {
            Vhasil.setText("Masukkan jari-jari!");
            return;
        }
        double jari = Double.parseDouble(Jari);
        int pilih = rg.getCheckedRadioButtonId();
        double hasil;

        if(pilih==btnLuas.getId()){
            //hitung luas
            hasil = Math.PI * jari * jari;
                    Vhasil.setText(String.format("%.2f",hasil));

        }else if (pilih==btnKeliling.getId()){
            //hitung keliling
            hasil = 2 * Math.PI * jari;
                Vhasil.setText(String.format("%.2f",hasil));
        }else {
            Vhasil.setText("Pilih opsi perhitungan!");
        }



        }
    }
