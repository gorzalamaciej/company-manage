package com.bestapp.companymanage.controller;

import com.bestapp.companymanage.service.EmployeeService;
import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.request.EmployeeRequest;
import com.bestapp.companymanage.type.response.EmployeeResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/employee", method = RequestMethod.POST)
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getAll")
    @ResponseBody
    public EmployeeResponse getAll() {
        return employeeService.getAll();
    }

    @RequestMapping(value = "/add")
    @ResponseBody
    public void add(@Valid @RequestBody EmployeeRequest request) {
        logger.info("/employee/add = {}", request);
        employeeService.addEmployee(request);
    }

    @RequestMapping(value = "/edit")
    @ResponseBody
    public void edit(@Valid @RequestBody EditEmployeeRequest request) {
        logger.info("/employee/edit = {}", request);
        employeeService.editEmployee(request);
    }

}
