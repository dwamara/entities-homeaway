
package com.homeaway.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {
    @SerializedName("height") @Expose private Integer height;
    @SerializedName("imageSize") @Expose private String imageSize;
    @SerializedName("secureUri") @Expose private String secureUri;
    @SerializedName("uri") @Expose private String uri;
    @SerializedName("width") @Expose private Integer width;

    public Integer getHeight() {
        return height;
    }
    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getImageSize() {
        return imageSize;
    }
    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public String getSecureUri() {
        return secureUri;
    }
    public void setSecureUri(String secureUri) {
        this.secureUri = secureUri;
    }

    public String getUri() {
        return uri;
    }
    public void setUri(String uri) {
        this.uri = uri;
    }

    public Integer getWidth() {
        return width;
    }
    public void setWidth(Integer width) {
        this.width = width;
    }
}
