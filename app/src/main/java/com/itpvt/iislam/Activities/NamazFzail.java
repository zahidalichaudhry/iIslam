package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.R;

import org.w3c.dom.Text;

public class NamazFzail extends AppCompatActivity {

    String Title,TitleUrdu;
    String Arbi;
    String Urdu;

    String Ref;
    String RefLink,titlee1, titlee3,titlee4,titlee5,titlee6,titlee8,titlee2,titlee7;
    TextView title1;
    TextView title2;
    TextView title3;
    TextView title4;
    TextView title5;
    TextView title6;
    TextView title7;
    TextView title8,title9;
    TextView title,arbi,ref,urdu;
    TextView titleurdu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_namaz_fzail);



        title=(TextView)findViewById(R.id.title);
        titleurdu=(TextView) findViewById(R.id.titlesec);
      //  titleurdu=(TextView)findViewById(R.id.titleurdu);
        arbi=(TextView)findViewById(R.id.arbi);



        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        TitleUrdu=intent.getStringExtra("TitleUrdu");
        Arbi=intent.getStringExtra("Arbi");






        title.setText(Title);
        titleurdu.setText(TitleUrdu);
        arbi.setText(Arbi);





    }
}
