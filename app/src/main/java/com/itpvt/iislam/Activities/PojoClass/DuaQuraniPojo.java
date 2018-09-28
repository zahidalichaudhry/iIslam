package com.itpvt.iislam.Activities.PojoClass;

public class DuaQuraniPojo
{
    private String Arbi;
    private String Urdu;
    private String English;

    public DuaQuraniPojo(String arbi, String urdu, String english) {
        Arbi = arbi;
        Urdu = urdu;
        English = english;
    }

    public void setArbi(String arbi) {
        Arbi = arbi;
    }

    public void setUrdu(String urdu) {
        Urdu = urdu;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getArbi() {
        return Arbi;
    }

    public String getUrdu() {
        return Urdu;
    }

    public String getEnglish() {
        return English;
    }
}
