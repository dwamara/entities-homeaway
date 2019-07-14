
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UnitContent {
    @SerializedName("area") @Expose private Double area;
    @SerializedName("areaUnit") @Expose private String areaUnit;
    @SerializedName("bathrooms") @Expose private List<Bathroom> bathrooms = null;
    @SerializedName("bedrooms") @Expose private List<Bedroom> bedrooms = null;
    @SerializedName("maxSleep") @Expose private Integer maxSleep;
    @SerializedName("maxSleepInBeds") @Expose private Integer maxSleepInBeds;
    @SerializedName("numberOfBathrooms") @Expose private Integer numberOfBathrooms;
    @SerializedName("numberOfBedrooms") @Expose private Integer numberOfBedrooms;
    @SerializedName("propertyType") @Expose private String propertyType;
    @SerializedName("features") @Expose private List<Feature> features = null;

    public Double getArea() {
        return area;
    }
    public void setArea(Double area) {
        this.area = area;
    }

    public String getAreaUnit() {
        return areaUnit;
    }
    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    public List<Bathroom> getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(List<Bathroom> bathrooms) {
        this.bathrooms = bathrooms;
    }

    public List<Bedroom> getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(List<Bedroom> bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getMaxSleep() {
        return maxSleep;
    }
    public void setMaxSleep(Integer maxSleep) {
        this.maxSleep = maxSleep;
    }

    public Integer getMaxSleepInBeds() {
        return maxSleepInBeds;
    }
    public void setMaxSleepInBeds(Integer maxSleepInBeds) {
        this.maxSleepInBeds = maxSleepInBeds;
    }

    public Integer getNumberOfBathrooms() {
        return numberOfBathrooms;
    }
    public void setNumberOfBathrooms(Integer numberOfBathrooms) {
        this.numberOfBathrooms = numberOfBathrooms;
    }

    public Integer getNumberOfBedrooms() {
        return numberOfBedrooms;
    }
    public void setNumberOfBedrooms(Integer numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getPropertyType() {
        return propertyType;
    }
    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
