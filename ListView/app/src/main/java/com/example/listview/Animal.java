package com.example.listview;

public class Animal {
    private  String aName;
    private  String aSpeak;
    private int aIcon;
    public Animal(){
    }
    public Animal (String aName,String aSpeak,int aIcon){
        this.aName=aName;
        this.aSpeak=aSpeak;
        this.aIcon=aIcon;
    }
    public String getaName(){
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }
    public String getaSpeak(){
        return aSpeak;
    }

    public int getaIcon() {
        return aIcon;
    }

    public void setaSpeak(String aSpeak) {
        this.aSpeak = aSpeak;
    }

    public void setaIcon(int aIcon) {
        this.aIcon = aIcon;
    }
}
