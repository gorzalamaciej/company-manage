package com.bestapp.companymanage.type.response;

import com.bestapp.companymanage.data.dto.Customer;

public class CustomerResponse extends GenericResponse {
    private CustomerData data;

    public CustomerResponse() {

    }

    public CustomerResponse(Customer customer) {
        this.data = new CustomerData(customer);
    }

    public CustomerResponse(CustomerData data) {
        this.data = data;
    }

    public CustomerData getData() {
        return data;
    }

    public void setData(CustomerData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CustomerResponse{" +
                "data=" + data +
                "} " + super.toString();
    }
}
