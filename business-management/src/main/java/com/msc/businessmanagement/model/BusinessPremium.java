package com.msc.businessmanagement.model;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Entity
@Table(name = "business_premium")
public class BusinessPremium {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;  // Premium üyelik ID'si
    @Column(name = "business_id", nullable = false)
    private Long businessId;  // Premium olan salonun ID'si
    @Column(name = "premium_type", nullable = false)
    private String premiumType;  // Premium üyelik tipi
    @Column(name = "start_date", nullable = false)
    private OffsetDateTime startDate;  // Premium üyelik başlangıç tarihi
    @Column(name = "end_date", nullable = false)
    private OffsetDateTime endDate;  // Premium üyelik bitiş tarihi
    @Column(name = "price", nullable = false)
    private BigDecimal price;  // Premium üyelik ücreti
    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;  // Üyelik aktif mi?
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private OffsetDateTime createdAt;  // Kayıt oluşturulma zamanı
    @UpdateTimestamp
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;  // Güncelleme zamanı
    @Column(name = "version", nullable = false)
    private int version;  // Optimistic locking için

    public BusinessPremium(Long id, Long businessId, String premiumType, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal price, boolean isActive, OffsetDateTime createdAt, OffsetDateTime updatedAt, int version) {
        this.id = id;
        this.businessId = businessId;
        this.premiumType = premiumType;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.version = version;
    }

    public BusinessPremium() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getbusinessId() {
        return businessId;
    }

    public void setbusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public String getPremiumType() {
        return premiumType;
    }

    public void setPremiumType(String premiumType) {
        this.premiumType = premiumType;
    }

    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
