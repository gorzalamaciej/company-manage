package com.bestapp.companymanage.data.dao.impl;

import com.bestapp.companymanage.data.dao.EmployeeDao;
import com.bestapp.companymanage.data.dto.Employee;
import com.bestapp.companymanage.exception.EmployeeNotFoundException;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.ResourceBundle;

@Service
public class EmployeeDaoImpl extends BaseDaoImpl<Employee> implements EmployeeDao {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeDaoImpl.class);

    public EmployeeDaoImpl() {
        super(Employee.class);
    }

    @Override
    @Transactional
    public List<Employee> getEmployeeList() {
        Criteria criteria = createCriteria();

        return criteria.list();
    }

    @Override
    @Transactional
    public Employee findBy(String email) {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("email", email));

        Employee employee = (Employee) criteria.uniqueResult();

        if (employee == null) {
            throw  new EmployeeNotFoundException(String.format("Employee not found for email = {%s}", email));
        }

        return employee;
    }

    @Override
    public Employee findBy(String email, String password) {
        Criteria criteria = createCriteria();
        criteria.add(Restrictions.eq("email", email));
        criteria.add(Restrictions.eq("passwordHash", password));

        Employee employee = (Employee) criteria.uniqueResult();

        if (employee == null) {
            throw  new EmployeeNotFoundException(String.format("Employee not found for email = {%s}", email));
        }

        return employee;
    }
}
