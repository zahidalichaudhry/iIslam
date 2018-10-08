package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Taimm extends AppCompatActivity {
TextView tt;
TextView ar;
String TT, AR;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taimm);
    tt=(TextView)findViewById(R.id.titl);
    ar=(TextView)findViewById(R.id.arbb);
        Intent intent=getIntent();
        intent.getStringExtra("Title");
        intent.getStringExtra("Arbi");
        tt.setText(TT);
        ar.setText(AR);


    }
}
