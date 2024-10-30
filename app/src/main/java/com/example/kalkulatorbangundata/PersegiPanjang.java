package com.example.kalkulatorbangundata;

import android.os.Bundle;
import android.view.MenuItem;
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

import java.text.DecimalFormat;

public class PersegiPanjang extends AppCompatActivity {

    private EditText txtPanjang, txtLebar, txtHasil;
    private Button btnHitung,  btnClear;

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
        txtHasil = findViewById(R.id.hasil);

        Grup = findViewById(R.id.grup);
        rdrLuas = findViewById(R.id.luas);
        rdrKeliling= findViewById(R.id.keliling);

        btnClear = findViewById(R.id.reset);
        btnHitung = findViewById(R.id.hitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung();
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtHasil.setText("");
                txtLebar.setText("");
                txtPanjang.setText("");
                Grup.clearCheck();

            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void hitung(){
        String Panjang = txtPanjang.getText().toString();
        String Lebar = txtLebar.getText().toString();

        if(Panjang.isEmpty()){
            Toast.makeText(this, "Panjang harus diisi!", Toast.LENGTH_SHORT).show();
        } else if (Lebar.isEmpty()) {
            Toast.makeText(this, "Lebar Harus diisi", Toast.LENGTH_SHORT).show();
        }

        double panjang = Double.parseDouble(Panjang);
        double lebar = Double.parseDouble(Lebar);
        double hasil;

        int Pilihan = Grup.getCheckedRadioButtonId();

        if (Pilihan==rdrLuas.getId()){
            hasil = panjang * lebar;
            if (hasil==(int)hasil){
                txtHasil.setText(String.valueOf((int) hasil));
            }else {
                txtHasil.setText(String.valueOf(hasil));
            }


        }else if (Pilihan==rdrKeliling.getId()){
            hasil = 2 * (panjang + lebar );
            if (hasil==(int)hasil){
                txtHasil.setText(String.valueOf((int) hasil));
            }else {
                txtHasil.setText(String.valueOf(hasil));
            }

        }else {
            Toast.makeText(this, "Pilih perhitungan", Toast.LENGTH_SHORT).show();
        }





    }
}