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

//        Arbi= getResources().getString(R.string.masjidentryarbi);
//        Urdu=getResources().getString(R.string.masjidentryurdu);
//        Title= getResources().getString(R.string.masjidentryTitle);
//        English=" ";
//        Ref= getResources().getString(R.string.masjidentryref);
//        RefLink=getResources().getString(R.string.masjidentryreflink);
//        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

//        Title= getResources().getString(R.string.masjidexitTitle);
//        Arbi= getResources().getString(R.string.masjidexitarbi);
//        Urdu=getResources().getString(R.string.masjidexiturdu);
//        English=" ";
//        RefLink=getResources().getString(R.string.masjidexitreflink);
//        Ref= getResources().getString(R.string.masjidexitref);
//        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.aftervazoTitle);
        Arbi= getResources().getString(R.string.aftervazoarbi);
        Urdu=getResources().getString(R.string.aftervazourdu);
        English=" ";
        RefLink=getResources().getString(R.string.aftervazoreflink);
        Ref= getResources().getString(R.string.aftervazoref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));
//
//        Title= getResources().getString(R.string.afterAzanTitle);
//        Arbi= getResources().getString(R.string.afterAzanarbi);
//        Urdu=getResources().getString(R.string.afterAzanurdu);
//        English=" ";
//        RefLink=getResources().getString(R.string.afterAzanreflink);
//        Ref= getResources().getString(R.string.afterAzanref);
//        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


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
//
//        Title= getResources().getString(R.string.travelTitle);
//        Arbi= getResources().getString(R.string.travelarbi);
//        Urdu=getResources().getString(R.string.travelurdu);
//        RefLink=getResources().getString(R.string.travelreflink);
//        Ref= getResources().getString(R.string.travelref);
//        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

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


        Title= getResources().getString(R.string.DuauponSneezingTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuauponSneezingTitleUrdu);
        Arbi= getResources().getString(R.string.DuauponSneezingArbi);
        Urdu=getResources().getString(R.string.DuauponSneezingUrdu);
        English=getResources().getString(R.string.DuauponSneezingEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenDiningatSomeone_sHouseTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenDiningatSomeone_sHouseTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenDiningatSomeone_HsouseArbi);
        Urdu=getResources().getString(R.string.DuaWhenDiningatSomeone_sHouseUrdu);
        English=getResources().getString(R.string.DuaWhenDiningatSomeone_sHouseEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenDrinkingZamZamWaterTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenDrinkingZamZamWaterTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenDrinkingZamzamWaterArbi);
        Urdu=getResources().getString(R.string.DuaWhenDrinkingZamZamWaterUrdu);
        English=getResources().getString(R.string.DuaWhenDrinkingZamZamWaterEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenEnteringTheGraveyardTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenEnteringTheGraveyardTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenEnteringTheGraveyardArbi);
        Urdu=getResources().getString(R.string.DuaWhenEnteringTheGraveyardUrdu);
        English=getResources().getString(R.string.DuaWhenEnteringTheGraveyardEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));


        Title= getResources().getString(R.string.DuaWhenEnteringTheHomeTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenEnteringTheHomeTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenEnteringTheHomeArbi);
        Urdu=getResources().getString(R.string.DuaWhenEnteringTheHome_Urdu);
        English=getResources().getString(R.string.DuaWhenEnteringTheHomeEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenEnteringtheMosqueTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenEnteringtheMosqueTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenEnteringtheMosque_Arbi);
        Urdu=getResources().getString(R.string.DuaWhenEnteringtheMosqueUrdu);
        English=getResources().getString(R.string.DuaWhenEnteringtheMosqueEnglish);
        Ref= getResources().getString(R.string.masjidentryref);
        RefLink=getResources().getString(R.string.masjidentryreflink);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhen_Facing_Trouble_or_Difficulties_TitleEnglish);
        TitleUrdu=getResources().getString(R.string.Dua_WhenFacingTroubleorDifficultiesTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenFacingTroubleorDifficultiesArbi);
        Urdu=getResources().getString(R.string.DuaWhenFacingTroubleorDifficultiesUrdu);
        English=getResources().getString(R.string.DuaWhenFacingTroubleorDifficultiesEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenHearingSomeoneSneezeTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenHearingSomeoneSneezeTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenHearingSomeoneSneezeArbi);
        Urdu=getResources().getString(R.string.DuaWhenHearingSomeoneSneezeUrdu);
        English=getResources().getString(R.string.DuaWhenHearingSomeoneSneezeEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenLeavingtheMosqueTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenLeavingtheMosqueTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenLeavingtheMosqueArbi);
        Urdu=getResources().getString(R.string.DuaWhenLeavingtheMosqueUrdu);
        English=getResources().getString(R.string.DuaWhenLeavingtheMosqueEnglish);
        RefLink=getResources().getString(R.string.masjidexitreflink);
        Ref= getResources().getString(R.string.masjidexitref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenLookingintheMirrorTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenLookingintheMirrorTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenLookingintheMirrorArbi);
        Urdu=getResources().getString(R.string.DuaWhen_Looking_in_the_MirrorUrdu);
        English=getResources().getString(R.string.DuaWhenLookingintheMirrorEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenMeetingAnotherMuslimTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenMeetingAnotherMuslimTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenMeetingAnotherMuslimArbi);
        Urdu=getResources().getString(R.string.DuaWhenMeetingAnotherMuslimUrdu);
        English=getResources().getString(R.string.DuaWhenMeetingAnotherMuslimEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenWakingUPfromSleepTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenWakingUPfromSleepTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenWakingUPfromSleepArbi);
        Urdu=getResources().getString(R.string.DuaWhenWakingUPfromSleepUrdu);
        English=getResources().getString(R.string.DuaWhenWakingUPfromSleepEnglish);
        RefLink=getResources().getString(R.string.afterAzanreflink);
        Ref= getResources().getString(R.string.afterAzanref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenYouBecomeAngryTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenYouBecomeAngryTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenYouBecomeAngryArbi);
        Urdu=getResources().getString(R.string.DuaWhenYouBecomeAngryUrdu);
        English=getResources().getString(R.string.DuaWhenYouBecomeAngryEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuaWhenYouForgettoSayBismillahBeforeMealTitleEnglish);
        TitleUrdu=getResources().getString(R.string.DuaWhenYouForgettoSayBismillahBeforeMealTitleUrdu);
        Arbi= getResources().getString(R.string.DuaWhenYouForgettoSayBismillahBeforeMealArbi);
        Urdu=getResources().getString(R.string.DuaWhenYouForgettoSayBismillahBeforeMealUrdu);
        English=getResources().getString(R.string.DuaWhenYouForgettoSayBismillahBeforeMealEnglish);
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.DuafortheDeadTitleEnglish);
        TitleUrdu=" ";
        Arbi= getResources().getString(R.string.DuafortheDeadEnglish);
        Urdu=" ";
        English=" ";
        RefLink=" ";
        Ref= " ";
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        Title= getResources().getString(R.string.Dua_e_SafarTitleEnglish);
        TitleUrdu=getResources().getString(R.string.Dua_e_SafarTitleUrdu);
        Arbi= getResources().getString(R.string.Dua_e_SafarArbi);
        Urdu=getResources().getString(R.string.Dua_e_SafarUrdu);
        English=getResources().getString(R.string.DuaeSafarEnglish);
        RefLink=getResources().getString(R.string.travelreflink);
        Ref= getResources().getString(R.string.travelref);
        arrayList.add(new MasnoonDuaPoji(Title,Arbi,Urdu,English,Ref,RefLink));

        adapter=new TitleAdapter(arrayList,Masnoon_dua_list.this);
        recyclerView.setAdapter(adapter);
    }
}
