package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.AzkarAdapterBaad;
import com.itpvt.iislam.Activities.PojoClass.AzkarAdapterBaadPojo;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class AzkarBaad extends AppCompatActivity {
    ArrayList<AzkarAdapterBaadPojo> arrayList=new ArrayList<AzkarAdapterBaadPojo>();
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink, title1, title2, title3, title4,title5,title6, title7,title8,title9,
            title10,title11,title12,title13,title14,title15,title16,title17,title18;
    RecyclerView recyclerView;
    AzkarAdapterBaad adapter;
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

//        title1=getResources().getString(R.string.AfterDua_astagfarr);
//        title2=getResources().getString(R.string.AfterDua_farmaya);
//        title3=getResources().getString(R.string.AfterDua_jofarmaya);
//        title4=getResources().getString(R.string.AfterDua_hasab);
//        title5=getResources().getString(R.string.AfterDua_tarika);
//        title6=getResources().getString(R.string.AfterDua_ayat);
//        title7=getResources().getString(R.string.AfterDua_sobar);
//        title8=getResources().getString(R.string.AfterDua_tasbeeh);
//        title9=getResources().getString(R.string.AfterDua_ayaat);
//        title10=getResources().getString(R.string.AfterDua_barkaaat);
//        title11=getResources().getString(R.string.AfterDua_prhna);
//        title12=getResources().getString(R.string.AfterDua_darood);
//        title13=getResources().getString(R.string.kalmat);
//        title14=getResources().getString(R.string.AfterDua_talawat);
//        title15=getResources().getString(R.string.AfterDua_dalael);
//        title16=getResources().getString(R.string.AfterDua_kasida);
//        title17=getResources().getString(R.string.AfterDua_kasidagosia);
//        title18=getResources().getString(R.string.AfterDua_moreforgood);


        arrayList.add(new AzkarAdapterBaadPojo(Title,TitleUrdu,Arbi));


        Title= getResources().getString(R.string.NamzaZoharAsarTitle);
        TitleUrdu=getResources().getString(R.string.NamzaZoharAsar_Dua_k_Bad);
        Arbi= getResources().getString(R.string.NamzaZoharAsar_bad_fatiha);

        arrayList.add(new AzkarAdapterBaadPojo(Title,TitleUrdu,Arbi
        ));

//        Urdu=getResources().getString(R.string.NamzaZoharAsar_Dua_k_Bad);
//        Ref= getResources().getString(R.string.khali);
//        RefLink=getResources().getString(R.string.khali);
//
//        title1=getResources().getString(R.string.NamzaZoharAsar_bad_fatiha);
//        title2=getResources().getString(R.string.khali);
//        title3=getResources().getString(R.string.khali);
//        title4=getResources().getString(R.string.NamzaZoharAsar_bad_aitalkursi);
//        title5=getResources().getString(R.string.khali);
//        title6=getResources().getString(R.string.khali);
//        title7=getResources().getString(R.string.NamzaZoharAsar_bad_astagfar);
//        title8=getResources().getString(R.string.khali);
//        title9=getResources().getString(R.string.NamzaZoharAsar_bad_ayatt);
//        title10=getResources().getString(R.string.khali);
//        title11=getResources().getString(R.string.khali);
//        title12=getResources().getString(R.string.NamzaZoharAsar_bad_darood);
//        title13=getResources().getString(R.string.khali);
//        title14=getResources().getString(R.string.khali);
//        title15=getResources().getString(R.string.NamzaZoharAsar_bad_daaroood);
//        title16=getResources().getString(R.string.khali);
//        title17=getResources().getString(R.string.khali);
//        title18=getResources().getString(R.string.khali);





        Title= getResources().getString(R.string.NamzaMagrib_Title);
        TitleUrdu=getResources().getString(R.string.NamzaMagrib_Dua_k_Bad);
        Arbi= getResources().getString(R.string.NamzaMagrib_Bad_fatiha);

        arrayList.add(new AzkarAdapterBaadPojo(Title,TitleUrdu,Arbi
        ));


//        Urdu=getResources().getString(R.string.khali);
//        Ref= getResources().getString(R.string.NamzaMagrib_Bad_aitalkursi);
//        RefLink=getResources().getString(R.string.khali);
//
//        title1=getResources().getString(R.string.NamzaMagrib_Bad_astagfar);
//        title2=getResources().getString(R.string.khali);
//        title3=getResources().getString(R.string.NamzaMagrib_Bad_ayat);
//        title4=getResources().getString(R.string.khali);
//        title5=getResources().getString(R.string.NamzaMagrib_Bad_darood);
//        title6=getResources().getString(R.string.NamzaMagrib_Bad_daarood);
//        title7=getResources().getString(R.string.NamzaMagrib_Bad_shahadat);
//        title8=getResources().getString(R.string.NamzaMagrib_Bad_kalma);
//        title9=getResources().getString(R.string.NamzaMagrib_Bad_nafal);
//        title10=getResources().getString(R.string.NamzaMagrib_Bad_tareeka);
//        title11=getResources().getString(R.string.NamzaMagrib_Bad_khairatyomia);
//        title12=getResources().getString(R.string.NamzaMagrib_Bad_kasida);
//        title13=getResources().getString(R.string.khali);
//        title14=getResources().getString(R.string.NamzaMagrib_Bad_gosia);
//        title15=getResources().getString(R.string.khali);
//        title16=getResources().getString(R.string.NamzaMagrib_Bad_formore);
//        title17=getResources().getString(R.string.khali);
//        title18=getResources().getString(R.string.khali);




        Title= getResources().getString(R.string.NamzaEshaa_Title);
        TitleUrdu=getResources().getString(R.string.NamzaEshaa_bad_Dua_k_Bad);
        Arbi= getResources().getString(R.string.NamzaEshaa_bad_aitalkursi);



        arrayList.add(new AzkarAdapterBaadPojo(Title,TitleUrdu,Arbi
        ));


        adapter= new AzkarAdapterBaad(arrayList,AzkarBaad.this);
        recyclerView.setAdapter(adapter);
    }
}
