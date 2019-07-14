
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {
    @SerializedName("photo") @Expose private Photo photo;
    @SerializedName("unitNumber") @Expose private Integer unitNumber;

    public Photo getPhoto() {
        return photo;
    }
    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }
    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

}
