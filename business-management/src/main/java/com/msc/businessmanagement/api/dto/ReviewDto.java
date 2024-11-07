package com.msc.businessmanagement.api.dto;

import java.time.OffsetDateTime;

public class ReviewDto {


    private Long id;
    private Long businessId;
    private Long customerId;
    private int rating;
    private String comment;
    private OffsetDateTime reviewDate;
    private boolean isVisible;
    private int version;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;

    public ReviewDto(Long id, Long businessId, Long customerId, int rating, String comment, OffsetDateTime reviewDate, boolean isVisible, int version, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.businessId = businessId;
        this.customerId = customerId;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
        this.isVisible = isVisible;
        this.version = version;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public OffsetDateTime getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(OffsetDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }


}
