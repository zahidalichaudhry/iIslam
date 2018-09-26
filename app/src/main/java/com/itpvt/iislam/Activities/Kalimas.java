package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class Kalimas extends AppCompatActivity {
    TextView first,second,third,fourth,fifth,sixth;
    String Title,Arbi,Urdu,English;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
                Title = getResources().getString(R.string.kalimatayabarbi);
                Intent intent=new Intent(Kalimas.this,DetailsKalima.class);
                intent.putExtra("Title",first.getText().toString());
                intent.putExtra("Arbi",Title);
                intent.putExtra("Urdu",R.string.kalimatayaburdu);
                intent.putExtra("English",R.string.kalimatayabenglish);
                startActivity(intent);
            }
        });

    }
}
