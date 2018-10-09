package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Taimm extends AppCompatActivity {
TextView tt;
TextView ar;
String Titl, Arbb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_taimm);
    tt=(TextView)findViewById(R.id.titleee);
    ar=(TextView)findViewById(R.id.arbb);
        Intent intent=getIntent();
       Titl= intent.getStringExtra("Title");
        Arbb=intent.getStringExtra("Arbi");
        tt.setText(Titl);
        ar.setText(Arbb);


    }
}
