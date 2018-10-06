package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.AzkarAdapterBaad;
import com.itpvt.iislam.Activities.Adapters.FarzNamazAdapter;
import com.itpvt.iislam.Activities.Adapters.NafliNamazAdapter;
import com.itpvt.iislam.Activities.PojoClass.AzkarAdapterBaadPojo;
import com.itpvt.iislam.Activities.PojoClass.FarzNamazPojo;
import com.itpvt.iislam.Activities.PojoClass.NafliNamazPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class NafaliNamaz extends AppCompatActivity {

    ArrayList<NafliNamazPojo> arrayList=new ArrayList<NafliNamazPojo>();
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink, title1, title2, title3, title4,title5,title6, title7,title8,title9,
            title10,title11,title12,title13,title14,title15,title16,title17,title18,title19,title20,title21,title22;
    RecyclerView recyclerView;
    NafliNamazAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_nafali_namaz);


        recyclerView=(RecyclerView)findViewById(R.id.azkar);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        Title= getResources().getString(R.string.titlenafli);
        TitleUrdu=getResources().getString(R.string.titletahajad);
        Arbi= getResources().getString(R.string.tahajad);
        Urdu=getResources().getString(R.string.ttileishtarak);
        Ref= getResources().getString(R.string.ishatarak);
        RefLink=getResources().getString(R.string.titlechasht);

        title1=getResources().getString(R.string.chasht);
        title2=getResources().getString(R.string.titleawaleen);
        title3=getResources().getString(R.string.awaleen);
        title4=getResources().getString(R.string.titletoba);
        title5=getResources().getString(R.string.toba);
        title6=getResources().getString(R.string.titletasbeeh);
        title7=getResources().getString(R.string.tasbeeh);
        title8=getResources().getString(R.string.titlehajt);
        title9=getResources().getString(R.string.hajt);
        title10=getResources().getString(R.string.titleistakhara);
        title11=getResources().getString(R.string.istakhara);
        title12=getResources().getString(R.string.titlewazu);
        title13=getResources().getString(R.string.wazu);
        title14=getResources().getString(R.string.titlemsjd);
        title15=getResources().getString(R.string.msjd);
        title16=getResources().getString(R.string.titleistaksa);
        title17=getResources().getString(R.string.isatakasa);
        title18=getResources().getString(R.string.AfterDua_moreforgood);

        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2,title3,title4,title5,title6
        ,title7,title8,title9,title10,title11,title12,title13,title14,title15,title16,title17,title18));

        adapter= new NafliNamazAdapter(arrayList,NafaliNamaz.this);
        recyclerView.setAdapter(adapter);

    }
}
