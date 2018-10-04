package com.itpvt.iislam.Activities;

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

public class AzkarBaad extends AppCompatActivity {
    ArrayList<AzkarWazaifPojo> arrayList=new ArrayList<>();
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink, title1, title2, title3, title4,title5,title6, title7,title8,title9;
    RecyclerView recyclerView;
    AzkarAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_azkar_baad);
        recyclerView=(RecyclerView)findViewById(R.id.azkar);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        Title= getResources().getString(R.string.FarzNamazWazaifTitle);
        TitleUrdu=getResources().getString(R.string.Dua_k_Bad);
        Arbi= getResources().getString(R.string.AfterDua_surahfatiha);
        Urdu=getResources().getString(R.string.AfterDua_aitalkursi);
        Ref= getResources().getString(R.string.AfterDua_zikrha);
        RefLink=getResources().getString(R.string.AfterDua_astagfar);

        title1=getResources().getString(R.string.AfterDua_astagfarr);
        title2=getResources().getString(R.string.AfterDua_farmaya);
        title3=getResources().getString(R.string.AfterDua_jofarmaya);
        title4=getResources().getString(R.string.AfterDua_hasab);
        title5=getResources().getString(R.string.AfterDua_tarika);
        title6=getResources().getString(R.string.AfterDua_ayat);
        title7=getResources().getString(R.string.AfterDua_sobar);
        title8=getResources().getString(R.string.AfterDua_tasbeeh);





        Title= getResources().getString(R.string.FarzNamazWazaifTitle);
        TitleUrdu=getResources().getString(R.string.DuaSePhlyTitle);
        Arbi= getResources().getString(R.string.DuaSePhly);
        Urdu=getResources().getString(R.string.Dua_Se_phly_);
        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
                ,title3,title4,title5,title6,title7,title8));


        adapter= new AzkarAdapter(arrayList,AzkarBaad.this);
        recyclerView.setAdapter(adapter);
    }
}
