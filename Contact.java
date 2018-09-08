package com.example.admin.nhap;

/**
 * Created by admin on 9/8/2018.
 */

public class Contact {
    private int color;
    private String ten,sdt;

    public Contact(int color, String ten, String sdt) {
        this.color = color;
        this.ten = ten;
        this.sdt = sdt;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}
