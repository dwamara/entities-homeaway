
package com.homeaway.listing.entity;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photos {

    @SerializedName("photos") @Expose private List<Photo> photos = null;
    @SerializedName("thumbnails") @Expose private List<Thumbnail> thumbnails = null;

    public List<Photo> getPhotos() {
        return photos;
    }
    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Thumbnail> getThumbnails() {
        return thumbnails;
    }
    public void setThumbnails(List<Thumbnail> thumbnails) {
        this.thumbnails = thumbnails;
    }

}
