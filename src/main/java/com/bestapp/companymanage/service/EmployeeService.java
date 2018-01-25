package com.bestapp.companymanage.service;

import com.bestapp.companymanage.type.request.AddEmployeeRequest;
import com.bestapp.companymanage.type.request.DeleteEmployeeRequest;
import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.response.EmployeeListResponse;
import com.bestapp.companymanage.type.response.EmployeeResponse;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

    EmployeeListResponse getAll();

    EmployeeResponse get(String email);

    void add(AddEmployeeRequest request);

    void update(EditEmployeeRequest request);

    void delete(DeleteEmployeeRequest request);
}
