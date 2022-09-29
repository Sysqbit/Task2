package com.example.gridlayoutjsongetapi;

public class ExmapleItem {

    private String mName;
    private String mCode;
    private String mPrice;

    public ExmapleItem(String name,String code,String price){
        mName = name;
        mCode = code;
        mPrice =price;

    }

    public String getmName(){
        return mName;
    }

    public String getCode(){
        return mCode;
    }

    public String getmPrice(){
        return mPrice;
    }
}
