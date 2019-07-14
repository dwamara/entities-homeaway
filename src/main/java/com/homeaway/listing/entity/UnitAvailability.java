
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnitAvailability {
    @SerializedName("availabilityDefault") @Expose private String availabilityDefault;
    @SerializedName("changeOverDefault") @Expose private String changeOverDefault;
    @SerializedName("dateRange") @Expose private DateRange dateRange;
    @SerializedName("maxStayDefault") @Expose private Integer maxStayDefault;
    @SerializedName("minPriorNotifyDefault") @Expose private Integer minPriorNotifyDefault;
    @SerializedName("minStayDefault") @Expose private Integer minStayDefault;
    @SerializedName("stayIncrementDefault") @Expose private String stayIncrementDefault;
    @SerializedName("unitAvailabilityConfiguration") @Expose private UnitAvailabilityConfiguration unitAvailabilityConfiguration;

    public String getAvailabilityDefault() {
        return availabilityDefault;
    }
    public void setAvailabilityDefault(String availabilityDefault) {
        this.availabilityDefault = availabilityDefault;
    }

    public String getChangeOverDefault() {
        return changeOverDefault;
    }
    public void setChangeOverDefault(String changeOverDefault) {
        this.changeOverDefault = changeOverDefault;
    }

    public DateRange getDateRange() {
        return dateRange;
    }
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public Integer getMaxStayDefault() {
        return maxStayDefault;
    }
    public void setMaxStayDefault(Integer maxStayDefault) {
        this.maxStayDefault = maxStayDefault;
    }

    public Integer getMinPriorNotifyDefault() {
        return minPriorNotifyDefault;
    }
    public void setMinPriorNotifyDefault(Integer minPriorNotifyDefault) {
        this.minPriorNotifyDefault = minPriorNotifyDefault;
    }

    public Integer getMinStayDefault() {
        return minStayDefault;
    }
    public void setMinStayDefault(Integer minStayDefault) {
        this.minStayDefault = minStayDefault;
    }

    public String getStayIncrementDefault() {
        return stayIncrementDefault;
    }
    public void setStayIncrementDefault(String stayIncrementDefault) {
        this.stayIncrementDefault = stayIncrementDefault;
    }

    public UnitAvailabilityConfiguration getUnitAvailabilityConfiguration() {
        return unitAvailabilityConfiguration;
    }
    public void setUnitAvailabilityConfiguration(UnitAvailabilityConfiguration unitAvailabilityConfiguration) {
        this.unitAvailabilityConfiguration = unitAvailabilityConfiguration;
    }
}
