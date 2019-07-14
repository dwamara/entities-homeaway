
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReviewSummary {
    @SerializedName("reviewCount") @Expose private Integer reviewCount;
    @SerializedName("averageRating") @Expose private Double averageRating;
    @SerializedName("oneStarReviewCount") @Expose private Integer oneStarReviewCount;
    @SerializedName("twoStarReviewCount") @Expose private Integer twoStarReviewCount;
    @SerializedName("threeStarReviewCount") @Expose private Integer threeStarReviewCount;
    @SerializedName("fourStarReviewCount") @Expose private Integer fourStarReviewCount;
    @SerializedName("fiveStarReviewCount") @Expose private Integer fiveStarReviewCount;
    @SerializedName("guestbookReviewCount") @Expose private Integer guestbookReviewCount;

    public Integer getReviewCount() {
        return reviewCount;
    }
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Double getAverageRating() {
        return averageRating;
    }
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    public Integer getOneStarReviewCount() {
        return oneStarReviewCount;
    }
    public void setOneStarReviewCount(Integer oneStarReviewCount) {
        this.oneStarReviewCount = oneStarReviewCount;
    }

    public Integer getTwoStarReviewCount() {
        return twoStarReviewCount;
    }
    public void setTwoStarReviewCount(Integer twoStarReviewCount) {
        this.twoStarReviewCount = twoStarReviewCount;
    }

    public Integer getThreeStarReviewCount() {
        return threeStarReviewCount;
    }
    public void setThreeStarReviewCount(Integer threeStarReviewCount) {
        this.threeStarReviewCount = threeStarReviewCount;
    }

    public Integer getFourStarReviewCount() {
        return fourStarReviewCount;
    }
    public void setFourStarReviewCount(Integer fourStarReviewCount) {
        this.fourStarReviewCount = fourStarReviewCount;
    }

    public Integer getFiveStarReviewCount() {
        return fiveStarReviewCount;
    }
    public void setFiveStarReviewCount(Integer fiveStarReviewCount) {
        this.fiveStarReviewCount = fiveStarReviewCount;
    }

    public Integer getGuestbookReviewCount() {
        return guestbookReviewCount;
    }
    public void setGuestbookReviewCount(Integer guestbookReviewCount) {
        this.guestbookReviewCount = guestbookReviewCount;
    }
}
