package com.msc.businessmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Entity
@Table(name = "pricing")
public class Pricing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "service_name", length = 100, nullable = false)
    private String serviceName;
    @Column(name = "service_duration_minutes", nullable = false)
    private int serviceDurationMinutes;
    @Column(name = "service_price", nullable = false)
    private BigDecimal servicePrice;
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    @Column(name = "currency", length = 3, nullable = false)
    private String currency = "TRY";
    @Column(name = "is_active", nullable = false)
    private boolean isActive = true;
    @Version
    @Column(name = "version", nullable = false)
    private int version;
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
    @ManyToOne
    @JoinColumn(name = "business_id", nullable = false)
    @JsonIgnore
    private Business business;

    public Pricing(Long id, String serviceName, int serviceDurationMinutes,
                   BigDecimal servicePrice, String description, String currency,
                   boolean isActive, int version, OffsetDateTime createdAt,
                   OffsetDateTime updatedAt, Business business) {
        this.id = id;
        this.serviceName = serviceName;
        this.serviceDurationMinutes = serviceDurationMinutes;
        this.servicePrice = servicePrice;
        this.description = description;
        this.currency = currency;
        this.isActive = isActive;
        this.version = version;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.business = business;
    }

    public Pricing() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pricing pricing = (Pricing) o;
        return id.equals(pricing.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    public Business getbusiness() {
        return business;
    }

    public void setbusiness(Business business) {
        this.business = business;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(BigDecimal servicePrice) {
        this.servicePrice = servicePrice;
    }

    public int getServiceDurationMinutes() {
        return serviceDurationMinutes;
    }

    public void setServiceDurationMinutes(int serviceDurationMinutes) {
        this.serviceDurationMinutes = serviceDurationMinutes;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
