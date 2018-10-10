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
TextView ur;
String Titl, Arbb, Ur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_taimm);
    tt=(TextView)findViewById(R.id.titleee);
    ar=(TextView)findViewById(R.id.arbb);
    ur=(TextView)findViewById(R.id.urdu2);
        Intent intent=getIntent();
       Titl= intent.getStringExtra("Title");
        Arbb=intent.getStringExtra("Arbi");
        Ur=intent.getStringExtra("Urdu");
        tt.setText(Titl);
        ar.setText(Arbb);
        ur.setText(Ur);


    }
}
