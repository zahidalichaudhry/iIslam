package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class GhusalDetail extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;

    String Titleee, Arbiiii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghusal_detail);
        textView1= (TextView)findViewById(R.id.tareeqa);
        textView2= (TextView)findViewById(R.id.faraiz);
        textView3= (TextView)findViewById(R.id.soraty);
        textView4= (TextView)findViewById(R.id.masnoon);
        textView5= (TextView)findViewById(R.id.mustehbat);
        textView6= (TextView)findViewById(R.id.masail);
        textView7= (TextView)findViewById(R.id.taimm);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Titleee=getResources().getString(R.string.GhusalKaTareeqaTitle);
                Arbiiii=getResources().getString(R.string.GhusalKaTareeqa);
                Intent intent= new Intent(GhusalDetail.this,Ghusal.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titleee=getResources().getString(R.string.GhusalKFaraizTitle);
                Arbiiii=getResources().getString(R.string.GhusalKFaraiz);
                Intent intent= new Intent(GhusalDetail.this,Ghusal.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titleee=getResources().getString(R.string.GhusalKiFarzyatKisoratyTitle);
                Arbiiii=getResources().getString(R.string.GhusalKiFarzyatKisoraty);
                Intent intent= new Intent(GhusalDetail.this,Ghusal.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titleee=getResources().getString(R.string.Ghusal_e_MasnoonTitle);
                Arbiiii=getResources().getString(R.string.GhusalMasnoon);
                Intent intent= new Intent(GhusalDetail.this,Ghusal.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titleee=getResources().getString(R.string.GhusalMustehabTitle);
                Arbiiii=getResources().getString(R.string.GhusalMustehab);
                Intent intent= new Intent(GhusalDetail.this,Ghusal.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titleee=getResources().getString(R.string.GhusalKMasaiilTitle);
                Arbiiii=getResources().getString(R.string.GhusalKMasaiil);
                Intent intent= new Intent(GhusalDetail.this,Ghusal.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });
textView7.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent= new Intent(GhusalDetail.this,TaimmDetail.class);
        startActivity(intent);
    }
});

    }
}
