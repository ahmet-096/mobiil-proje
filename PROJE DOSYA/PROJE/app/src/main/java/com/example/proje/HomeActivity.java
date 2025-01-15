package com.example.proje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
private EditText urunAdi,urunMiktari;
private Button btnKaydet , btnListele;
private ArrayList<String> urunler = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home);

        urunAdi = findViewById(R.id.ürünAdı);
        urunMiktari = findViewById(R.id.ürünMiktarı);
        btnKaydet = findViewById(R.id.kaydet);
        btnListele = findViewById(R.id.listele);
    }


    public void kaydet(View view) {
        String urunAd = urunAdi.getText().toString();
        String urunMik = urunMiktari.getText().toString();

        if (urunAd == null || urunAd.isEmpty() || urunMik == null || urunMik.isEmpty()) {
            Toast.makeText(this, "Lütfen boş alanları doldurunuz", Toast.LENGTH_SHORT).show();
            return;
        } else {
            urunler.add(urunAd);
            urunler.add(urunMik);
            Toast.makeText(this, "Kayıt Yapıldı", Toast.LENGTH_SHORT).show();
            urunAdi.setText("");
            urunMiktari.setText("");
        }
    }


    public void listele(View view) {
        Intent intent = new Intent(HomeActivity.this, listele.class);
        intent.putStringArrayListExtra("urunler", urunler);
        startActivity(intent);//listeleye git
    }
}