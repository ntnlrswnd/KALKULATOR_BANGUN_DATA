package com.example.kalkulatorbangundata;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class segitiga extends AppCompatActivity {
    private EditText txtAlas, txtTinggi, txtHasil;
    private Button btnHitung, btnHapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_segitiga);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        txtAlas = findViewById(R.id.alas);
        txtTinggi = findViewById(R.id.tinggi);
        txtHasil = findViewById(R.id.hasil);

        btnHitung = findViewById(R.id.button);
        btnHapus = findViewById(R.id.hapus);




        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
         btnHapus.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 txtAlas.setText("");
                 txtTinggi.setText("");
                 txtHasil.setText("");
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


    private void hitungLuas(){

        String Alas = txtAlas.getText().toString();
        String Tinggi = txtTinggi.getText().toString();


        if(Alas.isEmpty() && Tinggi.isEmpty()){
            Toast.makeText(this, "Alas dan Tinggi Harus diisi", Toast.LENGTH_SHORT).show();
        }else{
            double alas = Double.parseDouble(Alas);
            double tinggi = Double.parseDouble(Tinggi);

            double hasil = 0.5 * alas * tinggi;


            if (hasil==(int)hasil){
                txtHasil.setText(String.valueOf((int)hasil));
            }else{
                txtHasil.setText(String.valueOf(hasil));
            }

        }




    }

}