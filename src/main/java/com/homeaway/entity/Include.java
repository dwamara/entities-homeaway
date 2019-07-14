
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Include {

    @SerializedName("feeType")
    @Expose
    private String feeType;
    @SerializedName("amount")
    @Expose
    private Amount amount;

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

}
