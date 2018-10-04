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
    String Title,TitleUrdu,Arbi,Urdu,English,Ref,RefLink;
    RecyclerView recyclerView;
    TitleAdapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_masnoon_dua_list);

        recyclerView=(RecyclerView)findViewById(R.id.quran_recycler);
        layoutManager=new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        Arbi= getResources().getString(R.string.masjidentryarbi);
        Urdu=getResources().getString(R.string.masjidentryurdu);
        Title= getResources().getString(R.string.masjidentryTitle);
        English=" ";
        Ref= getResources().getString(R.string.masjidentryref);
        RefLink=getResources().getString(R.string.masjidentryreflink);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.masjidexitTitle);
        Arbi= getResources().getString(R.string.masjidexitarbi);
        Urdu=getResources().getString(R.string.masjidexiturdu);
        English=" ";
        RefLink=getResources().getString(R.string.masjidexitreflink);
        Ref= getResources().getString(R.string.masjidexitref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftervazoTitle);
        Arbi= getResources().getString(R.string.aftervazoarbi);
        Urdu=getResources().getString(R.string.aftervazourdu);
        English=" ";
        RefLink=getResources().getString(R.string.aftervazoreflink);
        Ref= getResources().getString(R.string.aftervazoref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.afterAzanTitle);
        Arbi= getResources().getString(R.string.afterAzanarbi);
        Urdu=getResources().getString(R.string.afterAzanurdu);
        English=" ";
        RefLink=getResources().getString(R.string.afterAzanreflink);
        Ref= getResources().getString(R.string.afterAzanref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        Title= getResources().getString(R.string.beforesleepTitle);
        Arbi= getResources().getString(R.string.beforesleeparbi);
        Urdu=getResources().getString(R.string.beforesleepurdu);
        English=" ";
        RefLink=getResources().getString(R.string.beforesleepreflink);
        Ref= getResources().getString(R.string.beforesleepref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftersleepTitle);
        Arbi= getResources().getString(R.string.aftersleeparbi);
        Urdu=getResources().getString(R.string.aftersleepurdu);
        English=" ";
        RefLink=getResources().getString(R.string.aftersleepreflink);
        Ref= getResources().getString(R.string.aftersleepref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.afraidsleepTitle);
        Arbi= getResources().getString(R.string.afraidsleeparbi);
        Urdu=getResources().getString(R.string.afraidsleepurdu);
        English=" ";
        RefLink=getResources().getString(R.string.afraidsleepreflink);
        Ref= getResources().getString(R.string.afraidsleepref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftereatingTitle);
        Arbi= getResources().getString(R.string.aftereatingarbi);
        Urdu=getResources().getString(R.string.aftereatingurdu);
        English=" ";
        RefLink=getResources().getString(R.string.aftereatingreflink);
        Ref= getResources().getString(R.string.aftereatingref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.forprovidfoodTitle);
        Arbi= getResources().getString(R.string.forprovidfoodarbi);
        Urdu=getResources().getString(R.string.forprovidfoodurdu);
        English=" ";
        RefLink=getResources().getString(R.string.forprovidfoodreflink);
        Ref= getResources().getString(R.string.forprovidfoodref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.drinkmilkTitle);
        Arbi= getResources().getString(R.string.drinkmilkarbi);
        Urdu=getResources().getString(R.string.drinkmilkurdu);
        English=" ";
        RefLink=getResources().getString(R.string.drinkmilkreflink);
        Ref= getResources().getString(R.string.drinkmilkref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));



        Title= getResources().getString(R.string.AfterDrinkingMilkTitleenglish);
        TitleUrdu=getResources().getString(R.string.AfterdrinkingMilkTitleUrdu);
        Arbi= getResources().getString(R.string.AfterDrinkingMilkInArbi);
        Urdu=getResources().getString(R.string.AfterDrinkingMilkInUrdu);
        English=getResources().getString(R.string.AfterDrinkingMilkInEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.travelTitle);
        Arbi= getResources().getString(R.string.travelarbi);
        Urdu=getResources().getString(R.string.travelurdu);
        RefLink=getResources().getString(R.string.travelreflink);
        Ref= getResources().getString(R.string.travelref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.AfterLeavingToiletTitleenglish);
        TitleUrdu=getResources().getString(R.string.AfterLeavingToiletTitleUrdu);
        Arbi= getResources().getString(R.string.AfterLeavingToiletInArbi);
        Urdu=getResources().getString(R.string.AfterLeavingToiletInUrdu);
        English=getResources().getString(R.string.AfterLeavingToiletInEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.AtThetimeofdressingTitleEnglish);
        TitleUrdu=getResources().getString(R.string.AtThetimeofdressingTitleUrdu);
        Arbi= getResources().getString(R.string.AtThetimeofdressingArbi);
        Urdu=getResources().getString(R.string.AtThetimeofdressingUrdu);
        English=getResources().getString(R.string.AtThetimeofdressingenglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.AtTheTimeOfLoweringADeadBodyIntoAGraveTitleEnglish);
        TitleUrdu=getResources().getString(R.string.AtTheTimeOfLoweringADeadBodyIntoAGraveTitleUrdu);
        Arbi= getResources().getString(R.string.AtTheTimeOfLoweringADeadBodyIntoAGraveArbi);
        Urdu=getResources().getString(R.string.AtTheTimeOfLoweringADeadBodyIntoAGraveUrdu);
        English=getResources().getString(R.string.AtTheTimeOfLoweringADeadBodyIntoAGraveEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaBeforeEnteringToiletTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaBeforeEnteringToiletTitleUrdu);
        Arbi= getResources().getString(R.string.DuaBeforeEnteringToiletArbi);
        Urdu=getResources().getString(R.string.DuaBeforeEnteringToiletUrdu);
        English=getResources().getString(R.string.DuaBeforeEnteringToiletEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaBeforeMealsTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaBeforeMealsTitleUrdu);
        Arbi= getResources().getString(R.string.DuaBeforeMealsTArbi);
        Urdu=getResources().getString(R.string.DuaBeforeMealsTUrdu);
        English=getResources().getString(R.string.DuaBeforeMealsEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaBeforeSleepingTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaBeforeSleepingTitleUrdu);
        Arbi= getResources().getString(R.string.DuaBeforeSleepingArbi);
        Urdu=getResources().getString(R.string.DuaBeforeSleepingUrdu);
        English=getResources().getString(R.string.DuaBeforeSleepingEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaBeforeWudhuTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaBeforeWudhuTitleUrdu);
        Arbi= getResources().getString(R.string.DuaBeforeWudhuArbi);
        Urdu=getResources().getString(R.string.DuaBeforeWudhuUrdu);
        English=getResources().getString(R.string.DuaBeforeWudhuEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        Title= getResources().getString(R.string.DuaforIftarTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaforIftarTitleUrdu);
        Arbi= getResources().getString(R.string.DuaforIftarArbi);
        Urdu=getResources().getString(R.string.DuaforIftarUrdu);
        English=getResources().getString(R.string.DuaforIftarEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaofSehriTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaofSehriTitleUrdu);
        Arbi= getResources().getString(R.string.DuaofSehriArbi);
        Urdu=getResources().getString(R.string.DuaofSehriUrdu);
        English=getResources().getString(R.string.DuaofSehriEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        adapter=new TitleAdapter(arrayList,Masnoon_dua_list.this);
        recyclerView.setAdapter(adapter);
    }
}
