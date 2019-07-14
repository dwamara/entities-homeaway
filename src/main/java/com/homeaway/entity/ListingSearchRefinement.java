
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListingSearchRefinement {

    @SerializedName("key") @Expose private String key;
    @SerializedName("fieldName") @Expose private String fieldName;
    @SerializedName("options") @Expose private List<ListingSearchRefinementOption> options = null;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }

    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public List<ListingSearchRefinementOption> getOptions() {
        return options;
    }
    public void setOptions(List<ListingSearchRefinementOption> options) {
        this.options = options;
    }

}
