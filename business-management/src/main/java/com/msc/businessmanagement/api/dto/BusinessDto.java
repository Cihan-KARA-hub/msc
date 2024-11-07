package com.msc.businessmanagement.api.dto;


import com.msc.businessmanagement.model.enums.ClosedDay;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class BusinessDto {

    private Long id;

    @NotEmpty
    @Size(min = 1, max = 100)
    private String name;

    @NotEmpty
    private String address;

    @NotEmpty
    private String latitude;
    @NotEmpty
    private String longitude;
    @NotEmpty
    private String workHours;
    @Enumerated(EnumType.STRING)
    private ClosedDay closed;
    @NotEmpty
    @Size(max = 15)
    private String phoneNumber;
    private byte[] businessPicture;
    private byte[] video;
    private long ownerId;  // Assuming you want to keep track of the owner id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(@NotEmpty String longitude) {
        this.longitude = longitude;
    }

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }

    public ClosedDay getClosed() {
        return closed;
    }

    public void setClosed(ClosedDay closed) {
        this.closed = closed;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public byte[] getBusinessPicture() {
        return businessPicture;
    }

    public void setBusinessPicture(byte[] businessPicture) {
        this.businessPicture = businessPicture;
    }

    public byte[] getVideo() {
        return video;
    }

    public void setVideo(byte[] video) {
        this.video = video;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }
}
