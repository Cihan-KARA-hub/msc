package com.msc.businessmanagement.api.dto;

import com.msc.businessmanagement.model.Business;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class EmployeeDto {
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String firstName;
    @Size(min = 2, max = 50)
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String email;
    @NotEmpty
    @Size(min = 2, max = 11)
    private String phoneNumber;

    @NotEmpty
    private String position;

    private byte[] profilePicture;

    @NotEmpty
    private Business business;

}
