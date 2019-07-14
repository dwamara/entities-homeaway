
package com.homeaway.listing.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Unit {
    @SerializedName("unitNumber") @Expose private Integer unitNumber;
    @SerializedName("unitContent") @Expose private UnitContent unitContent;
    @SerializedName("reviewSummary") @Expose private ReviewSummary reviewSummary;
    @SerializedName("unitReviewContent") @Expose private UnitReviewContent unitReviewContent;
    @SerializedName("ratePeriods") @Expose private List<RatePeriod> ratePeriods = null;
    @SerializedName("unitAvailability") @Expose private UnitAvailability unitAvailability;

    public Integer getUnitNumber() {
        return unitNumber;
    }
    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public UnitContent getUnitContent() {
        return unitContent;
    }
    public void setUnitContent(UnitContent unitContent) {
        this.unitContent = unitContent;
    }

    public ReviewSummary getReviewSummary() {
        return reviewSummary;
    }
    public void setReviewSummary(ReviewSummary reviewSummary) {
        this.reviewSummary = reviewSummary;
    }

    public UnitReviewContent getUnitReviewContent() {
        return unitReviewContent;
    }
    public void setUnitReviewContent(UnitReviewContent unitReviewContent) {
        this.unitReviewContent = unitReviewContent;
    }

    public List<RatePeriod> getRatePeriods() {
        return ratePeriods;
    }
    public void setRatePeriods(List<RatePeriod> ratePeriods) {
        this.ratePeriods = ratePeriods;
    }

    public UnitAvailability getUnitAvailability() {
        return unitAvailability;
    }
    public void setUnitAvailability(UnitAvailability unitAvailability) {
        this.unitAvailability = unitAvailability;
    }
}
