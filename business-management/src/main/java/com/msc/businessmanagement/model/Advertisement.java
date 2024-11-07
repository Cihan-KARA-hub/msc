package com.msc.businessmanagement.model;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;


@Entity
@Table(name = "advertisement")
public class Advertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;  // Reklam veren işletme sahibi

    @Column(name = "title", nullable = false)
    private String title;  // Reklam başlığı

    @Column(name = "description")
    private String description;  // Reklam açıklaması

    @Column(name = "start_date", nullable = false)
    private OffsetDateTime startDate;  // Reklamın başlangıç tarihi

    @Column(name = "end_date", nullable = false)
    private OffsetDateTime endDate;  // Reklamın bitiş tarihi

    @Column(name = "price", nullable = false)
    private BigDecimal price;  // Reklam ücreti

    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;  // Reklam aktif mi?

    @Column(name = "version", nullable = false)
    private int version;  // Optimistic locking için

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private OffsetDateTime createdAt;  // Oluşturulma tarihi
    @UpdateTimestamp
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;  // Güncellenme tarihi

    public Advertisement(Long id, Long ownerId, String title, String description, OffsetDateTime startDate, OffsetDateTime endDate, BigDecimal price, boolean isActive, int version, OffsetDateTime createdAt, OffsetDateTime updatedAt) {
        this.id = id;
        this.ownerId = ownerId;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.isActive = isActive;
        this.version = version;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Advertisement() {

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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public OffsetDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(OffsetDateTime endDate) {
        this.endDate = endDate;
    }

    public OffsetDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(OffsetDateTime startDate) {
        this.startDate = startDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
