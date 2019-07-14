
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListingSearchPaginator {

    @SerializedName("nextPage")
    @Expose
    private String nextPage;
    @SerializedName("pageSize")
    @Expose
    private Integer pageSize;
    @SerializedName("pageCount")
    @Expose
    private Integer pageCount;
    @SerializedName("page")
    @Expose
    private Integer page;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("refinements")
    @Expose
    private List<ListingSearchRefinement> refinements = null;
    @SerializedName("entries")
    @Expose
    private List<ListingSearchHit> entries = null;

    public String getNextPage() {
        return nextPage;
    }

    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<ListingSearchRefinement> getRefinements() {
        return refinements;
    }

    public void setRefinements(List<ListingSearchRefinement> refinements) {
        this.refinements = refinements;
    }

    public List<ListingSearchHit> getEntries() {
        return entries;
    }

    public void setEntries(List<ListingSearchHit> entries) {
        this.entries = entries;
    }

}
