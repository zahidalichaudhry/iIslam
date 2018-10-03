package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.QuranDuaAdapter;
import com.itpvt.iislam.Activities.Adapters.TitleAdapter;
import com.itpvt.iislam.Activities.PojoClass.DuaQuraniPojo;
import com.itpvt.iislam.Activities.PojoClass.MasnoonDuaPoji;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class Masnoon_dua_list extends AppCompatActivity {
    ArrayList<MasnoonDuaPoji> arrayList=new ArrayList<>();
    String Title,Arbi,Urdu,English,Ref,RefLink;
    RecyclerView recyclerView;
    TitleAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_masnoon_dua_list);

         English="";
        recyclerView=(RecyclerView)findViewById(R.id.quran_recycler);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        Arbi= getResources().getString(R.string.masjidentryarbi);
        Urdu=getResources().getString(R.string.masjidentryurdu);
        Title= getResources().getString(R.string.masjidentryTitle);
        Ref= getResources().getString(R.string.masjidentryref);
        RefLink=getResources().getString(R.string.masjidentryreflink);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.masjidexitTitle);
        Arbi= getResources().getString(R.string.masjidexitarbi);
        Urdu=getResources().getString(R.string.masjidexiturdu);
        RefLink=getResources().getString(R.string.masjidexitreflink);
        Ref= getResources().getString(R.string.masjidexitref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftervazoTitle);
        Arbi= getResources().getString(R.string.aftervazoarbi);
        Urdu=getResources().getString(R.string.aftervazourdu);
        RefLink=getResources().getString(R.string.aftervazoreflink);
        Ref= getResources().getString(R.string.aftervazoref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.afterAzanTitle);
        Arbi= getResources().getString(R.string.afterAzanarbi);
        Urdu=getResources().getString(R.string.afterAzanurdu);
        RefLink=getResources().getString(R.string.afterAzanreflink);
        Ref= getResources().getString(R.string.afterAzanref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        Title= getResources().getString(R.string.beforesleepTitle);
        Arbi= getResources().getString(R.string.beforesleeparbi);
        Urdu=getResources().getString(R.string.beforesleepurdu);
        RefLink=getResources().getString(R.string.beforesleepreflink);
        Ref= getResources().getString(R.string.beforesleepref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftersleepTitle);
        Arbi= getResources().getString(R.string.aftersleeparbi);
        Urdu=getResources().getString(R.string.aftersleepurdu);
        RefLink=getResources().getString(R.string.aftersleepreflink);
        Ref= getResources().getString(R.string.aftersleepref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.afraidsleepTitle);
        Arbi= getResources().getString(R.string.afraidsleeparbi);
        Urdu=getResources().getString(R.string.afraidsleepurdu);
        RefLink=getResources().getString(R.string.afraidsleepreflink);
        Ref= getResources().getString(R.string.afraidsleepref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftereatingTitle);
        Arbi= getResources().getString(R.string.aftereatingarbi);
        Urdu=getResources().getString(R.string.aftereatingurdu);
        RefLink=getResources().getString(R.string.aftereatingreflink);
        Ref= getResources().getString(R.string.aftereatingref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.forprovidfoodTitle);
        Arbi= getResources().getString(R.string.forprovidfoodarbi);
        Urdu=getResources().getString(R.string.forprovidfoodurdu);
        RefLink=getResources().getString(R.string.forprovidfoodreflink);
        Ref= getResources().getString(R.string.forprovidfoodref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.drinkmilkTitle);
        Arbi= getResources().getString(R.string.drinkmilkarbi);
        Urdu=getResources().getString(R.string.drinkmilkurdu);
        RefLink=getResources().getString(R.string.drinkmilkreflink);
        Ref= getResources().getString(R.string.drinkmilkref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        Title= getResources().getString(R.string.travelTitle);
        Arbi= getResources().getString(R.string.travelarbi);
        Urdu=getResources().getString(R.string.travelurdu);
        RefLink=getResources().getString(R.string.travelreflink);
        Ref= getResources().getString(R.string.travelref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        adapter=new TitleAdapter(arrayList,Masnoon_dua_list.this);
        recyclerView.setAdapter(adapter);
    }
}
