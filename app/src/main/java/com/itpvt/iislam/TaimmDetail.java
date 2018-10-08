package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TaimmDetail extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    String Titll, Arbbb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taimm_detail);
        text1= (TextView)findViewById(R.id.taim);
        text2= (TextView)findViewById(R.id.taimT);
        text3= (TextView)findViewById(R.id.taimS);
        text4= (TextView)findViewById(R.id.taimF);
        text5= (TextView)findViewById(R.id.taimM);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Titll=getResources().getString(R.string.Saiil_e_TaimmTitle);
                Arbbb=getResources().getString(R.string.Saiil_e_Taimm);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                startActivity(intent);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.TaimmKaTareeqaTitle);
                Arbbb=getResources().getString(R.string.TaimmKaTareeqa);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                startActivity(intent);
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.TaimmKFaraizTitle);
                Arbbb=getResources().getString(R.string.TaimmKFaraiz);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                startActivity(intent);
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.TaimmKisunnatyTitle);
                Arbbb=getResources().getString(R.string.TaimmKisunnaty);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                startActivity(intent);
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.DeegerMasailTitle);
                Arbbb=getResources().getString(R.string.DeegerMasail);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                startActivity(intent);
            }
        });
    }
}
