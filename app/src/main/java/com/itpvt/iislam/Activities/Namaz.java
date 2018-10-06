package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class Namaz extends AppCompatActivity {

    TextView farz, nafli, azkar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz);


        farz=(TextView) findViewById(R.id.qurani);
        nafli=(TextView) findViewById(R.id.masnoon);
        azkar=(TextView) findViewById(R.id.azkar);

        farz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent i= new Intent(Namaz.this,FarazN.class);
startActivity(i);



            }
        });


        nafli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i= new Intent(Namaz.this,NafaliNamaz.class);
                startActivity(i);


            }
        });

        azkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Namaz.this, BeforeAfterDua.class);
                startActivity(i);



            }
        });




    }
}
