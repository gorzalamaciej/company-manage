package com.bestapp.companymanage.service.impl;

import com.bestapp.companymanage.data.dao.EmployeeDao;
import com.bestapp.companymanage.data.dto.Employee;
import com.bestapp.companymanage.service.EmployeeService;
import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.request.EmployeeRequest;
import com.bestapp.companymanage.type.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    @Transactional
    public EmployeeResponse getAll() {
        return new EmployeeResponse(employeeDao.getEmployeeList());
    }

    @Override
    @Transactional
    public void addEmployee(EmployeeRequest request) {
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
    public void editEmployee(EditEmployeeRequest request) {
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
}
