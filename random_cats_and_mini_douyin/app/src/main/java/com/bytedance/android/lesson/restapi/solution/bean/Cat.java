package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    //{"breeds":[],"id":"-m4L8Nezx","url":"https://cdn2.thecatapi.com/images/-m4L8Nezx.jpg","width":750,"height":1334}

    @SerializedName("id") private String id;
    @SerializedName("url") private String url;
    @SerializedName("width") private int width;
    @SerializedName("height") private int height;

    public String getId(){
        return id;
    }
    public String getUrl(){
        return url;
    }
    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
