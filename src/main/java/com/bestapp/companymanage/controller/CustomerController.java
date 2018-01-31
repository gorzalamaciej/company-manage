package com.bestapp.companymanage.controller;

import com.bestapp.companymanage.service.CustomerService;
import com.bestapp.companymanage.type.request.AddCustomerRequest;
import com.bestapp.companymanage.type.request.DeleteCustomerRequest;
import com.bestapp.companymanage.type.request.EditCustomerRequest;
import com.bestapp.companymanage.type.response.CustomerData;
import com.bestapp.companymanage.type.response.CustomerResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @RequestMapping(path = "/add", method = RequestMethod.GET)
    public String createProduct(Model model) {
        model.addAttribute("customer", new AddCustomerRequest());
        return "edit";
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public String saveProduct(AddCustomerRequest request) {
        customerService.add(request);
        return "redirect:/";
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getAllProducts(Model model) {
        model.addAttribute("customers", customerService.getAll());
        return "products";
    }

    @RequestMapping(path = "/edit/{id}", method = RequestMethod.GET)
    public String editProduct(Model model, @PathVariable(value = "id") String id) {
        model.addAttribute("customer", customerService.get(id));
        return "edit";
    }

    @RequestMapping(path = "/delete/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable(name = "id") String id) {
        customerService.delete(id);
        return "redirect:/customer";
    }
}
