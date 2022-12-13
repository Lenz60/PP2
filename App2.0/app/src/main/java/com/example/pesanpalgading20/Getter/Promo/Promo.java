package com.example.pesanpalgading20.Getter.Promo;

public class Promo {
    private String mPromoName;
    private int mPromoHarga;
    private int mImageResourceId;

    public Promo(String mPromoName, int mPromoHarga, int mImageResourceId) {
        this.mPromoName = mPromoName;
        this.mPromoHarga = mPromoHarga;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmPromoName() {
        return mPromoName;
    }

    public void setmPromoName(String mPromoName) {
        this.mPromoName = mPromoName;
    }

    public int getmPromoHarga() {
        return mPromoHarga;
    }

    public void setmPromoHarga(int mPromoHarga) {
        this.mPromoHarga = mPromoHarga;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
