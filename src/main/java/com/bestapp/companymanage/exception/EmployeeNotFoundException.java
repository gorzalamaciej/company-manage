package com.bestapp.companymanage.exception;

public class EmployeeNotFoundException extends MappedException {

    public EmployeeNotFoundException() {
        super(ErrorCodes.EMPLOYEE_NOT_FOUND_EXCEPTION);
    }

    public EmployeeNotFoundException(String message) {
        super(ErrorCodes.EMPLOYEE_NOT_FOUND_EXCEPTION.name(), message);
    }
}