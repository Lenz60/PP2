package com.example.pesanpalgading20.Jajanan;

public class Jajanan {
    private String mJajananName;
    private int mJajananHarga;
    private int mImageResourceId;

    public Jajanan(String vName, int vHarga, int imageResourceId){
        mJajananName = vName;
        mJajananHarga = vHarga;
        mImageResourceId = imageResourceId;
    }

    public String getmJajananName() {
        return mJajananName;
    }

    public int getmJajananHarga() {
        return mJajananHarga;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
