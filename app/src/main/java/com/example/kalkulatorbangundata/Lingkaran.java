package com.example.kalkulatorbangundata;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

            Vjarijari = findViewById(R.id.jarijari);
            Vhasil = findViewById(R.id.hasil);

            rg = findViewById(R.id.radioGroup);



            btnHitung = findViewById(R.id.hitung);
            btnHapus = findViewById(R.id.clear);

            btnLuas = findViewById(R.id.luas);
            btnKeliling = findViewById(R.id.keliling);


        });
    }

    private void LuasLingkaran(){

        String Jari = Vjarijari.getText().toString();

        if(Jari.isEmpty()){
            Toast.makeText(this, "Isi Panjang jari jari lingkaran !", Toast.LENGTH_SHORT).show();
        }else{
            double Jari = Double.parseDouble(Jari);

            double hasil = 3.14 * (Jari * Jari);

            if (hasil==(int)hasil){
                Vhasil.setText(String.valueOf((int)hasil));
            }else{
                Vhasil.setText(String.valueOf(hasil));

            }
        }
    }
}