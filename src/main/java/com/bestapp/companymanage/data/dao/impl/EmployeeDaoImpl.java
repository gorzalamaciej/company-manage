package com.bestapp.companymanage.data.dao.impl;

import com.bestapp.companymanage.data.dao.EmployeeDao;
import com.bestapp.companymanage.data.dto.Employee;
import org.hibernate.Criteria;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
