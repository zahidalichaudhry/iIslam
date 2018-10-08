package com.itpvt.iislam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Wazu extends AppCompatActivity {
TextView Title;
TextView Arbi;

String Titlee, Arbiii;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wazu);
        Title= (TextView)findViewById(R.id.title);
        Arbi= (TextView)findViewById(R.id.arbii);

        Intent intent = getIntent();
        Titlee=intent.getStringExtra("Title");
        Arbiii=intent.getStringExtra("Arbi");
        Title.setText(Titlee);

        Arbi.setText(Arbiii);

    }
}
