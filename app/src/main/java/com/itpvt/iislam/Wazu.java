package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class Wazu extends AppCompatActivity {
TextView Title;
TextView Arbi;
TextView Urdu;

String Titlee, Arbiii,Urduu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_wazu);
        Title= (TextView)findViewById(R.id.title);
        Arbi= (TextView)findViewById(R.id.arbii);
        Urdu= (TextView)findViewById(R.id.urdu);

        Intent intent = getIntent();
        Titlee=intent.getStringExtra("Title");
        Arbiii=intent.getStringExtra("Arbi");
        Urduu=intent.getStringExtra("Urdu");
        Title.setText(Titlee);

        Arbi.setText(Arbiii);
Urdu.setText(Urduu);
    }
}
