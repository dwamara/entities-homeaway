
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RatePeriod {

    @SerializedName("dateRange") @Expose private DateRange dateRange;
    @SerializedName("minimumStay") @Expose private Integer minimumStay;
    @SerializedName("rates") @Expose private Rates rates;

    public DateRange getDateRange() {
        return dateRange;
    }
    public void setDateRange(DateRange dateRange) {
        this.dateRange = dateRange;
    }

    public Integer getMinimumStay() {
        return minimumStay;
    }
    public void setMinimumStay(Integer minimumStay) {
        this.minimumStay = minimumStay;
    }

    public Rates getRates() {
        return rates;
    }
    public void setRates(Rates rates) {
        this.rates = rates;
    }

}
