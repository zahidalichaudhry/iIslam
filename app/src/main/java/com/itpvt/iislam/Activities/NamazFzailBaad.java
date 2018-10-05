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
    String RefLink,titlee1, titlee3,titlee4,titlee5,titlee17,titlee20,titlee21,titlee18,titlee19,titlee6,titlee8,titlee15,titlee2,titlee16,titlee7,titlee9,titlee10,titlee11,titlee12,titlee13,titlee14;
    TextView title1;
    TextView title2;
    TextView title3;
    TextView title4;
    TextView title5;
    TextView title6;
    TextView title7;
    TextView title8,title9,title10,title11,title12,title13,title14,title15,title16,title17,title18,title19,title20;
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
        title16=(TextView)findViewById(R.id.title16);
        title17=(TextView)findViewById(R.id.title17);
        title18=(TextView)findViewById(R.id.title18);
        title19=(TextView)findViewById(R.id.title19);
        title20=(TextView)findViewById(R.id.title20);


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
        titlee9=intent.getStringExtra("title8");
        titlee10=intent.getStringExtra("title9");
        titlee11=intent.getStringExtra("title10");
        titlee12=intent.getStringExtra("title11");
        titlee13=intent.getStringExtra("title12");
        titlee14=intent.getStringExtra("title13");
        titlee15=intent.getStringExtra("title14");
        titlee16=intent.getStringExtra("title15");
        titlee17=intent.getStringExtra("title16");
        titlee18=intent.getStringExtra("title17");
        titlee19=intent.getStringExtra("title18");
        titlee20=intent.getStringExtra("title19");
        titlee21=intent.getStringExtra("title20");








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
        title10.setText(titlee9);
        title11.setText(titlee10);
        title12.setText(titlee11);
        title13.setText(titlee12);
        title14.setText(titlee13);
        title15.setText(titlee14);
        title16.setText(titlee15);
        title17.setText(titlee16);
        title18.setText(titlee17);
        title19.setText(titlee18);
        title20.setText(titlee19);



    }
}
