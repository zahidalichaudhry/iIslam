package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class NamazFzailBaad extends AppCompatActivity {


    String Title,TitleUrdu;
    String Arbi;
    String Urdu;

    String Ref;
    String RefLink,titlee1, titlee3,titlee4,titlee5,titlee6,titlee8,titlee2,titlee7,titlee9,titlee10,titlee11,titlee12,titlee13,titlee14;
    TextView title1;
    TextView title2;
    TextView title3;
    TextView title4;
    TextView title5;
    TextView title6;
    TextView title7;
    TextView title8,title9,title10,title11,title12,title13,title14,title15;
    TextView title,arbi,ref,urdu;
    TextView titleurdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namaz_fzail_baad);


        title=(TextView)findViewById(R.id.title);
        titleurdu=(TextView) findViewById(R.id.titlesec);
        //  titleurdu=(TextView)findViewById(R.id.titleurdu);
        arbi=(TextView)findViewById(R.id.arbi);
        urdu=(TextView)findViewById(R.id.urdu);

        ref=(TextView)findViewById(R.id.reff);
        title1=(TextView)findViewById(R.id.title1);
        title2=(TextView)findViewById(R.id.title2);
        title3=(TextView)findViewById(R.id.title3);
        title4=(TextView)findViewById(R.id.title4);
        title5=(TextView)findViewById(R.id.title5);
        title6=(TextView)findViewById(R.id.title6);
        title7=(TextView)findViewById(R.id.title7);
        title8=(TextView)findViewById(R.id.title8);
        title9=(TextView)findViewById(R.id.title9);
        title10=(TextView)findViewById(R.id.title10);
        title11=(TextView)findViewById(R.id.title11);
        title12=(TextView)findViewById(R.id.title12);
        title13=(TextView)findViewById(R.id.title13);
        title14=(TextView)findViewById(R.id.title14);
        title15=(TextView)findViewById(R.id.title15);


        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        TitleUrdu=intent.getStringExtra("TitleUrdu");
        Arbi=intent.getStringExtra("Arbi");
        Urdu=intent.getStringExtra("Urdu");
//        //English=intent.getStringExtra("English");
        Ref=intent.getStringExtra("Ref");
        RefLink=intent.getStringExtra("RefLink");
        titlee1=intent.getStringExtra("title1");
        titlee2=intent.getStringExtra("title2");
        titlee3=intent.getStringExtra("title3");
        titlee4=intent.getStringExtra("title4");
        titlee5=intent.getStringExtra("title5");
        titlee6=intent.getStringExtra("title6");
        titlee7=intent.getStringExtra("title7");
        titlee8=intent.getStringExtra("title8");





        title.setText(Title);
        titleurdu.setText(TitleUrdu);
        arbi.setText(Arbi);
        urdu.setText(Urdu);
        ref.setText(Ref);


        title1.setText(RefLink);
        title2.setText(titlee1);
        title3.setText(titlee2);
        title4.setText(titlee3);
        title5.setText(titlee4);
        title6.setText(titlee5);
        title7.setText(titlee6);
        title8.setText(titlee7);
        title9.setText(titlee8);


    }
}
