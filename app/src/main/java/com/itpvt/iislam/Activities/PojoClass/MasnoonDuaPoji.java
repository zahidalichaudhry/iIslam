package com.itpvt.iislam.Activities.PojoClass;

public class MasnoonDuaPoji
{
    private  String Title;
    private String Arbi;
    private String Urdu;
    private String English;
    private String refrence;
    private String refrenceLink;

    public MasnoonDuaPoji(String Title,String arbi, String urdu,String English, String refrence, String refrenceLink)
    {
        this.Title=Title;
        this.Arbi = arbi;
        this.Urdu = urdu;
        this.English=English;
        this.refrence = refrence;
        this.refrenceLink = refrenceLink;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getArbi() {
        return Arbi;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
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
