package com.msc.businessmanagement.model;

import com.msc.businessmanagement.model.enums.ClosedDay;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "business")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "name", length = 100, nullable = false)
    private String name;
    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "latitude")
    private String latitude;
    @Column(name = "longitude")
    private String longitude;
    @Column(name = "work_hours", nullable = false)
    private String workHours;
    @Enumerated(EnumType.STRING)
    @Column(name = "closed", length = 50)
    private ClosedDay closed;
    @Column(name = "phone_number", length = 15)
    private String phoneNumber;
    @Column(name = "salon_picture")
    private byte[] businessPicture;
    @Column(name = "video")
    private byte[] video;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "owner_id", nullable = false, foreignKey = @ForeignKey(name = "fk_owner"))
    private Owner owner;
    @Version
    @Column(name = "version", nullable = false)
    private int version;
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;
    public Business(Long id, String name, String address, String latitude,
                    String longitude, String workHours, ClosedDay closed,
                    String phoneNumber, byte[] businessPicture, byte[] video,
                    Owner owner, int version, OffsetDateTime createdAt,
                    OffsetDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.workHours = workHours;
        this.closed = closed;
        this.phoneNumber = phoneNumber;
        this.businessPicture = businessPicture;
        this.video = video;
        this.owner = owner;
        this.version = version;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public Business() {

    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Business business = (Business) o;
        return id.equals(business.id) && owner.equals(business.owner);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + owner.hashCode();
        return result;
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

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }

    public byte[] getBusinessPicture() {
        return businessPicture;
    }

    public void setBusinessPicture(byte[] businessPicture) {
        this.businessPicture = businessPicture;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ClosedDay getClosed() {
        return closed;
    }

    public void setClosed(ClosedDay closed) {
        this.closed = closed;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}