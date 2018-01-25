package com.bestapp.companymanage.type.request;

import java.util.Date;

public class EditEmployeeRequest extends EmployeeData {
    private Boolean active;
    private Date availableDate;

    public EditEmployeeRequest() {
    }

    public EditEmployeeRequest(String name, String surname, String email, String position, Boolean active, Date availableDate) {
        super(name, surname, email, position);
        this.active = active;
        this.availableDate = availableDate;
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
                "active=" + active +
                ", availableDate=" + availableDate +
                "} " + super.toString();
    }
}
