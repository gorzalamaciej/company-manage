package com.bestapp.companymanage.data.dao;

import com.bestapp.companymanage.data.dto.Customer;
import com.bestapp.companymanage.data.dto.Employee;

import java.util.List;

public interface CustomerDao extends BaseDao<Customer> {

    List<Customer> getCustomerList();

    Customer findBy(String phoneNumber);

}
