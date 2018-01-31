package com.bestapp.companymanage.controller.api;

import com.bestapp.companymanage.service.EmployeeService;
import com.bestapp.companymanage.type.request.AddEmployeeRequest;
import com.bestapp.companymanage.type.request.DeleteEmployeeRequest;
import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.response.EmployeeListResponse;
import com.bestapp.companymanage.type.response.EmployeeResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/employee")
public class ApiEmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(ApiEmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ResponseBody
    public EmployeeListResponse getAll() {
        return employeeService.getAllApi();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public EmployeeResponse get(String email) {
        return employeeService.get(email);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void add(@RequestBody AddEmployeeRequest request) {
        logger.info("/employee/add = {}", request);
        employeeService.add(request);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(@RequestBody EditEmployeeRequest request) {
        logger.info("/employee/update = {}", request);
        employeeService.update(request);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@RequestBody DeleteEmployeeRequest request) {
        logger.info("/employee/delete = {}", request);
        employeeService.delete(request);
    }

}
