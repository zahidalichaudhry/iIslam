package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class WazuDetail extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    String Titleee, Arbiiii;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_wazu_detail);
        textView1= (TextView)findViewById(R.id.qurani);
        textView2= (TextView)findViewById(R.id.masnoon);
        textView3= (TextView)findViewById(R.id.azkar);
        textView4= (TextView)findViewById(R.id.sunnate);
        textView5= (TextView)findViewById(R.id.mustehbat);
        textView6= (TextView)findViewById(R.id.WazukBaad);
        textView7= (TextView)findViewById(R.id.makrohat);
        textView8= (TextView)findViewById(R.id.amoor);
        textView9= (TextView)findViewById(R.id.masail);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Titleee=getResources().getString(R.string.WazoTitleEngklish);
                Arbiiii= getResources().getString(R.string.WazoTitle);

                Intent intent= new Intent(WazuDetail.this,Wazu.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Titleee=getResources().getString(R.string.WazoKaTareeqaTitleEnglish);

                Arbiiii= getResources().getString(R.string.WazoKaTareeqaTitle);
                Intent intent= new Intent(WazuDetail.this,Wazu.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);

            }
        });
    textView3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Titleee=getResources().getString(R.string.WazoKFaraizTitleEnglish);

            Arbiiii= getResources().getString(R.string.WazoKFaraizTitle);
            Intent intent= new Intent(WazuDetail.this,Wazu.class);
            intent.putExtra("Title",Titleee);
            intent.putExtra("Arbi",Arbiiii);
            startActivity(intent);
        }
    });

    textView4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Titleee=getResources().getString(R.string.WazoKisunnatyTitleEnglish);

            Arbiiii= getResources().getString(R.string.WazoKisunnatyTitle);
            Intent intent= new Intent(WazuDetail.this,Wazu.class);
            intent.putExtra("Title",Titleee);
            intent.putExtra("Arbi",Arbiiii);
            startActivity(intent);
        }
    });

    textView5.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Titleee=getResources().getString(R.string.WazoKMustehbatTitleEnglish);

            Arbiiii= getResources().getString(R.string.WazoKMustehbatTitle);
            Intent intent= new Intent(WazuDetail.this,Wazu.class);
            intent.putExtra("Title",Titleee);
            intent.putExtra("Arbi",Arbiiii);
            startActivity(intent);
        }
    });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Titleee=getResources().getString(R.string.WazoKBaadkiDuaTitleEnglish);

                Arbiiii= getResources().getString(R.string.WazoKBaadkiDuaTitle);
                Intent intent= new Intent(WazuDetail.this,Wazu.class);
                intent.putExtra("Title",Titleee);
                intent.putExtra("Arbi",Arbiiii);
                startActivity(intent);
            }
        });
    textView7.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Titleee=getResources().getString(R.string.WazoKMakrohatTitleenglish);

            Arbiiii= getResources().getString(R.string.WazoKMakrohatTitle);
            Intent intent= new Intent(WazuDetail.this,Wazu.class);
            intent.putExtra("Title",Titleee);
            intent.putExtra("Arbi",Arbiiii);
            startActivity(intent);
        }
    });

    textView8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Titleee=getResources().getString(R.string.WazoTotnyKAmoorTitleEnglish);

            Arbiiii= getResources().getString(R.string.WazoTotnyKAmoorTitle);
            Intent intent= new Intent(WazuDetail.this,Wazu.class);
            intent.putExtra("Title",Titleee);
            intent.putExtra("Arbi",Arbiiii);
            startActivity(intent);
        }

    });

    textView9.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Titleee=getResources().getString(R.string.WazoKMasaiilTittleEnglish);

            Arbiiii= getResources().getString(R.string.WazoKMasaiilTittle);
            Intent intent= new Intent(WazuDetail.this,Wazu.class);
            intent.putExtra("Title",Titleee);
            intent.putExtra("Arbi",Arbiiii);
            startActivity(intent);

        }
    });
    }


}
