package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.20 14:18
 */
public class Feed {

    // TODO-C2 (1) Implement your Feed Bean here according to the response json
    @SerializedName("student_id") private String id;
    @SerializedName("user_name") private String name;
    @SerializedName("image_url") private String imageUrl;
    @SerializedName("video_url") private String videoUrl;

    public String getId(){ return id; }
    public String getUserName(){ return name; }
    public String getImageUrl(){ return imageUrl; }
    public String getVideoUrl(){
        return videoUrl;
    }
}
