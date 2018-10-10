package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.GhusalDetail;
import com.itpvt.iislam.R;
import com.itpvt.iislam.WazuDetail;

public class Pakizgi extends AppCompatActivity {

    TextView Wazu;
    TextView Ghusal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_pakizgi);
        Wazu= (TextView)findViewById(R.id.qurani);
        Ghusal= (TextView)findViewById(R.id.masnoon);
        Wazu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(Pakizgi.this, WazuDetail.class);
                startActivity(intent);
            }
        });

Ghusal.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent in= new Intent(Pakizgi.this, GhusalDetail.class);
        startActivity(in);
    }
});
    }

}
