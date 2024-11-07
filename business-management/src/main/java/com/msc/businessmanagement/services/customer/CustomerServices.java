package com.msc.businessmanagement.services.customer;


import com.msc.businessmanagement.model.Customer;
import com.msc.businessmanagement.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomerServices {

    private final CustomerRepository customerRepository;

    public CustomerServices(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional
    public ResponseEntity<String> createCustomer(Customer customer) {
        customerRepository.save(customer);
        return ResponseEntity.ok("Customer created");
    }

    @Transactional
    public ResponseEntity<String> updateCustomer(Customer customer) {
        customerRepository.save(customer);
        return ResponseEntity.ok("Customer updated");
    }

    @Transactional
    public ResponseEntity<String> deleteCustomer(long id) {
        customerRepository.deleteById(id);
        return ResponseEntity.ok("Customer deleted: " + id);
    }

}
