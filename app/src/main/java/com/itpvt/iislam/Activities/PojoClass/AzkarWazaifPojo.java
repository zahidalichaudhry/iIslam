package com.itpvt.iislam.Activities.PojoClass;

/**
 * Created by Hassan on 10/4/2018.
 */

public class AzkarWazaifPojo {

    private  String Title, title1, title2, title3, title4,title5,title6, title7,title8,title9,TitleUdru;
    private String Arbi;
    private String Urdu;
    private String English;
    private String refrence;
    private String refrenceLink;

    public AzkarWazaifPojo(String title, String TitleUdru, String arbi, String urdu, String refrence, String refrenceLink, String title1, String title2, String title3, String title4, String title5, String title6, String title7, String title8) {
        Title = title;
        this.TitleUdru = TitleUdru;
        Arbi = arbi;
        Urdu = urdu;

        this.refrence = refrence;
        this.refrenceLink = refrenceLink;
        this.title1 = title1;
        this.title2 = title2;
        this.title3 = title3;
        this.title4 = title4;
        this.title5 = title5;
        this.title6 = title6;
        this.title7 = title7;
        this.title8 = title8;
        this.title9 = title9;


    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getTitle4() {
        return title4;
    }

    public void setTitle4(String title4) {
        this.title4 = title4;
    }

    public String getTitle5() {
        return title5;
    }

    public void setTitle5(String title5) {
        this.title5 = title5;
    }

    public String getTitle6() {
        return title6;
    }

    public void setTitle6(String title6) {
        this.title6 = title6;
    }

    public String getTitle7() {
        return title7;
    }

    public void setTitle7(String title7) {
        this.title7 = title7;
    }

    public String getTitle8() {
        return title8;
    }

    public void setTitle8(String title8) {
        this.title8 = title8;
    }

    public String getTitle9() {
        return title9;
    }

    public void setTitle9(String title9) {
        this.title9 = title9;
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

    public String getUrdu() {
        return Urdu;
    }

    public void setUrdu(String urdu) {
        Urdu = urdu;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getRefrence() {
        return refrence;
    }

    public void setRefrence(String refrence) {
        this.refrence = refrence;
    }

    public String getRefrenceLink() {
        return refrenceLink;
    }

    public void setRefrenceLink(String refrenceLink) {
        this.refrenceLink = refrenceLink;
    }
}
