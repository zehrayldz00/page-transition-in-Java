package com.example.sayfagecisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class IkinciSayfa extends AppCompatActivity {
    private TextView kullanici;
    private String gelenKAdi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci_sayfa);

        kullanici = (TextView)findViewById(R.id.txtViewKullanici);

        Intent gelenIntent = getIntent();
        gelenKAdi = gelenIntent.getStringExtra("kullaniciAdi");

        kullanici.setText(gelenKAdi);
    }
}