package com.bestapp.companymanage.type.request;

public class DeleteCustomerRequest {
    private String phoneNumber;

    public DeleteCustomerRequest() {
    }

    public DeleteCustomerRequest(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "DeleteCustomerRequest{" +
                "phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
