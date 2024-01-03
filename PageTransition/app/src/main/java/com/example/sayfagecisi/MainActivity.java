package com.example.sayfagecisi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText kullaniciAdi, sifre;
    private TextView txtSonuc;
    private String kAdi, kSifre, dogruKAdi="mustafa", dogruKSifre="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kullaniciAdi = (EditText)findViewById(R.id.editTxtKullaniciAdi);
        sifre = (EditText)findViewById(R.id.editTxtSifre);
        txtSonuc = (TextView)findViewById(R.id.textViewSonuc);
    }

    public void btnGirisYap(View v){
        kAdi = kullaniciAdi.getText().toString();
        kSifre = sifre.getText().toString();

        if(!TextUtils.isEmpty(kAdi) && !TextUtils.isEmpty(kSifre) && kAdi.equals(dogruKAdi) && kSifre.equals(dogruKSifre) ){
            Intent intent = new Intent(MainActivity.this, IkinciSayfa.class);
            intent.putExtra("kullaniciAdi", kAdi);
            startActivity(intent);
        }else
            txtSonuc.setText("Tekrar deneyiniz.");

    }

}