package com.bestapp.companymanage.type.response;

import com.bestapp.companymanage.data.dto.Customer;
import com.bestapp.companymanage.data.dto.Employee;

import java.util.ArrayList;
import java.util.List;

public class CustomerListResponse extends GenericResponse {

    private List<CustomerData> customers;

    public CustomerListResponse() {
        super();
    }

    public CustomerListResponse(List<Customer> customerList) {
        if(customers == null) {
            customers = new ArrayList<>();
        }

        for (Customer customer : customerList) {
            customers.add(new CustomerData("", customer.getName(), customer.getAddress(), customer.getPhoneNumber()));
        }
    }

    public List<CustomerData> getCustomers() {
        return customers;
    }

    public void setCustomers(List<CustomerData> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerListResponse{" +
                "customers=" + customers +
                "} " + super.toString();
    }
}
