
package com.homeaway.listing.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bathroom {
    @SerializedName("amenities") @Expose private List<Amenity> amenities = null;
    @SerializedName("name") @Expose private String name;
    @SerializedName("roomSubType") @Expose private String roomSubType;

    public List<Amenity> getAmenities() {
        return amenities;
    }
    public void setAmenities(List<Amenity> amenities) {
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
