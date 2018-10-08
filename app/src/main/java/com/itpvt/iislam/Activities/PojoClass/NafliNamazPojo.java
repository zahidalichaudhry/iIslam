package com.itpvt.iislam.Activities.PojoClass;

/**
 * Created by Hassan on 10/5/2018.
 */

public class NafliNamazPojo {

    private String Title, title10,
            title11, title12, title13, title14, title15, TitleUdru, title16, title17, title18, title19, title20,title21,title22;

    private String Arbi;
//    private String Urdu;
//    private String English;
//    private String refrence;
//    private String refrenceLink;

    public NafliNamazPojo(String title, String TitleUdru, String arbi){
        Title = title;
        this.TitleUdru = TitleUdru;
        Arbi = arbi;
//        Urdu = urdu;
//
//        this.refrence = refrence;
//        this.refrenceLink = refrenceLink;
//        this.title1 = title1;
//        this.title2 = title2;
//        this.title3 = title3;
//        this.title4 = title4;
//        this.title5 = title5;
//        this.title6 = title6;
//        this.title7 = title7;
//        this.title8 = title8;
//        this.title9 = title9;
//
//        this.title10 = title10;
//        this.title11 = title11;
//        this.title12 = title12;
//        this.title13 = title13;
//        this.title14 = title14;
//        this.title15 = title15;
//        this.title16 = title16;
//        this.title17 = title17;
//        this.title18 = title18;
//        this.title19 = title19;
//        this.title20 = title20;
//        this.title20 = title21;
//        this.title20 = title22;

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }




    public String getTitleUdru() {
        return TitleUdru;
    }

    public void setTitleUdru(String titleUdru) {
        TitleUdru = titleUdru;
    }


    public String getArbi() {
        return Arbi;
    }

    public void setArbi(String arbi) {
        Arbi = arbi;
    }


}
