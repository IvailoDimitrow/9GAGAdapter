package com.example.acer.a9gagadapter;

import android.widget.TextView;

/**
 * Created by Acer on 22.7.2016 г..
 */
public class Data {
    int image;
    String text;
    public Data(int image,String text) {
        this.image = image;
        this.text = text;
    }
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

