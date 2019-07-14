
package com.homeaway.listing.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Amenity {
    @SerializedName("count") @Expose private Integer count;
    @SerializedName("category") @Expose private String category;
    @SerializedName("description") @Expose private String description;
    @SerializedName("localizedName") @Expose private String localizedName;

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocalizedName() {
        return localizedName;
    }
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }
}
