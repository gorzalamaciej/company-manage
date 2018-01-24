package com.bestapp.companymanage.data.dto;

import org.hibernate.validator.constraints.Email;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "EMPLOYEE")
public class Employee extends BaseDto {

    @Column(nullable = false)
    @Size(min = 0, max = 50)
    private String name;

    @Size(min = 0, max = 500)
    private String surname;

    @Email
    @Size(min = 0, max = 50)
    private String email;

    @Size(min = 0, max = 50)
    private String passwordHash;

    private Date availableDate;

    @Size(min = 0, max = 50)
    private String position;

    private boolean activated;

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

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", availableDate=" + availableDate +
                ", position='" + position + '\'' +
                ", activated=" + activated +
                '}';
    }
}
