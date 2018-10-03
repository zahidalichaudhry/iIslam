package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class ContentActivity extends AppCompatActivity {
    LinearLayout kalima,dua,pakiz,namaz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_content);
        kalima=(LinearLayout)findViewById(R.id.kalima);
        kalima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ContentActivity.this,Kalimas.class);
                startActivity(intent);
            }
        });
        dua=(LinearLayout)findViewById(R.id.dua);
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ContentActivity.this,Dua.class);
                startActivity(intent);
            }
        });
        pakiz=(LinearLayout)findViewById(R.id.pakiz);
        pakiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ContentActivity.this,Pakizgi.class);
                startActivity(intent);
            }
        });
        namaz=(LinearLayout)findViewById(R.id.namaz);
        namaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ContentActivity.this,Namaz.class);
                startActivity(intent);
            }
        });
    }
}
