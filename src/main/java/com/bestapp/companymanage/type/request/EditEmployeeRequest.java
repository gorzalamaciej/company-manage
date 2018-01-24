package com.bestapp.companymanage.type.request;

import java.util.Date;

public class EditEmployeeRequest {
    private String name;
    private String surname;
    private String email;
    private String position;
    private Boolean active;
    private Date availableDate;

    public EditEmployeeRequest() {
    }

    public EditEmployeeRequest(String name, String surname, String email, String position, Boolean active, Date availableDate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.position = position;
        this.active = active;
        this.availableDate = availableDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    @Override
    public String toString() {
        return "EditEmployeeRequest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                ", active=" + active +
                ", availableDate=" + availableDate +
                '}';
    }
}
