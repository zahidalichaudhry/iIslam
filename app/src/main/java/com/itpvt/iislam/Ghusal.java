package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Ghusal extends AppCompatActivity {
TextView titleee;
TextView arabic;
TextView urdu;
String Titlee, Arabic,Urddu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ghusal);
        titleee=(TextView)findViewById(R.id.tit);
        arabic=(TextView)findViewById(R.id.arb1);
        urdu=(TextView)findViewById(R.id.urdu1);
        Intent intent = getIntent();
       Titlee= intent.getStringExtra("Title");
       Arabic=intent.getStringExtra("Arbi");
        Urddu=intent.getStringExtra("Urduu");
        titleee.setText(Titlee);
    arabic.setText(Arabic);
    urdu.setText(Urddu);
    }
}
