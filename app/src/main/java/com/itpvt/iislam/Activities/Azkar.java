package com.itpvt.iislam.Activities;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.AzkarAdapter;
import com.itpvt.iislam.Activities.PojoClass.AzkarWazaifPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class Azkar extends AppCompatActivity {


    ArrayList<AzkarWazaifPojo> arrayList=new ArrayList<>();
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink, title1, title2, title3, title4,title5,title6, title7,title8,title9;
    RecyclerView recyclerView;
    AzkarAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_azkar);

        recyclerView=(RecyclerView)findViewById(R.id.azkar);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        Title= getResources().getString(R.string.FarzNamazWazaifTitle);
       TitleUrdu=getResources().getString(R.string.DuaSePhlyTitle);
        Arbi= getResources().getString(R.string.Fajarbefore);

     arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi));
//



//        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
//                ,title3,title4,title5,title6,title7,title8));
//
//
        Title= getResources().getString(R.string.NamzaZoharAsarTitle);
        TitleUrdu=getResources().getString(R.string.Duase_Phlyyy);
        Arbi= getResources().getString(R.string.NamzaZoharAsar_DuaSePhly);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi
        ));



        Title= getResources().getString(R.string.NamzaMagrib_Title);
        TitleUrdu=getResources().getString(R.string.phlymagrib);
        Arbi= getResources().getString(R.string.NamzaMagrib_DuasePhly);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi
        ));



        Title= getResources().getString(R.string.NamzaEshaa_Title);
        TitleUrdu=getResources().getString(R.string.phlymagrib);
        Arbi= getResources().getString(R.string.NamzaMagrib_DuasePhly);



        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi
        ));


        Title= getResources().getString(R.string.NamzaJuma_Title);
        TitleUrdu=getResources().getString(R.string.wazaif_juma);
        Arbi= getResources().getString(R.string.NamzaJuma_ayat);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi));


        Title= getResources().getString(R.string.NamazEid_Title);
        TitleUrdu=getResources().getString(R.string.Wazaifeeid);
        Arbi= getResources().getString(R.string.NamazEid_irshad);



        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi
        ));

        adapter= new AzkarAdapter(arrayList,Azkar.this);
        recyclerView.setAdapter(adapter);

    }
}
