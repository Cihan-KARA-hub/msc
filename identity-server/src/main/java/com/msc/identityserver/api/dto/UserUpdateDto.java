package com.msc.identityserver.api.dto;

public class UserUpdateDto {
    private String username;
    private String email;
    private String lastName;
    private String firstName;
    private boolean enabled;


    public UserUpdateDto(String username, String email, String lastName, String firstName, boolean enabled) {
        this.username = username;
        this.email = email;
        this.lastName = lastName;
        this.firstName = firstName;
        this.enabled = enabled;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
