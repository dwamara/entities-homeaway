
package com.homeaway.listing.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UnitReviewContent {
    @SerializedName("size") @Expose private Integer size;
    @SerializedName("page") @Expose private Integer page;
    @SerializedName("entries") @Expose private List<Entry> entries = null;

    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getPage() {
        return page;
    }
    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Entry> getEntries() {
        return entries;
    }
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }
}
