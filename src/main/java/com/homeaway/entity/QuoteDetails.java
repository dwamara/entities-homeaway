
package com.homeaway.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuoteDetails {

    @SerializedName("listingId")
    @Expose
    private String listingId;
    @SerializedName("unitId")
    @Expose
    private String unitId;
    @SerializedName("bookingUrl")
    @Expose
    private String bookingUrl;
    @SerializedName("checkinDate")
    @Expose
    private String checkinDate;
    @SerializedName("checkoutDate")
    @Expose
    private String checkoutDate;
    @SerializedName("currencyCode")
    @Expose
    private String currencyCode;
    @SerializedName("occupancy")
    @Expose
    private Occupancy occupancy;
    @SerializedName("quoteTotals")
    @Expose
    private QuoteTotals quoteTotals;
    @SerializedName("fees")
    @Expose
    private List<Fee> fees = null;
    @SerializedName("payments")
    @Expose
    private List<Payment> payments = null;

    public String getListingId() {
        return listingId;
    }

    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getBookingUrl() {
        return bookingUrl;
    }

    public void setBookingUrl(String bookingUrl) {
        this.bookingUrl = bookingUrl;
    }

    public String getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(String checkinDate) {
        this.checkinDate = checkinDate;
    }

    public String getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(String checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Occupancy getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public QuoteTotals getQuoteTotals() {
        return quoteTotals;
    }

    public void setQuoteTotals(QuoteTotals quoteTotals) {
        this.quoteTotals = quoteTotals;
    }

    public List<Fee> getFees() {
        return fees;
    }

    public void setFees(List<Fee> fees) {
        this.fees = fees;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

}
