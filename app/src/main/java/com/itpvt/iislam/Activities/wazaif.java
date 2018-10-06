package com.itpvt.iislam.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import com.itpvt.iislam.Activities.Adapters.TitleAdapter;
import com.itpvt.iislam.Activities.PojoClass.MasnoonDuaPoji;
import com.itpvt.iislam.R;

import java.util.ArrayList;

public class wazaif extends AppCompatActivity {
    ArrayList<MasnoonDuaPoji> arrayList=new ArrayList<>();
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink;
    RecyclerView recyclerView;
    TitleAdapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_wazaif);



        recyclerView=(RecyclerView)findViewById(R.id.quran_recycler);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        Title= getResources().getString(R.string.daroodibrahimTitle);
        TitleUrdu=" ";
        Urdu=" ";
        Ref= " ";
        RefLink=" ";
        Arbi= getResources().getString(R.string.daroodibrahimarbi);

        English=getResources().getString(R.string.daroodibrahimenglish);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

//        Title= getResources().getString(R.string.daroodtajTitle);
//        Arbi= getResources().getString(R.string.daroodtajarbi);
//        English=getResources().getString(R.string.darooditajenglish);
//        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.janzeTitle);
        TitleUrdu=" ";
        Urdu=" ";
        Ref= " ";
        RefLink=" ";
        Arbi= getResources().getString(R.string.janzearbi);
        English=getResources().getString(R.string.janzeenglish);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.imanMufalTitle);
        TitleUrdu=" ";
        English=getResources().getString(R.string.TheSummaryDeclarationofFaith);
        Ref= " ";
        RefLink=" ";
        Arbi= getResources().getString(R.string.imanMufalarbi);
        Urdu=getResources().getString(R.string.imanMufalurdu);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.imanMujamalTitle);
        Arbi= getResources().getString(R.string.imanMujamalarbi);
        TitleUrdu=" ";
        English=getResources().getString(R.string.IMAN_E_MUFASSILEnglish);
        Ref= " ";
        RefLink=" ";
        Urdu=getResources().getString(R.string.imanMujamalurdu);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.daroodtanjilaTitle);
        Arbi= getResources().getString(R.string.daroodtanjilaTarbi);
//        Urdu=getResources().getString(R.string.imanMujamalurdu);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        Title= getResources().getString(R.string.namaz_dua_ast);
        Arbi= getResources().getString(R.string.namaz_dua_ast_arbi);
        TitleUrdu=" ";
        English=" ";
        Ref= " ";
        RefLink=" ";
        Urdu=getResources().getString(R.string.namaz_dua_ast_urdu);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.namaz_dua_awal);
        Arbi= getResources().getString(R.string.namaz_dua_awal_arbi);
        Urdu=getResources().getString(R.string.namaz_dua_awal_urdu);
        TitleUrdu=" ";
        English=" ";
        Ref= " ";
        RefLink=" ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.namaz_dua_Dom);
        Arbi= getResources().getString(R.string.namaz_dua_Dom_arbi);
        Urdu=getResources().getString(R.string.namaz_dua_Dom_urdu);
        TitleUrdu=" ";
        English=" ";
        Ref= " ";
        RefLink=" ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.namaz_Zikar_awal);
        Arbi= getResources().getString(R.string.namaz_Zikar_awal_info);
        Urdu=getResources().getString(R.string.namaz_Zikar_awal_arbi);
        TitleUrdu=" ";
        English=getResources().getString(R.string.namaz_Zikar_awal_urdu);
        Ref= " ";
        RefLink=" ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.namaz_Zikar_Dom);
        Arbi= getResources().getString(R.string.namaz_Zikar_Dom_arbi);
        Urdu=getResources().getString(R.string.namaz_Zikar_Dom_urdu);
        TitleUrdu=" ";
        English=" ";
        Ref= " ";
        RefLink=" ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        adapter=new TitleAdapter(arrayList,wazaif.this);
        recyclerView.setAdapter(adapter);
    }
}
