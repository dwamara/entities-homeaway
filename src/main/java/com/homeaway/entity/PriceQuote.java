
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PriceQuote {

    @SerializedName("amount") @Expose private Double amount;
    @SerializedName("averageNightly") @Expose private Double averageNightly;
    @SerializedName("currencyUnits") @Expose private String currencyUnits;
    @SerializedName("rent") @Expose private Double rent;

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAverageNightly() {
        return averageNightly;
    }
    public void setAverageNightly(Double averageNightly) {
        this.averageNightly = averageNightly;
    }

    public String getCurrencyUnits() {
        return currencyUnits;
    }
    public void setCurrencyUnits(String currencyUnits) {
        this.currencyUnits = currencyUnits;
    }

    public Double getRent() {
        return rent;
    }
    public void setRent(Double rent) {
        this.rent = rent;
    }
}
