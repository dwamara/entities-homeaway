
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Weekly {

    @SerializedName("currency") @Expose private String currency;
    @SerializedName("amount") @Expose private Double amount;

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
