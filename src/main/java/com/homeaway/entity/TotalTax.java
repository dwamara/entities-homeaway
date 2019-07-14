
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TotalTax {

    @SerializedName("taxAmount")
    @Expose
    private TaxAmount taxAmount;

    public TaxAmount getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(TaxAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

}
