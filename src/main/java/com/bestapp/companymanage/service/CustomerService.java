package com.bestapp.companymanage.service;

import com.bestapp.companymanage.data.dto.Customer;
import com.bestapp.companymanage.type.request.AddCustomerRequest;
import com.bestapp.companymanage.type.request.EditCustomerRequest;
import com.bestapp.companymanage.type.response.CustomerListResponse;
import com.bestapp.companymanage.type.response.CustomerResponse;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    CustomerListResponse getAllApi();

    List<Customer> getAll();

    CustomerResponse get(String email);

    void add(AddCustomerRequest request);

    void update(EditCustomerRequest request);

    void delete(String phoneNumber);
}
