package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaimmDetail extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    String Titl, Arbb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taimm_detail);
        textView1= (TextView)findViewById(R.id.taim);
        textView2= (TextView)findViewById(R.id.taimT);
        textView3= (TextView)findViewById(R.id.taimS);
        textView4= (TextView)findViewById(R.id.taimF);
        textView5= (TextView)findViewById(R.id.taimM);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Titl=getResources().getString(R.string.Saiil_e_TaimmTitle);
                Arbb=getResources().getString(R.string.Saiil_e_Taimm);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titl);
                intent.putExtra("Arbi",Arbb);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titl=getResources().getString(R.string.TaimmKaTareeqaTitle);
                Arbb=getResources().getString(R.string.TaimmKaTareeqa);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titl);
                intent.putExtra("Arbi",Arbb);
                startActivity(intent);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titl=getResources().getString(R.string.TaimmKFaraizTitle);
                Arbb=getResources().getString(R.string.TaimmKFaraiz);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titl);
                intent.putExtra("Arbi",Arbb);
                startActivity(intent);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titl=getResources().getString(R.string.TaimmKisunnatyTitle);
                Arbb=getResources().getString(R.string.TaimmKisunnaty);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titl);
                intent.putExtra("Arbi",Arbb);
                startActivity(intent);
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titl=getResources().getString(R.string.DeegerMasailTitle);
                Arbb=getResources().getString(R.string.DeegerMasail);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titl);
                intent.putExtra("Arbi",Arbb);
                startActivity(intent);
            }
        });
    }
}
