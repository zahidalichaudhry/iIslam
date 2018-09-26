package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class Kalimas extends AppCompatActivity {
    TextView first,second,third,fourth,fifth,sixth;
    String Title,Arbi,Urdu,English;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_kalimas);
        first=(TextView)findViewById(R.id.first);
        second=(TextView)findViewById(R.id.second);
        third=(TextView)findViewById(R.id.third);
        fourth=(TextView)findViewById(R.id.fourth);
        fifth=(TextView)findViewById(R.id.fifth);
        sixth=(TextView)findViewById(R.id.sixth);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Arbi = getResources().getString(R.string.kalimatayabarbi);
                Urdu = getResources().getString(R.string.kalimatayaburdu);
                English = getResources().getString(R.string.kalimatayabenglish);
                Title=first.getText().toString();
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",Title);
                intent.putExtra("Arbi",Arbi);
                intent.putExtra("Urdu",Urdu);
                intent.putExtra("English",English);
                startActivity(intent);
            }
        });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arbi = getResources().getString(R.string.kalimaShahaadatarbi);
                Urdu = getResources().getString(R.string.kalimaShahaadatudrdu);
                English = getResources().getString(R.string.kalimaShahaadatenglish);
                Title=first.getText().toString();
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",Title);
                intent.putExtra("Arbi",Arbi);
                intent.putExtra("Urdu",Urdu);
                intent.putExtra("English",English);
                startActivity(intent);
            }
        });
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arbi = getResources().getString(R.string.kalimaTumjeedearbi);
                Urdu = getResources().getString(R.string.kalimaTumjeedurdu);
                English = getResources().getString(R.string.kalimaTumjeedenglish);
                Title=first.getText().toString();
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",Title);
                intent.putExtra("Arbi",Arbi);
                intent.putExtra("Urdu",Urdu);
                intent.putExtra("English",English);
                startActivity(intent);
            }
        });
        fourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arbi = getResources().getString(R.string.kalimaTauhidarbi);
                Urdu = getResources().getString(R.string.kalimaTauhidurdu);
                English = getResources().getString(R.string.kalimaTauhidenglish);
                Title=first.getText().toString();
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",Title);
                intent.putExtra("Arbi",Arbi);
                intent.putExtra("Urdu",Urdu);
                intent.putExtra("English",English);
                startActivity(intent);
            }
        });
        fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arbi = getResources().getString(R.string.kalimaIstaghfararbi);
//                Urdu = getResources().getString(R.string.ist);
                English = getResources().getString(R.string.kalimaTauhidenglish);
                Title=first.getText().toString();
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",Title);
                intent.putExtra("Arbi",Arbi);
                intent.putExtra("Urdu",Urdu);
                intent.putExtra("English",English);
                startActivity(intent);
            }
        });
        sixth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Arbi = getResources().getString(R.string.kalimaRudarbi);
                Urdu = getResources().getString(R.string.kalimaRudurdu);
                English = getResources().getString(R.string.kalimaRudenglish);
                Title=first.getText().toString();
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",Title);
                intent.putExtra("Arbi",Arbi);
                intent.putExtra("Urdu",Urdu);
                intent.putExtra("English",English);
                startActivity(intent);
            }
        });

    }
}
