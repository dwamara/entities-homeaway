
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dimension {

    @SerializedName("height") @Expose private Integer height;
    @SerializedName("width") @Expose private Integer width;

    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }

}
