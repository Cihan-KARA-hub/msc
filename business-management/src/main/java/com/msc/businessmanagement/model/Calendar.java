package com.msc.businessmanagement.model;


import com.msc.businessmanagement.model.enums.CalendarStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "calendar")
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;  // Takvim ID'si

    @Column(name = "business_id", nullable = false)
    private Long businessId;  // Takvim hangi salona ait

    @Column(name = "employee_id", nullable = true)
    private Long employeeId;  // Çalışan kimliği (opsiyonel)

    @Column(name = "date", nullable = false)
    private OffsetDateTime date;  // Takvim günü

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private CalendarStatus status;  // Durum bilgisi

    @Column(name = "start_time", nullable = false)
    private OffsetDateTime startTime;  // Periyot başlangıç saati

    @Column(name = "end_time", nullable = false)
    private OffsetDateTime endTime;  // Periyot bitiş saati

    @Column(name = "available", nullable = false)
    private boolean available = true;  // Periyot uygun mu?

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private OffsetDateTime createdAt;  // Kayıt oluşturulma zamanı

    @UpdateTimestamp
    @Column(name = "updated_at")
    private OffsetDateTime updatedAt;  // Güncelleme zamanı

    public Calendar(Long id, Long businessId, Long employeeId,
                    OffsetDateTime date, CalendarStatus status, OffsetDateTime startTime,
                    OffsetDateTime endTime, boolean available, OffsetDateTime createdAt,
                    OffsetDateTime updatedAt) {
        this.id = id;
        this.businessId = businessId;
        this.employeeId = employeeId;
        this.date = date;
        this.status = status;
        this.startTime = startTime;
        this.endTime = endTime;
        this.available = available;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Calendar() {
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public CalendarStatus getStatus() {
        return status;
    }

    public void setStatus(CalendarStatus status) {
        this.status = status;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Long businessId) {
        this.businessId = businessId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}