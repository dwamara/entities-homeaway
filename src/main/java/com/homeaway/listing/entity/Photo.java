
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo {

    @SerializedName("caption") @Expose private String caption;
    @SerializedName("small") @Expose private Small small;
    @SerializedName("medium") @Expose private Medium medium;
    @SerializedName("large") @Expose private Large large;
    @SerializedName("originalDimension") @Expose private OriginalDimension originalDimension;

    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public Small getSmall() {
        return small;
    }
    public void setSmall(Small small) {
        this.small = small;
    }

    public Medium getMedium() {
        return medium;
    }
    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public Large getLarge() {
        return large;
    }
    public void setLarge(Large large) {
        this.large = large;
    }

    public OriginalDimension getOriginalDimension() {
        return originalDimension;
    }
    public void setOriginalDimension(OriginalDimension originalDimension) {
        this.originalDimension = originalDimension;
    }

}
