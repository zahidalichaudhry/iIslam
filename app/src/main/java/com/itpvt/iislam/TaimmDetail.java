package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class TaimmDetail extends AppCompatActivity {

    TextView text1;
    TextView text2;
    TextView text3;
    TextView text4;
    TextView text5;
    String Titll, Arbbb,UrdU;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
                UrdU=getResources().getString(R.string.Saiil_e_TaimmU);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                intent.putExtra("Urdu",UrdU);
                startActivity(intent);
            }
        });

        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.TaimmKaTareeqaTitle);
                Arbbb=getResources().getString(R.string.TaimmKaTareeqa);
                UrdU=getResources().getString(R.string.TaimmKaTareeqaU);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                intent.putExtra("Urdu",UrdU);
                startActivity(intent);
            }
        });
        text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.TaimmKFaraizTitle);
                Arbbb=getResources().getString(R.string.TaimmKFaraiz);
                UrdU=getResources().getString(R.string.TaimmKFaraizU);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                intent.putExtra("Urdu",UrdU);
                startActivity(intent);
            }
        });
        text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.TaimmKisunnatyTitle);
                Arbbb=getResources().getString(R.string.TaimmKisunnaty);
                UrdU=getResources().getString(R.string.TaimmKisunnatyU);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                intent.putExtra("Urdu",UrdU);
                startActivity(intent);
            }
        });
        text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titll=getResources().getString(R.string.DeegerMasailTitle);
                Arbbb=getResources().getString(R.string.DeegerMasail);
                UrdU=getResources().getString(R.string.DeegerMasailU);
                Intent intent= new Intent(TaimmDetail.this,Taimm.class);
                intent.putExtra("Title",Titll);
                intent.putExtra("Arbi",Arbbb);
                intent.putExtra("Urdu",UrdU);
                startActivity(intent);
            }
        });
    }
}
