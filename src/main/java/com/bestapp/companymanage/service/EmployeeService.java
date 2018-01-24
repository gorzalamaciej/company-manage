package com.bestapp.companymanage.service;

import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.request.EmployeeRequest;
import com.bestapp.companymanage.type.response.EmployeeResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    EmployeeResponse getAll();

    void addEmployee(EmployeeRequest request);

    void editEmployee(EditEmployeeRequest request);
}
