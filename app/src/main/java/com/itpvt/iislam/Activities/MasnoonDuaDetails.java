package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class MasnoonDuaDetails extends AppCompatActivity {
    String Title,Arbi,Urdu,English,Ref,RefLink;
    TextView title,arbi,urdu,english,ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masnoon_dua_details);

        title=(TextView)findViewById(R.id.title);
        arbi=(TextView)findViewById(R.id.arbi);
        urdu=(TextView)findViewById(R.id.urdu);
        english=(TextView)findViewById(R.id.english);
        ref=(TextView)findViewById(R.id.ref);

        Intent intent = getIntent();
        Title=intent.getStringExtra("Title");
        Arbi=intent.getStringExtra("Arbi");
        Urdu=intent.getStringExtra("Urdu");
        English=intent.getStringExtra("English");
        Ref=intent.getStringExtra("Ref");
        RefLink=intent.getStringExtra("RefLink");


        title.setText(Title);
        arbi.setText(Arbi);
        urdu.setText(Urdu);
        ref.setText(Ref);
        english.setText(English);

        ref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(RefLink));
                startActivity(myIntent);
            }
        });
    }
}
