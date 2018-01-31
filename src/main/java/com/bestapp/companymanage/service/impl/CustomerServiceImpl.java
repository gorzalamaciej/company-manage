package com.bestapp.companymanage.service.impl;

import com.bestapp.companymanage.data.dao.CustomerDao;
import com.bestapp.companymanage.data.dto.Customer;
import com.bestapp.companymanage.service.CustomerService;
import com.bestapp.companymanage.type.request.AddCustomerRequest;
import com.bestapp.companymanage.type.request.DeleteCustomerRequest;
import com.bestapp.companymanage.type.request.EditCustomerRequest;
import com.bestapp.companymanage.type.response.CustomerListResponse;
import com.bestapp.companymanage.type.response.CustomerResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    @Transactional
    public CustomerListResponse getAllApi() {
        return new CustomerListResponse(customerDao.getCustomerList());
    }

    @Override
    @Transactional
    public List<Customer> getAll() {
        return customerDao.getCustomerList();
    }

    @Override
    public CustomerResponse get(String email) {
        return new CustomerResponse(customerDao.findBy(email));
    }

    @Override
    @Transactional
    public void add(AddCustomerRequest request) {
        Customer customer = new Customer();
        customer.setAddress(request.getAddress());
        customer.setName(request.getName());
        customer.setPhoneNumber(request.getPhoneNumber());
        customerDao.saveOrUpdate(customer);
    }

    @Override
    @Transactional
    public void update(EditCustomerRequest request) {
        Customer customer = customerDao.findBy(request.getPhoneNumber());

        if (request.getAddress() != null) {
            customer.setAddress(request.getAddress());
        }
        if (request.getName() != null) {
            customer.setName(request.getName());
        }

        customerDao.saveOrUpdate(customer);
    }

    @Override
    @Transactional
    public void delete(String phoneNumber) {
        Customer customer = customerDao.findBy(phoneNumber);
        customerDao.delete(customer);
    }
}
