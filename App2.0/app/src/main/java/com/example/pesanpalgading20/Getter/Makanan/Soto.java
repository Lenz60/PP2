package com.example.pesanpalgading20.Getter.Makanan;

public class Soto {
    private String mMakananName;
    private int mMakananHarga;
    private int mImageResourceId;

    public Soto(String vName, int vHarga, int imageResourceId){
        mMakananName = vName;
        mMakananHarga = vHarga;
        mImageResourceId = imageResourceId;
    }

    public String getmMakananName() {
        return mMakananName;
    }

    public int getmMakananHarga() {
        return mMakananHarga;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
