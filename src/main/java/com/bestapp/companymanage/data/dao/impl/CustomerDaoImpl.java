package com.bestapp.companymanage.data.dao.impl;

import com.bestapp.companymanage.data.dao.CustomerDao;
import com.bestapp.companymanage.data.dao.EmployeeDao;
import com.bestapp.companymanage.data.dto.Customer;
import com.bestapp.companymanage.data.dto.Employee;
import com.bestapp.companymanage.exception.EmployeeNotFoundException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerDaoImpl extends BaseDaoImpl<Customer> implements CustomerDao {

    private static final Logger logger = LoggerFactory.getLogger(CustomerDaoImpl.class);

    public CustomerDaoImpl() {
        super(Customer.class);
    }

    @Override
    @Transactional
    public List<Customer> getCustomerList() {
        Criteria criteria = createCriteria();

        return criteria.list();
    }

    @Override
    @Transactional
    public Customer findBy(String phoneNumber) {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("phoneNumber", phoneNumber));

        Customer customer = (Customer) criteria.uniqueResult();

        if (customer == null) {
            throw  new EmployeeNotFoundException(String.format("Customer not found for phoneNumber = {%s}", phoneNumber));
        }

        return customer;
    }
}
