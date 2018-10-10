package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class NafliNamazG extends AppCompatActivity {

    String Title,TitleUrdu;
    String Arbi;
    String Urdu;

    String Ref;
    String RefLink;

    TextView title,arbi,ref,urdu;
    TextView titleurdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_nafli_namaz_g);


        title=(TextView)findViewById(R.id.titleee1);
        titleurdu=(TextView) findViewById(R.id.titlesec1);
        //  titleurdu=(TextView)findViewById(R.id.titleurdu);
        arbi=(TextView)findViewById(R.id.arbi1);



        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        TitleUrdu=intent.getStringExtra("TitleUrdu");
        Arbi=intent.getStringExtra("Arbi");


        title.setText(Title);
        titleurdu.setText(TitleUrdu);
        arbi.setText(Arbi);


    }
}
