package com.bestapp.companymanage.data.dao;

import com.bestapp.companymanage.data.dto.Employee;

import java.util.List;

public interface EmployeeDao extends BaseDao<Employee> {

    List<Employee> getEmployeeList();

    Employee findBy(String email);

}
