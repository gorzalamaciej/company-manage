package com.bestapp.companymanage.type.request;

public class DeleteEmployeeRequest {
    private String email;
    private String passwordHash;

    public DeleteEmployeeRequest() {
    }

    public DeleteEmployeeRequest(String email, String passwordHash) {
        this.email = email;
        this.passwordHash = passwordHash;
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

    @Override
    public String toString() {
        return "DeleteEmployeeRequest{" +
                "email='" + email + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                '}';
    }
}
