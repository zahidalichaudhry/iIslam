package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class NamazFzailBaad extends AppCompatActivity {


    String Title,TitleUrdu;
    String Arbi;
    String Urdu;

    String Ref;
    String RefLink,titlee1, titlee3,titlee4,titlee5,titlee17,titlee20,titlee21,titlee18,titlee19,titlee6,titlee8,titlee15,titlee2,titlee16,titlee7,titlee9,titlee10,titlee11,titlee12,titlee13,titlee14;

    TextView title,arbi,ref,urdu;
    TextView titleurdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_namaz_fzail_baad);


        title=(TextView)findViewById(R.id.titlee);
        titleurdu=(TextView) findViewById(R.id.titlesec2);
        //  titleurdu=(TextView)findViewById(R.id.titleurdu);
        arbi=(TextView)findViewById(R.id.arbi2);




        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        TitleUrdu=intent.getStringExtra("TitleUrdu");
        Arbi=intent.getStringExtra("Arbi");

//






        title.setText(Title);
        titleurdu.setText(TitleUrdu);
        arbi.setText(Arbi);







    }
}
