package com.msc.businessmanagement.api.controller;

import com.msc.businessmanagement.model.Customer;
import com.msc.businessmanagement.services.customer.CustomerServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

    private final CustomerServices customerServices;

    public CustomerController(CustomerServices customerServices) {
        this.customerServices = customerServices;
    }

    @PostMapping("/create")
    public ResponseEntity<String> crateCustomer(@RequestBody Customer customer) {
        return customerServices.createCustomer(customer);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateCustomer(@RequestBody Customer customer) {
        return customerServices.createCustomer(customer);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable int id) {
        return customerServices.deleteCustomer(id);
    }

}
