package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class DetailsKalima extends AppCompatActivity {
     TextView title,arbi,urdu,english;
    String Title,Arbi,Urdu,English;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_details_kalima);
        title=(TextView)findViewById(R.id.title);
        arbi=(TextView)findViewById(R.id.arbi);
        urdu=(TextView)findViewById(R.id.urdu);
        english=(TextView)findViewById(R.id.english);
        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        Arbi=intent.getStringExtra("Arbi");
        Urdu=intent.getStringExtra("Urdu");
        English=intent.getStringExtra("English");
        title.setText(Title);
        arbi.setText(Arbi);
        urdu.setText(Urdu);
        english.setText(English);

    }
}
