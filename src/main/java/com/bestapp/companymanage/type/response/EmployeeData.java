package com.bestapp.companymanage.type.response;

import java.util.Date;

public class EmployeeData {
    private String id;
    private String name;
    private String surname;
    private Date availableDate;

    public EmployeeData() {
    }

    public EmployeeData(String id, String name, String surname, Date availableDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.availableDate = availableDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", availableDate=" + availableDate +
                '}';
    }
}
