package com.bestapp.companymanage.type.request;

public class AddEmployeeRequest extends EmployeeData {
    private String passwordHash;

    public AddEmployeeRequest() {
    }

    public AddEmployeeRequest(String name, String surname, String email, String passwordHash, String position) {
        super(name, surname, email, position);
        this.passwordHash = passwordHash;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    @Override
    public String toString() {
        return "AddEmployeeRequest{" +
                "passwordHash='" + passwordHash + '\'' +
                "} " + super.toString();
    }
}
