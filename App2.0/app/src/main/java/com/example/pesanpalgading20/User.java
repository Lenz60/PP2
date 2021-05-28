package com.example.pesanpalgading20;

public class User {
    private String Nama,KodeMeja,NoMeja;

    public User(String nama, String kodeMeja, String noMeja) {
        this.Nama = nama;
        this.KodeMeja = kodeMeja;
        this.NoMeja = noMeja;
    }

    public String getNama() {
        return Nama;
    }

    public String getKodeMeja() {
        return KodeMeja;
    }

    public String getNoMeja() {
        return NoMeja;
    }
}
