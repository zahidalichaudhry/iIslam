package com.itpvt.iislam.Activities;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

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



    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_faraz_n);


        recyclerView=(RecyclerView)findViewById(R.id.azkar);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        Title= getResources().getString(R.string.FarzNamaz);
        TitleUrdu=getResources().getString(R.string.azaannn);
        Arbi= getResources().getString(R.string.irshad);
        Urdu=getResources().getString(R.string.irshadarbi);
        Ref= getResources().getString(R.string.ref);
        RefLink=getResources().getString(R.string.ayat);

        title1=getResources().getString(R.string.azaaan);
        title2=getResources().getString(R.string.time);
        title3=getResources().getString(R.string.orat);
        title4=getResources().getString(R.string.info);
        title5=getResources().getString(R.string.duaazan);


        arrayList.add(new FarzNamazPojo( Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3, title4, title5));



        Title= getResources().getString(R.string.niyyat);
        TitleUrdu=getResources().getString(R.string.niyattitle);
        Arbi= getResources().getString(R.string.niyatt);
        Urdu=getResources().getString(R.string.huakbar);
        Ref= getResources().getString(R.string.nafalnamaztitle);
        RefLink=getResources().getString(R.string.nafalnamaz);

        title1=getResources().getString(R.string.Hoabkar_);
        title2=getResources().getString(R.string.wajabtitle);
        title3=getResources().getString(R.string.wajabnamaz);
        title4=getResources().getString(R.string.huuabakr);
        title5=getResources().getString(R.string.namazzada);


        arrayList.add(new FarzNamazPojo( Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2, title3,title4, title5));




        Title= getResources().getString(R.string.tareeka);
        TitleUrdu=getResources().getString(R.string.tareekanamaztitle);
        Arbi= getResources().getString(R.string.tareekaa);
        Urdu=getResources().getString(R.string.sanah);
        Ref= getResources().getString(R.string.sinfooo);
        RefLink=getResources().getString(R.string.tauz);

        title1=getResources().getString(R.string.sorahfatihatitle);
        title2=getResources().getString(R.string.surahkosr);
        title3=getResources().getString(R.string.jamaat);
        title4=getResources().getString(R.string.farkk);
        title5=getResources().getString(R.string.farkinfo);

        arrayList.add(new FarzNamazPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3,title4,title5));



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


        arrayList.add(new FarzNamazPojo( Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3, title4, title5));

        adapter= new FarzNamazAdapter(arrayList,FarazN.this);
        recyclerView.setAdapter(adapter);

    }
}
