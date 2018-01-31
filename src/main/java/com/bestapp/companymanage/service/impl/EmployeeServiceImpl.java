package com.bestapp.companymanage.service.impl;

import com.bestapp.companymanage.data.dao.EmployeeDao;
import com.bestapp.companymanage.data.dto.Employee;
import com.bestapp.companymanage.service.EmployeeService;
import com.bestapp.companymanage.type.request.AddEmployeeRequest;
import com.bestapp.companymanage.type.request.DeleteEmployeeRequest;
import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.response.EmployeeListResponse;
import com.bestapp.companymanage.type.response.EmployeeResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public EmployeeListResponse getAllApi() {
        return new EmployeeListResponse(employeeDao.getEmployeeList());
    }

    @Override
    @Transactional
    public List<Employee> getAll() {
        return employeeDao.getEmployeeList();
    }

    @Override
    public EmployeeResponse get(String email) {
        return new EmployeeResponse(employeeDao.findBy(email));
    }

    @Override
    @Transactional
    public void add(AddEmployeeRequest request) {
        Employee employee = new Employee();
        employee.setActivated(true);
        employee.setAvailableDate(new Date());
        employee.setEmail(request.getEmail());
        employee.setName(request.getName());
        employee.setPasswordHash(request.getPasswordHash());
        employee.setPosition(request.getPosition());
        employee.setSurname(request.getSurname());
        employeeDao.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public void update(EditEmployeeRequest request) {
        Employee employee = employeeDao.findBy(request.getEmail());

        if (request.getAvailableDate() != null) {
            employee.setAvailableDate(request.getAvailableDate());
        }
        if (request.getSurname() != null) {
            employee.setSurname(request.getSurname());
        }
        if (request.getPosition() != null) {
            employee.setPosition(request.getPosition());
        }
        if (request.getName() != null) {
            employee.setName(request.getName());
        }
        if (request.getActive() != null) {
            employee.setActivated(request.getActive());
        }

        employeeDao.saveOrUpdate(employee);
    }

    @Override
    @Transactional
    public void delete(DeleteEmployeeRequest request) {
        Employee employee = employeeDao.findBy(request.getEmail(), request.getPasswordHash());
        employeeDao.delete(employee);
    }
}
