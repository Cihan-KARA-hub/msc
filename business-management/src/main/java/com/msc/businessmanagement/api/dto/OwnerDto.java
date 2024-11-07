package com.msc.businessmanagement.api.dto;


import com.msc.businessmanagement.model.enums.PremiumType;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

/*
{
"id":1
"firstName": "Cihan",
"lastName": "Kara",
"email": "Cihankara@gmail.com",
"phoneNumber": "05455739907",
"masterCertificateNo": "123421312312341242222",
"tcNo": "19224299213",
"taxCertificateNo": "1241241241274681925139561",
"premiumType": "GOLD"
}
*/
public class OwnerDto {
    @NotEmpty
    @Size(min = 1, max = 50)
    String firstName;
    @NotEmpty
    @Size(min = 1, max = 50)
    String lastName;
    @NotEmpty
    @Size(min = 1, max = 100)
    String email;
    @NotEmpty
    @Size(min = 1, max = 20)
    String phone;
    @NotEmpty
    @Size(min = 1, max = 300)
    String address;
    @NotEmpty
    @Size(min = 1, max = 150)
    String masterCertificateNo;
    @NotEmpty
    @Size(min = 1, max = 11)
    String TcNo;
    @NotEmpty
    @Size(min = 1, max = 150)
    String taxCertificateNo;
    @NotEmpty
    @Size(min = 1, max = 20)
    PremiumType premiumType;

    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public @NotEmpty @Size(min = 1, max = 20) PremiumType getPremiumType() {
        return premiumType;
    }

    public void setPremiumType(@NotEmpty @Size(min = 1, max = 20) PremiumType premiumType) {
        this.premiumType = premiumType;
    }

    public @NotEmpty @Size(min = 1, max = 150) String getTaxCertificateNo() {
        return taxCertificateNo;
    }

    public void setTaxCertificateNo(@NotEmpty @Size(min = 1, max = 150) String taxCertificateNo) {
        this.taxCertificateNo = taxCertificateNo;
    }

    public @NotEmpty @Size(min = 1, max = 11) String getTcNo() {
        return TcNo;
    }

    public void setTcNo(@NotEmpty @Size(min = 1, max = 11) String tcNo) {
        TcNo = tcNo;
    }

    public @NotEmpty @Size(min = 1, max = 150) String getMasterCertificateNo() {
        return masterCertificateNo;
    }

    public void setMasterCertificateNo(@NotEmpty @Size(min = 1, max = 150) String masterCertificateNo) {
        this.masterCertificateNo = masterCertificateNo;
    }

    public @NotEmpty @Size(min = 1, max = 300) String getAddress() {
        return address;
    }

    public void setAddress(@NotEmpty @Size(min = 1, max = 300) String address) {
        this.address = address;
    }

    public @NotEmpty @Size(min = 1, max = 20) String getPhone() {
        return phone;
    }

    public void setPhone(@NotEmpty @Size(min = 1, max = 20) String phone) {
        this.phone = phone;
    }

    public @NotEmpty @Size(min = 1, max = 100) String getEmail() {
        return email;
    }

    public void setEmail(@NotEmpty @Size(min = 1, max = 100) String email) {
        this.email = email;
    }

    public @NotEmpty @Size(min = 1, max = 50) String getLastName() {
        return lastName;
    }

    public void setLastName(@NotEmpty @Size(min = 1, max = 50) String lastName) {
        this.lastName = lastName;
    }

    public @NotEmpty @Size(min = 1, max = 50) String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotEmpty @Size(min = 1, max = 50) String firstName) {
        this.firstName = firstName;
    }
}
