
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnitAvailabilityConfiguration {

    @SerializedName("availability") @Expose private String availability;
    @SerializedName("availableUnitCount") @Expose private Object availableUnitCount;
    @SerializedName("changeOver") @Expose private String changeOver;
    @SerializedName("maxStay") @Expose private String maxStay;
    @SerializedName("minPriorNotify") @Expose private String minPriorNotify;
    @SerializedName("minStay") @Expose private String minStay;
    @SerializedName("stayIncrement") @Expose private String stayIncrement;

    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Object getAvailableUnitCount() {
        return availableUnitCount;
    }
    public void setAvailableUnitCount(Object availableUnitCount) {
        this.availableUnitCount = availableUnitCount;
    }

    public String getChangeOver() {
        return changeOver;
    }
    public void setChangeOver(String changeOver) {
        this.changeOver = changeOver;
    }

    public String getMaxStay() {
        return maxStay;
    }
    public void setMaxStay(String maxStay) {
        this.maxStay = maxStay;
    }

    public String getMinPriorNotify() {
        return minPriorNotify;
    }
    public void setMinPriorNotify(String minPriorNotify) {
        this.minPriorNotify = minPriorNotify;
    }

    public String getMinStay() {
        return minStay;
    }
    public void setMinStay(String minStay) {
        this.minStay = minStay;
    }

    public String getStayIncrement() {
        return stayIncrement;
    }
    public void setStayIncrement(String stayIncrement) {
        this.stayIncrement = stayIncrement;
    }
}
