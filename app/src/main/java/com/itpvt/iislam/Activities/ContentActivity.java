package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class ContentActivity extends AppCompatActivity {
    LinearLayout kalima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        kalima=(LinearLayout)findViewById(R.id.kalima);
        kalima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(ContentActivity.this,Kalimas.class);
                startActivity(intent);
            }
        });
    }
}