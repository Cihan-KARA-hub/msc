package com.msc.businessmanagement.api.controller;

import com.msc.businessmanagement.model.Employee;
import com.msc.businessmanagement.services.employee.EmployeeServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private final EmployeeServices employeeServices;

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }

    @PostMapping("/create/{businesId}")
    public ResponseEntity<Void> createEmployee(@RequestBody Employee employee, @PathVariable long businesId) {
        return employeeServices.addEmployee(employee, businesId);
    }

    @PostMapping("/update")
    public ResponseEntity<Void> updateEmployee(@RequestBody Employee employee) {
        return employeeServices.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeServices.deleteEmployee(id);
    }

    @GetMapping("/businessIdToEmployee/{id}")
    public ResponseEntity<Optional<List<Employee>>> getEmployeeById(@PathVariable long id) {
        return employeeServices.getSalonIdEmployee(id);
    }
}
