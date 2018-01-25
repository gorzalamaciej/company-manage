package com.bestapp.companymanage.type.response;

import com.bestapp.companymanage.data.dto.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListResponse extends GenericResponse {

    private List<EmployeeData> employees;

    public EmployeeListResponse() {
        super();
    }

    public EmployeeListResponse(List<Employee> employeeList) {
        if(employees == null) {
            employees = new ArrayList<>();
        }

        for (Employee employee : employeeList) {
            employees.add(new EmployeeData("", employee.getName(), employee.getSurname(), employee.getAvailableDate()));
        }
    }

    public List<EmployeeData> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeData> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "employees=" + employees +
                '}';
    }
}
