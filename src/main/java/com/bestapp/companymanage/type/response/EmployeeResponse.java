package com.bestapp.companymanage.type.response;

import com.bestapp.companymanage.data.dto.Employee;

public class EmployeeResponse extends GenericResponse {
    private EmployeeData data;

    public EmployeeResponse() {

    }

    public EmployeeResponse(Employee employee) {
        this.data = new EmployeeData(employee);
    }

    public EmployeeResponse(EmployeeData data) {
        this.data = data;
    }

    public EmployeeData getData() {
        return data;
    }

    public void setData(EmployeeData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "EmployeeResponse{" +
                "data=" + data +
                "} " + super.toString();
    }
}
