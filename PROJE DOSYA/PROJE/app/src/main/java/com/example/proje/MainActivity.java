package com.example.proje;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


EditText kullaniciAdi , sifre;
Button giris ,cıkıs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
kullaniciAdi = findViewById(R.id.ka);
sifre = findViewById(R.id.sifre);
giris = findViewById(R.id.btngiris);
cıkıs = findViewById(R.id.btncıkıs);


    }

    public void girisYap(View view) {

        if (kullaniciAdi.getText().toString().equals("admin") && sifre.getText().toString().equals("123")) {
            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
            finish();
        }
        else {
            kullaniciAdi.setError("Kullanıcı adı veya şifre hatalı");
            sifre.setError("Kullanıcı adı veya şifre hatalı");
        }
    }

    public void cıkıs(View view) {
        finish();
    }

}