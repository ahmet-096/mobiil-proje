package com.example.proje;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import  java.util.ArrayList;

public class listele extends AppCompatActivity {
    private TextView txtUrunler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listele);

        txtUrunler = findViewById(R.id.txtUrunler);
        ArrayList<String> urunler = getIntent().getStringArrayListExtra("urunler");

        if (urunler == null || urunler.isEmpty()) {
            txtUrunler.setText("Listelenecek ürün yok.");
        } else {
            StringBuilder urunListesi = new StringBuilder();
            for (String urun : urunler) {
                urunListesi.append(urun).append("\n");
            }
            txtUrunler.setText(urunListesi.toString());
        }
    }
    public void temizle(View view) {
        txtUrunler.setText("");
    }
}