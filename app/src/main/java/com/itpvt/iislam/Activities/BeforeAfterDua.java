package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.itpvt.iislam.R;

public class BeforeAfterDua extends AppCompatActivity {

    Button before, after;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_before_after_dua);

        before=(Button)findViewById(R.id.before);
        after=(Button)findViewById(R.id.after);
        before.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(BeforeAfterDua.this,Azkar.class);
                startActivity(i);

            }
        });

        after.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(BeforeAfterDua.this,AzkarBaad.class);
                startActivity(i);

            }
        });
    }
}
