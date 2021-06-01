package com.example.pesanpalgading20.Getter.Makanan;

public class BaksoBakar {
    private String mMakananName;
    private int mMakananHarga;
    private int mImageResourceId;

    public BaksoBakar(String vName, int vHarga, int imageResourceId){
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
