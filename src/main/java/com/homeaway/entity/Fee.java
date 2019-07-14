
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fee {

    @SerializedName("feeType")
    @Expose
    private String feeType;
    @SerializedName("amount")
    @Expose
    private Amount amount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("taxes")
    @Expose
    private Object taxes;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getTaxes() {
        return taxes;
    }

    public void setTaxes(Object taxes) {
        this.taxes = taxes;
    }

}
