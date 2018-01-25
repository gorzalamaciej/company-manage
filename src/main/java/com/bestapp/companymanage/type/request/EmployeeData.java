package com.bestapp.companymanage.type.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AddEmployeeRequest.class),
        @JsonSubTypes.Type(value = EditEmployeeRequest.class),
})
public class EmployeeData {
    private String name;
    private String surname;
    private String email;
    private String position;

    public EmployeeData() {
    }

    public EmployeeData(String name, String surname, String email, String position) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.position = position;
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

    @Override
    public String toString() {
        return "EmployeeRequest{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
