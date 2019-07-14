
package com.homeaway.listing.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bedroom {
    @SerializedName("amenities") @Expose private List<Object> amenities = null;
    @SerializedName("name") @Expose private String name;
    @SerializedName("roomSubType") @Expose private String roomSubType;

    public List<Object> getAmenities() {
        return amenities;
    }
    public void setAmenities(List<Object> amenities) {
        this.amenities = amenities;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRoomSubType() {
        return roomSubType;
    }
    public void setRoomSubType(String roomSubType) {
        this.roomSubType = roomSubType;
    }
}
