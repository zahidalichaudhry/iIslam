package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.itpvt.iislam.Activities.Adapters.AzkarAdapter;
import com.itpvt.iislam.Activities.Adapters.FarzNamazAdapter;
import com.itpvt.iislam.Activities.PojoClass.FarzNamazPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class FarazN extends AppCompatActivity {



    ArrayList<FarzNamazPojo> arrayList=new ArrayList<FarzNamazPojo>();
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink, title1, title2, title3,title4,title5;
    RecyclerView recyclerView;
    FarzNamazAdapter adapter;
    RecyclerView.LayoutManager layoutManager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faraz_n);


        recyclerView=(RecyclerView)findViewById(R.id.azkar);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        Title= getResources().getString(R.string.FarzNamaz);
        TitleUrdu=getResources().getString(R.string.irshad);
        Arbi= getResources().getString(R.string.irshadarbi);
        Urdu=getResources().getString(R.string.ref);
        Ref= getResources().getString(R.string.ayat);
        RefLink=getResources().getString(R.string.info);

        title1=getResources().getString(R.string.infooo);
        title2=getResources().getString(R.string.azan);
        title3=getResources().getString(R.string.khali);


        arrayList.add(new FarzNamazPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3,title4,title5));



        Title= getResources().getString(R.string.niyyat);
        TitleUrdu=getResources().getString(R.string.niyattitle);
        Arbi= getResources().getString(R.string.niyatt);
        Urdu=getResources().getString(R.string.nafalnamaztitle);
        Ref= getResources().getString(R.string.nafalnamaz);
        RefLink=getResources().getString(R.string.wajabtitle);

        title1=getResources().getString(R.string.wajabnamaz);
        title2=getResources().getString(R.string.khali);
        title3=getResources().getString(R.string.khali);


        arrayList.add(new FarzNamazPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3, title4,title5));




        Title= getResources().getString(R.string.tareeka);
        TitleUrdu=getResources().getString(R.string.tareekanamaztitle);
        Arbi= getResources().getString(R.string.tareekaa);
        Urdu=getResources().getString(R.string.sanah);
        Ref= getResources().getString(R.string.sinfooo);
        RefLink=getResources().getString(R.string.tauz);

        title1=getResources().getString(R.string.sorahfatihatitle);
        title2=getResources().getString(R.string.rakooh);
        title3=getResources().getString(R.string.jamaat);


        arrayList.add(new FarzNamazPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3, title4,title5));



        Title= getResources().getString(R.string.titleofnamaz);
        TitleUrdu=getResources().getString(R.string.fajrtitle);
        Arbi= getResources().getString(R.string.fajar);
        Urdu=getResources().getString(R.string.zohartitle);
        Ref= getResources().getString(R.string.zohar);
        RefLink=getResources().getString(R.string.asartitle);

        title1=getResources().getString(R.string.asar);
        title2=getResources().getString(R.string.magribtitle);
        title3=getResources().getString(R.string.magrib);
        title4=getResources().getString(R.string.eshaatitle);
        title5=getResources().getString(R.string.eshaa);


        arrayList.add(new FarzNamazPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3,title4,title5));

        adapter= new FarzNamazAdapter(arrayList,FarazN.this);
        recyclerView.setAdapter(adapter);

    }
}
