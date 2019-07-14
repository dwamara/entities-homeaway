
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListingSearchHit {

    @SerializedName("listingId") @Expose private String listingId;
    @SerializedName("headline") @Expose private String headline;
    @SerializedName("description") @Expose private String description;
    @SerializedName("accommodations") @Expose private String accommodations;
    @SerializedName("minStayRange") @Expose private MinStayRange minStayRange;
    @SerializedName("thumbnail") @Expose private Thumbnail thumbnail;
    @SerializedName("priceQuote") @Expose private PriceQuote priceQuote;
    @SerializedName("priceRanges") @Expose private List<PriceRange> priceRanges = null;
    @SerializedName("location") @Expose private Location location;
    @SerializedName("regionPath") @Expose private String regionPath;
    @SerializedName("reviewCount") @Expose private Integer reviewCount;
    @SerializedName("reviewAverage") @Expose private Double reviewAverage;
    @SerializedName("bookWithConfidence") @Expose private Boolean bookWithConfidence;
    @SerializedName("detailsUrl") @Expose private String detailsUrl;
    @SerializedName("bathrooms") @Expose private Integer bathrooms;
    @SerializedName("bedrooms") @Expose private Integer bedrooms;
    @SerializedName("listingUrl") @Expose private String listingUrl;

    public String getListingId() {
        return listingId;
    }
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getHeadline() {
        return headline;
    }
    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getAccommodations() {
        return accommodations;
    }
    public void setAccommodations(String accommodations) {
        this.accommodations = accommodations;
    }

    public MinStayRange getMinStayRange() {
        return minStayRange;
    }
    public void setMinStayRange(MinStayRange minStayRange) {
        this.minStayRange = minStayRange;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public PriceQuote getPriceQuote() {
        return priceQuote;
    }
    public void setPriceQuote(PriceQuote priceQuote) {
        this.priceQuote = priceQuote;
    }

    public List<PriceRange> getPriceRanges() {
        return priceRanges;
    }
    public void setPriceRanges(List<PriceRange> priceRanges) {
        this.priceRanges = priceRanges;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public String getRegionPath() {
        return regionPath;
    }
    public void setRegionPath(String regionPath) {
        this.regionPath = regionPath;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }
    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Double getReviewAverage() {
        return reviewAverage;
    }
    public void setReviewAverage(Double reviewAverage) {
        this.reviewAverage = reviewAverage;
    }

    public Boolean getBookWithConfidence() {
        return bookWithConfidence;
    }
    public void setBookWithConfidence(Boolean bookWithConfidence) {
        this.bookWithConfidence = bookWithConfidence;
    }

    public String getDetailsUrl() {
        return detailsUrl;
    }
    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public Integer getBathrooms() {
        return bathrooms;
    }
    public void setBathrooms(Integer bathrooms) {
        this.bathrooms = bathrooms;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }
    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getListingUrl() {
        return listingUrl;
    }
    public void setListingUrl(String listingUrl) {
        this.listingUrl = listingUrl;
    }
}
