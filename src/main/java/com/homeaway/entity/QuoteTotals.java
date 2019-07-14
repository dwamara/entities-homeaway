
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuoteTotals {

    @SerializedName("total")
    @Expose
    private Total total;
    @SerializedName("subtotal")
    @Expose
    private Subtotal subtotal;
    @SerializedName("ownerAmount")
    @Expose
    private Object ownerAmount;
    @SerializedName("totalTax")
    @Expose
    private TotalTax totalTax;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public Subtotal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Subtotal subtotal) {
        this.subtotal = subtotal;
    }

    public Object getOwnerAmount() {
        return ownerAmount;
    }

    public void setOwnerAmount(Object ownerAmount) {
        this.ownerAmount = ownerAmount;
    }

    public TotalTax getTotalTax() {
        return totalTax;
    }

    public void setTotalTax(TotalTax totalTax) {
        this.totalTax = totalTax;
    }

}
