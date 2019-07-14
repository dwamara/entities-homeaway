
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MinStayRange {

    @SerializedName("minStayHigh")
    @Expose
    private Integer minStayHigh;
    @SerializedName("minStayLow")
    @Expose
    private Integer minStayLow;

    public Integer getMinStayHigh() {
        return minStayHigh;
    }

    public void setMinStayHigh(Integer minStayHigh) {
        this.minStayHigh = minStayHigh;
    }

    public Integer getMinStayLow() {
        return minStayLow;
    }

    public void setMinStayLow(Integer minStayLow) {
        this.minStayLow = minStayLow;
    }

}
