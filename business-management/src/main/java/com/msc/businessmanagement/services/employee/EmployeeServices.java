package com.msc.businessmanagement.services.employee;


import com.msc.businessmanagement.api.mapper.EmployeeMapper;
import com.msc.businessmanagement.model.Business;
import com.msc.businessmanagement.model.Employee;
import com.msc.businessmanagement.repository.BusinessRepository;
import com.msc.businessmanagement.repository.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServices {
    // burda aslında bir kod gelecek ve kod sayesinde  employee oluşturabilecek

    private final EmployeeRepository employeeRepository;
    private final BusinessRepository businessRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeServices(EmployeeRepository employeeRepository, BusinessRepository businessRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.businessRepository = businessRepository;
        this.employeeMapper = employeeMapper;
    }


    @Transactional
    public ResponseEntity<Void> addEmployee(Employee employee, long businessId) {
        Business business = businessRepository.findById(businessId);
        employee.setbusiness(business);
        employeeRepository.save(employee);
        return ResponseEntity.ok().build();
    }

    @Transactional
    public ResponseEntity<Void> updateEmployee(Employee employee) {
        employeeRepository.save(employee);
        return ResponseEntity.ok().build();
    }

    @Transactional
    public ResponseEntity<Void> deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    //ilgili id'nin çalısanlarını getir
    @Transactional
    public ResponseEntity<Optional<List<Employee>>> getSalonIdEmployee(long id) {
        Optional<List<Employee>> employee = employeeRepository.findByBusinessId(id);
        if (employee.isPresent()) {
            return ResponseEntity.ok().body(employee);
        }
        return ResponseEntity.ok().body(employee);
    }
}
