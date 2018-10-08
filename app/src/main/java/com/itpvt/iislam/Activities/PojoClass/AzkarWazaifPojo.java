package com.itpvt.iislam.Activities.PojoClass;

/**
 * Created by Hassan on 10/4/2018.
 */

public class AzkarWazaifPojo {

    private  String Title,TitleUdru;
    private String Arbi;

    public AzkarWazaifPojo(String title, String TitleUdru, String arbi) {
        Title = title;
        this.TitleUdru = TitleUdru;
        Arbi = arbi;



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
