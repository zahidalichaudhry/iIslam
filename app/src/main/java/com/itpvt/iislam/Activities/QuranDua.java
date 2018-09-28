package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.QuranDuaAdapter;
import com.itpvt.iislam.Activities.PojoClass.DuaQuraniPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class QuranDua extends AppCompatActivity {
    ArrayList<DuaQuraniPojo> arrayList=new ArrayList<>();
    String Arbi,Urdu,English;
    RecyclerView recyclerView;
    QuranDuaAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_quran_dua);

        recyclerView=(RecyclerView)findViewById(R.id.quran_recycler);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

         Arbi= getResources().getString(R.string.bakra127arbi);
         Urdu=getResources().getString(R.string.bakra127udru);
         English=getResources().getString(R.string.bakra127english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.bakra128arbi);
        Urdu=getResources().getString(R.string.bakra128udru);
        English=getResources().getString(R.string.bakra128english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.bakra201arbi);
        Urdu=getResources().getString(R.string.bakra201urdu);
        English=getResources().getString(R.string.bakra201english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));


        Arbi= getResources().getString(R.string.bakra250arbi);
        Urdu=getResources().getString(R.string.bakra250urdu);
        English=getResources().getString(R.string.bakra250english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));


        Arbi= getResources().getString(R.string.bakra286arbi);
        Urdu=getResources().getString(R.string.bakra286udru);
        English=getResources().getString(R.string.bakra286english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran8arbi);
        Urdu=getResources().getString(R.string.al_imran8udru);
        English=getResources().getString(R.string.al_imran8english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran9arbi);
        Urdu=getResources().getString(R.string.al_imran9udru);
        English=getResources().getString(R.string.al_imran9english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran16arbi);
        Urdu=getResources().getString(R.string.al_imran16udru);
        English=getResources().getString(R.string.al_imran16english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran53arbi);
        Urdu=getResources().getString(R.string.al_imran53urdu);
        English=getResources().getString(R.string.al_imran53english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran147arbi);
        Urdu=getResources().getString(R.string.al_imran147urdu);
        English=getResources().getString(R.string.al_imran147english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran191arbi);
        Urdu=getResources().getString(R.string.al_imran191urdu);
        English=getResources().getString(R.string.al_imran191english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran192arbi);
        Urdu=getResources().getString(R.string.al_imran192udru);
        English=getResources().getString(R.string.al_imran192english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran193arbi);
        Urdu=getResources().getString(R.string.al_imran193urdu);
        English=getResources().getString(R.string.al_imran193english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.al_imran194arbi);
        Urdu=getResources().getString(R.string.al_imran194urdu);
        English=getResources().getString(R.string.al_imran194english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));


        Arbi= getResources().getString(R.string.maida83arbi);
        Urdu=getResources().getString(R.string.maida83urud);
        English=getResources().getString(R.string.maida83english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.maida114arbi);
        Urdu=getResources().getString(R.string.maida114urdu);
        English=getResources().getString(R.string.maida114english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.arfat23arbi);
        Urdu=getResources().getString(R.string.arfat23udru);
        English=getResources().getString(R.string.arfat23english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.arfat47arbi);
        Urdu=getResources().getString(R.string.arfat47udru);
        English=getResources().getString(R.string.arfat47english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.arfat89arbi);
        Urdu=getResources().getString(R.string.arfat89urdu);
        English=getResources().getString(R.string.arfat89english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.arfat126arbi);
        Urdu=getResources().getString(R.string.arfat126urdu);
        English=getResources().getString(R.string.arfat126english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.younas85arbi);
        Urdu=getResources().getString(R.string.younas85urdu);
        English=getResources().getString(R.string.younas85english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.abrahim38arbi);
        Urdu=getResources().getString(R.string.abrahim38urdu);
        English=getResources().getString(R.string.abrahim38english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.abrahim40arbi);
        Urdu=getResources().getString(R.string.abrahim40urdu);
        English=getResources().getString(R.string.abrahim40english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.abrahim41arbi);
        Urdu=getResources().getString(R.string.abrahim41urdu);
        English=getResources().getString(R.string.abrahim41english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));


        Arbi= getResources().getString(R.string.kaf10arbi);
        Urdu=getResources().getString(R.string.kaf10urdu);
        English=getResources().getString(R.string.kaf10english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.taha45arbi);
        Urdu=getResources().getString(R.string.taha45urdu);
        English=getResources().getString(R.string.tah45english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.mominon109arbi);
        Urdu=getResources().getString(R.string.mominon109urdu);
        English=getResources().getString(R.string.mominon109english);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.furqan65arbi);
        English=getResources().getString(R.string.furqan65english);
        Urdu=getResources().getString(R.string.furqan65urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.furqan74arbi);
        English=getResources().getString(R.string.furqan74english);
        Urdu=getResources().getString(R.string.furqan74urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.fatar34arbi);
        English=getResources().getString(R.string.fatar34english);
        Urdu=getResources().getString(R.string.fatar34urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.aqar7arbi);
        English=getResources().getString(R.string.aqar7english);
        Urdu=getResources().getString(R.string.aqar7urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.afar8arbi);
        English=getResources().getString(R.string.afar8english);
        Urdu=getResources().getString(R.string.afar8urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.hassar10arbi);
        English=getResources().getString(R.string.hassar10english);
        Urdu=getResources().getString(R.string.hassar10urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.hassar10_2arbi);
        English=getResources().getString(R.string.hassar10_2english);
        Urdu=getResources().getString(R.string.hassar10_2urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.mumham4arbi);
        English=getResources().getString(R.string.mumham4english);
        Urdu=getResources().getString(R.string.mumham4urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.mumham5arbi);
        English=getResources().getString(R.string.mumham5english);
        Urdu=getResources().getString(R.string.mumham5urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));

        Arbi= getResources().getString(R.string.taharam8arbi);
        English=getResources().getString(R.string.taharam8english);
        Urdu=getResources().getString(R.string.taharam8urdu);
        arrayList.add(new DuaQuraniPojo(Arbi,Urdu,English));


        adapter=new QuranDuaAdapter(arrayList,QuranDua.this);
        recyclerView.setAdapter(adapter);
    }
}
