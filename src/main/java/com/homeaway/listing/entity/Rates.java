
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Rates {

    @SerializedName("weekly") @Expose private Weekly weekly;

    public Weekly getWeekly() {
        return weekly;
    }
    public void setWeekly(Weekly weekly) {
        this.weekly = weekly;
    }

}
