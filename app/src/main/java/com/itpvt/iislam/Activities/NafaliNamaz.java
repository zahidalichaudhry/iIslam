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
    String Title,TitleUrdu,Arbi;
//            Urdu,English,Ref,RefLink, title1, title2, title3, title4,title5,title6, title7,title8,title9,
          //  title10,title11,title12,title13,title14,title15,title16,title17,title18,title19,title20,title21,title22;
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

//
        Title= getResources().getString(R.string.titletahajad);
        TitleUrdu=getResources().getString(R.string.titletahajad);
        Arbi= getResources().getString(R.string.tahajad);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));
//
        Title= getResources().getString(R.string.ttileishtarak);
        TitleUrdu=getResources().getString(R.string.ttileishtarak);
        Arbi= getResources().getString(R.string.ishatarak);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));


///
        Title= getResources().getString(R.string.titlechasht);
        TitleUrdu=getResources().getString(R.string.titlechasht);
        Arbi= getResources().getString(R.string.chasht);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));


//
        Title= getResources().getString(R.string.titleawaleen);
        TitleUrdu=getResources().getString(R.string.titleawaleen);
        Arbi= getResources().getString(R.string.awaleen);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));



//
        Title= getResources().getString(R.string.titletoba);
        TitleUrdu=getResources().getString(R.string.titletoba);
        Arbi= getResources().getString(R.string.toba);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));



//
        Title= getResources().getString(R.string.titletasbeeh);
        TitleUrdu=getResources().getString(R.string.titletasbeeh);
        Arbi= getResources().getString(R.string.tasbeeh);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));
//
        Title= getResources().getString(R.string.titlehajt);
        TitleUrdu=getResources().getString(R.string.titlehajt);
        Arbi= getResources().getString(R.string.hajt);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));

//
        Title= getResources().getString(R.string.titleistakhara);
        TitleUrdu=getResources().getString(R.string.titleistakhara);
        Arbi= getResources().getString(R.string.istakhara);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));

//
        Title= getResources().getString(R.string.titlemsjd);
        TitleUrdu=getResources().getString(R.string.titlemsjd);
        Arbi= getResources().getString(R.string.msjd);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));
//
        Title= getResources().getString(R.string.titleistaksa);
        TitleUrdu=getResources().getString(R.string.titleistaksa);
        Arbi= getResources().getString(R.string.isatakasa);
        arrayList.add(new NafliNamazPojo(Title,TitleUrdu,Arbi));






        adapter= new NafliNamazAdapter(arrayList,NafaliNamaz.this);
        recyclerView.setAdapter(adapter);

    }
}
