package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.itpvt.iislam.R;

public class MasnoonDuaDetails extends AppCompatActivity {
    String Title,Arbi,Urdu,Ref,RefLink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masnoon_dua_details);

        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        Arbi=intent.getStringExtra("Arbi");
        Urdu=intent.getStringExtra("Urdu");
        Ref=intent.getStringExtra("Ref");
        RefLink=intent.getStringExtra("RefLink");
    }
}
