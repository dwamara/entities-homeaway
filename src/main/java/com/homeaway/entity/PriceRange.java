
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceRange {

    @SerializedName("currencyUnits") @Expose private String currencyUnits;
    @SerializedName("from") @Expose private Double from;
    @SerializedName("periodType") @Expose private String periodType;
    @SerializedName("to") @Expose private Double to;

    public String getCurrencyUnits() {
        return currencyUnits;
    }
    public void setCurrencyUnits(String currencyUnits) {
        this.currencyUnits = currencyUnits;
    }

    public Double getFrom() {
        return from;
    }
    public void setFrom(Double from) {
        this.from = from;
    }

    public String getPeriodType() {
        return periodType;
    }
    public void setPeriodType(String periodType) {
        this.periodType = periodType;
    }

    public Double getTo() {
        return to;
    }
    public void setTo(Double to) {
        this.to = to;
    }
}
