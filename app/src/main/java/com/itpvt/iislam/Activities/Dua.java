package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class Dua extends AppCompatActivity {

    Button qurani,masnoon,azkar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_dua);
        qurani=(Button)findViewById(R.id.qurani);
        masnoon=(Button)findViewById(R.id.masnoon);
        azkar=(Button)findViewById(R.id.azkar);
        qurani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Dua.this,QuranDua.class);
                startActivity(intent);
            }
        });
        masnoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Dua.this,Masnoon_dua_list.class);
                startActivity(intent);
            }
        });
        azkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Dua.this,wazaif.class);
                startActivity(intent);
            }
        });

    }
}
