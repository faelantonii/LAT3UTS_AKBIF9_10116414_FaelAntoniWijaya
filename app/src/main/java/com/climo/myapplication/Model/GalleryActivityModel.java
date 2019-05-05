package com.climo.myapplication.Model;

public class GalleryActivityModel {

    private String Title;

    private int photo;

    public GalleryActivityModel() {
    }

    public GalleryActivityModel(String title, int photo) {

        this.Title = title;
        this.photo = photo;
    }


    public String getTitle() {
        return Title;
    }



    public int getPhoto() {
        return photo;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}

