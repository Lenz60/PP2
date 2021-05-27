package com.example.pesanpalgading20.Minuman;

public class EsOri {
    private String mMinumanName;
    private int mMinumanHarga;
    private int mImageResourceId;

    public EsOri(String vName, int vHarga, int imageResourceId){
        mMinumanName = vName;
        mMinumanHarga = vHarga;
        mImageResourceId = imageResourceId;
    }

    public String getmMinumanName() {
        return mMinumanName;
    }

    public int getmMinumanHarga() {
        return mMinumanHarga;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}

