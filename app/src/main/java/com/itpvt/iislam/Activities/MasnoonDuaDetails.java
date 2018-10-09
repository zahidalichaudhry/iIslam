package com.itpvt.iislam.Activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.itpvt.iislam.R;

public class MasnoonDuaDetails extends AppCompatActivity {
    String Title,Arbi,Urdu,English,Ref,RefLink;
    TextView title,arbi,urdu,english,ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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

        if (!Title.equals(" "))
        {
            title.setText(Title);
            title.setVisibility(View.VISIBLE);
        }
        if (!Arbi.equals(" "))
        {
            arbi.setText(Arbi);
            arbi.setVisibility(View.VISIBLE);
        }
        if (!Urdu.equals(" "))
        {
            urdu.setText(Urdu);
            urdu.setVisibility(View.VISIBLE);
        }
        if (!Ref.equals(" "))
        {
            ref.setText(Ref);
            ref.setVisibility(View.VISIBLE);
        }
        if (!English.equals(" "))
        {
            english.setText(English);
            english.setVisibility(View.VISIBLE);
        }

//        title.setText(Title);
//        arbi.setText(Arbi);
//        urdu.setText(Urdu);
//        ref.setText(Ref);
//        english.setText(English);
if (!RefLink.equals("")) {
    ref.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(RefLink));
            startActivity(myIntent);
        }
    });
}
    }
}
