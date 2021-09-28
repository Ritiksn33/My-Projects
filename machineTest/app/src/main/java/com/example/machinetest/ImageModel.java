package com.example.machinetest;

public class ImageModel {
    // string image_name for storing image_name
    // and imgid for storing image id.
    private String image_name;
    private int imgid;

    public ImageModel(String image_name, int imgid) {
        this.image_name = image_name;
        this.imgid = imgid;
    }

    public String getimage_name() {
        return image_name;
    }

    public void setimage_name(String image_name) {
        this.image_name = image_name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
}

