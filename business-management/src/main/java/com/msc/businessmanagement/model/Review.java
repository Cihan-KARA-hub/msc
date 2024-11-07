package com.msc.businessmanagement.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;


@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "business_id", nullable = false)
    private Long businessId;  // Hangi salon değerlendiriliyor
    @Column(name = "customer_id", nullable = false)
    private Long customerId;  // Yorumu yapan kullanıcı
    @Column(name = "rating", nullable = false)
    private int rating;  // Yıldızlama puanı
    @Column(name = "comment")
    private String comment;  // Kullanıcının yorumu
    @CreationTimestamp
    @Column(name = "review_date", nullable = false)
    private OffsetDateTime reviewDate;  // Yorumun yapıldığı tarih
    @Column(name = "is_visible", nullable = false)
    private boolean isVisible = true;  // Yorumun görünür olup olmadığı
    @Column(name = "version", nullable = false)
    private int version;  // Versiyon kontrolü
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

    public Review(Long id, Long businessId, Long customerId, int rating, String comment, OffsetDateTime reviewDate, boolean isVisible, int version, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
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

    public Review() {

    }

    public Long getBusinessId() {
        return businessId;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public OffsetDateTime getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(OffsetDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }


    public void setbusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}