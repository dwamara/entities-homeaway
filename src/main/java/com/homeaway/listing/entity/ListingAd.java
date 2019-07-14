
package com.homeaway.listing.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListingAd {
    @SerializedName("listingId") @Expose private String listingId;
    @SerializedName("listingUrl") @Expose private String listingUrl;
    @SerializedName("sourceLocale") @Expose private String sourceLocale;
    @SerializedName("sourceLocaleName") @Expose private String sourceLocaleName;
    @SerializedName("adContent") @Expose private AdContent adContent;
    @SerializedName("features") @Expose private List<Feature> features = null;
    @SerializedName("location") @Expose private Location location;
    @SerializedName("sites") @Expose private List<Site> sites = null;
    @SerializedName("photos") @Expose private Photos photos;
    @SerializedName("units") @Expose private List<Unit> units = null;

    public String getListingId() {
        return listingId;
    }
    public void setListingId(String listingId) {
        this.listingId = listingId;
    }

    public String getListingUrl() {
        return listingUrl;
    }
    public void setListingUrl(String listingUrl) {
        this.listingUrl = listingUrl;
    }

    public String getSourceLocale() {
        return sourceLocale;
    }
    public void setSourceLocale(String sourceLocale) {
        this.sourceLocale = sourceLocale;
    }

    public String getSourceLocaleName() {
        return sourceLocaleName;
    }
    public void setSourceLocaleName(String sourceLocaleName) {
        this.sourceLocaleName = sourceLocaleName;
    }

    public AdContent getAdContent() {
        return adContent;
    }
    public void setAdContent(AdContent adContent) {
        this.adContent = adContent;
    }

    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Location getLocation() {
        return location;
    }
    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Site> getSites() {
        return sites;
    }
    public void setSites(List<Site> sites) {
        this.sites = sites;
    }

    public Photos getPhotos() {
        return photos;
    }
    public void setPhotos(Photos photos) {
        this.photos = photos;
    }

    public List<Unit> getUnits() {
        return units;
    }
    public void setUnits(List<Unit> units) {
        this.units = units;
    }

}
