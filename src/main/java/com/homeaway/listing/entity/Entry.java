
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entry {

    @SerializedName("arrivalDate") @Expose private String arrivalDate;
    @SerializedName("reviewerName") @Expose private String reviewerName;
    @SerializedName("body") @Expose private String body;
    @SerializedName("headline") @Expose private String headline;
    @SerializedName("helpfulCount") @Expose private Integer helpfulCount;
    @SerializedName("unhelpfulCount") @Expose private Integer unhelpfulCount;
    @SerializedName("reviewLocale") @Expose private String reviewLocale;

    public String getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getReviewerName() {
        return reviewerName;
    }
    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Integer getHelpfulCount() {
        return helpfulCount;
    }
    public void setHelpfulCount(Integer helpfulCount) {
        this.helpfulCount = helpfulCount;
    }

    public Integer getUnhelpfulCount() {
        return unhelpfulCount;
    }
    public void setUnhelpfulCount(Integer unhelpfulCount) {
        this.unhelpfulCount = unhelpfulCount;
    }

    public String getReviewLocale() {
        return reviewLocale;
    }
    public void setReviewLocale(String reviewLocale) {
        this.reviewLocale = reviewLocale;
    }
}
