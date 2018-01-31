package com.bestapp.companymanage.controller.api;

import com.bestapp.companymanage.service.CustomerService;
import com.bestapp.companymanage.service.EmployeeService;
import com.bestapp.companymanage.type.request.AddCustomerRequest;
import com.bestapp.companymanage.type.request.AddEmployeeRequest;
import com.bestapp.companymanage.type.request.DeleteCustomerRequest;
import com.bestapp.companymanage.type.request.DeleteEmployeeRequest;
import com.bestapp.companymanage.type.request.EditCustomerRequest;
import com.bestapp.companymanage.type.request.EditEmployeeRequest;
import com.bestapp.companymanage.type.response.CustomerListResponse;
import com.bestapp.companymanage.type.response.CustomerResponse;
import com.bestapp.companymanage.type.response.EmployeeListResponse;
import com.bestapp.companymanage.type.response.EmployeeResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api/customer")
public class ApiCustomerController {

    private static final Logger logger = LoggerFactory.getLogger(ApiCustomerController.class);

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ResponseBody
    public CustomerListResponse getAll() {
        return customerService.getAllApi();
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public CustomerResponse get(String phoneNumber) {
        return customerService.get(phoneNumber);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public void add(@RequestBody AddCustomerRequest request) {
        logger.info("/customer/add = {}", request);
        customerService.add(request);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public void update(@RequestBody EditCustomerRequest request) {
        logger.info("/customer/update = {}", request);
        customerService.update(request);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public void delete(@RequestBody DeleteCustomerRequest request) {
        logger.info("/customer/delete = {}", request);
        customerService.delete(request.getPhoneNumber());
    }

}
