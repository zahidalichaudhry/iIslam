package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.AzkarAdapter;
import com.itpvt.iislam.Activities.Adapters.TitleAdapter;
import com.itpvt.iislam.Activities.PojoClass.AzkarWazaifPojo;
import com.itpvt.iislam.Activities.PojoClass.MasnoonDuaPoji;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class Azkar extends AppCompatActivity {


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
        setContentView(R.layout.activity_azkar);

        recyclerView=(RecyclerView)findViewById(R.id.azkar);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);


        Title= getResources().getString(R.string.FarzNamazWazaifTitle);
       TitleUrdu=getResources().getString(R.string.DuaSePhlyTitle);
        Arbi= getResources().getString(R.string.DuaSePhly);
        Urdu=getResources().getString(R.string.Dua_Se_phly_);
        Ref= getResources().getString(R.string.Dua_Se_phly_talawatt);
        RefLink=getResources().getString(R.string.Dua_Se_phly_Azaentasbe);

        title1=getResources().getString(R.string.Dua_Se_phly_zikrAllah);
        title2=getResources().getString(R.string.Dua_Se_phly_zailtasbeeh);
        title3=getResources().getString(R.string.Dua_Se_phly_zailtasbeehzikr);
        title4=getResources().getString(R.string.Dua_Se_phly_ikhtatam);
        title5=getResources().getString(R.string.Dua_Se_phly_ikhtmampar);
        title6=getResources().getString(R.string.Dua_Se_phly_refer);
        title7=getResources().getString(R.string.Dua_Se_phly_barkaat);
        title8=getResources().getString(R.string.Dua_Se_phly_ref);
        Title= getResources().getString(R.string.FarzNamazWazaifTitle);
        TitleUrdu=getResources().getString(R.string.DuaSePhlyTitle);
        Arbi= getResources().getString(R.string.DuaSePhly);
        Urdu=getResources().getString(R.string.Dua_Se_phly_);
        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
                ,title3,title4,title5,title6,title7,title8));


        Title= getResources().getString(R.string.NamzaZoharAsarTitle);
        TitleUrdu=getResources().getString(R.string.NamzaZoharAsarazkarwazaif);
        Arbi= getResources().getString(R.string.NamzaZoharAsar_DuaSePhly);
        Urdu=getResources().getString(R.string.NamzaZoharAsar_NamzaZoharAsar_phly_zikr);
        Ref= getResources().getString(R.string.NamzaZoharAsar_phly_ayatno);
        RefLink=getResources().getString(R.string.NamzaZoharAsar_phly_ayat);

        title1=getResources().getString(R.string.NamzaZoharAsar_phly_tasbeeh);
        title2=getResources().getString(R.string.NamzaZoharAsar_phly_zikrAllah);
        title3=getResources().getString(R.string.NamzaZoharAsar_phly_tasbeeeh);
        title4=getResources().getString(R.string.NamzaZoharAsar_phly_tasbih);
        title5=getResources().getString(R.string.NamzaZoharAsar_phly_duakaren);
        title6=getResources().getString(R.string.NamzaZoharAsar_phly_afterdua);
        title7=getResources().getString(R.string.NamzaZoharAsar_phly_ayaat);
        title8=getResources().getString(R.string.NNamzaZoharAsar_phly_ref);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
        ,title3,title4,title5,title6,title7,title8));



        Title= getResources().getString(R.string.NamzaMagrib_Title);
        TitleUrdu=getResources().getString(R.string.NamzaMagrib_azkarewazaif);
        Arbi= getResources().getString(R.string.NamzaMagrib_DuasePhly);
        Urdu=getResources().getString(R.string.NamzaMagrib_phly_zikr);
        Ref= getResources().getString(R.string.NamzaMagrib_phly_ayatno);
        RefLink=getResources().getString(R.string.NamzaMagrib_phly_ayat);

        title1=getResources().getString(R.string.NamzaMagrib_phly_tasbeeh);
        title2=getResources().getString(R.string.NamzaMagrib_phly_zikrAllah);
        title3=getResources().getString(R.string.NamzaMagrib_phly_tasbih);
        title4=getResources().getString(R.string.NamzaMagrib_phly_tasbiih);
        title5=getResources().getString(R.string.NamzaMagrib_phly_againdua);
        title6=getResources().getString(R.string.NamzaMagrib_phly_attheend);
        title7=getResources().getString(R.string.NamzaMagrib_phly_dua);
        title8=getResources().getString(R.string.NamzaMagrib_phly_duaref);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
                ,title3,title4,title5,title6,title7,title8));



        Title= getResources().getString(R.string.NamzaEshaa_Title);
        TitleUrdu=getResources().getString(R.string.NamzaEshaa_phly_DuasePhly);
        Arbi= getResources().getString(R.string.NamzaEshaa_phly_zikr);
        Urdu=getResources().getString(R.string.NamzaEshaa_phly_ayatno);
        Ref= getResources().getString(R.string.NamzaEshaa_phly_ayat);
        RefLink=getResources().getString(R.string.NamzaEshaa_phly_tasbeeh);

        title1=getResources().getString(R.string.NamzaEshaa_phly_zikrAllah);
        title2=getResources().getString(R.string.zikrr);
        title3=getResources().getString(R.string.NamzaEshaa_phly_againdua);
        title4=getResources().getString(R.string.NamzaEshaa_phly_attheend);
        title5=getResources().getString(R.string.NamzaEshaa_phly_dua);
        title6=getResources().getString(R.string.NamzaEshaa_phly_duaref);
       title7=getResources().getString(R.string.khaali);
       title8=getResources().getString(R.string.khali);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
                ,title3,title4,title5,title6,title7,title8));


        Title= getResources().getString(R.string.NamzaJuma_Title);
        TitleUrdu=getResources().getString(R.string.NamzaJuma_ayat);
        Arbi= getResources().getString(R.string.NamzaJuma_ref);
        Urdu=getResources().getString(R.string.NamzaJuma_tarjuma_ayat);
        Ref= getResources().getString(R.string.NamzaJuma_namaz);
        RefLink=getResources().getString(R.string.NamzaJuma_sharat_title);

        title1=getResources().getString(R.string.NamzaJuma_sharat_follo);
        title2=getResources().getString(R.string.NamzaJuma_sharaat);
        title3=getResources().getString(R.string.NamzaJuma_masail_title);
        title4=getResources().getString(R.string.NamzaJuma_masail);
        title5=getResources().getString(R.string.khali);
        title6=getResources().getString(R.string.khali);
        title7=getResources().getString(R.string.khaali);
        title8=getResources().getString(R.string.khali);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
                ,title3,title4,title5,title6,title7,title8));


        Title= getResources().getString(R.string.NamazEid_Title);
        TitleUrdu=getResources().getString(R.string.NamazEid_irshad);
        Arbi= getResources().getString(R.string.NamazEid_tarjma);
        Urdu=getResources().getString(R.string.NamazEid_again_title);
        Ref= getResources().getString(R.string.NamazEid_again);
        RefLink=getResources().getString(R.string.NamazEid_tarjumaa);

        title1=getResources().getString(R.string.NamazEid_info);
        title2=getResources().getString(R.string.NamazEid_method_title);
        title3=getResources().getString(R.string.NamazEid_method);
        title4=getResources().getString(R.string.NamazEid_mastahbat_title);
        title5=getResources().getString(R.string.NamazEid_detail_mastahbat_title);
        title6=getResources().getString(R.string.NamazEid_mashabat);
        title7=getResources().getString(R.string.NamazEid_kalmaat);
        title8=getResources().getString(R.string.NamazEid_infoo);


        arrayList.add(new AzkarWazaifPojo(Title,TitleUrdu,Arbi,Urdu,Ref,RefLink,title1,title2
                ,title3,title4,title5,title6,title7,title8));

        adapter= new AzkarAdapter(arrayList,Azkar.this);
        recyclerView.setAdapter(adapter);

    }
}
