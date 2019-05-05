package com.climo.myapplication.Model;

public class DailyActivityModel {
    private String aktifitas;
    private int img;


    public DailyActivityModel(String aktifitas, int img) {
        this.img = img;
        this.aktifitas = aktifitas;



    }

    public DailyActivityModel() {
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getAktifitas() {
        return aktifitas;
    }

    public void setAktifitas(String aktifitas) {
        this.aktifitas = aktifitas;
    }



}
