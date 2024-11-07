package com.msc.businessmanagement.model;

import com.msc.businessmanagement.model.enums.PremiumType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name = "owner", uniqueConstraints = {
        @UniqueConstraint(columnNames = "email"),
        @UniqueConstraint(columnNames = "master_certificate_no"),
        @UniqueConstraint(columnNames = "tc_no"),
        @UniqueConstraint(columnNames = "tax_certificate_no")
})
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;
    @Column(name = "phone_number", length = 15)
    private String phoneNumber;
    @Column(name = "master_certificate_no", length = 100, nullable = false, unique = true)
    private String masterCertificateNo;
    @Column(name = "tc_no", length = 11, nullable = false, unique = true)
    private String tcNo;
    @Column(name = "tax_certificate_no", length = 100, nullable = false, unique = true)
    private String taxCertificateNo;
    @Column(name = "premium_type", length = 10)
    private PremiumType premiumType;
    @Column(name = "profile_picture", columnDefinition = "BYTEA", nullable = true)
    private byte[] profilePicture;
    @Version
    @Column(name = "version", nullable = false)
    private int version = 0;
    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;
    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private OffsetDateTime updatedAt;

    public Owner() {

    }

    public Owner(Long id, String firstName, String lastName, String email, String phoneNumber, String masterCertificateNo, String tcNo, String taxCertificateNo, PremiumType premiumType, byte[] profilePicture, int version) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.masterCertificateNo = masterCertificateNo;
        this.tcNo = tcNo;
        this.taxCertificateNo = taxCertificateNo;
        this.premiumType = premiumType;
        this.profilePicture = profilePicture;
        this.version = 0;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMasterCertificateNo() {
        return masterCertificateNo;
    }

    public void setMasterCertificateNo(String masterCertificateNo) {
        this.masterCertificateNo = masterCertificateNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTaxCertificateNo() {
        return taxCertificateNo;
    }

    public void setTaxCertificateNo(String taxCertificateNo) {
        this.taxCertificateNo = taxCertificateNo;
    }

    public PremiumType getPremiumType() {
        return premiumType;
    }

    public void setPremiumType(PremiumType premiumType) {
        this.premiumType = premiumType;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
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