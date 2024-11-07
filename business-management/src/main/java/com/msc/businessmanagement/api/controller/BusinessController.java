package com.msc.businessmanagement.api.controller;

import com.msc.businessmanagement.api.dto.BusinessDto;
import com.msc.businessmanagement.model.Business;
import com.msc.businessmanagement.services.business.BusinessServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/business")
public class BusinessController {

    private final BusinessServices businessServices;

    public BusinessController(BusinessServices businessServices) {
        this.businessServices = businessServices;
    }

    @PostMapping("/create/{id}")
    public ResponseEntity<Void> createBusiness(@RequestBody Business business,@PathVariable long id) {
        return businessServices.save(business, id);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<String> updateBusiness(@RequestBody Business business,@PathVariable long id) {
        return businessServices.update(business,id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBusiness(@PathVariable Long id) {
        return businessServices.delete(id);
    }
    @GetMapping("/gelAll")
    public ResponseEntity<List<Business>> getAllBusinesses() {
        return businessServices.getAll();
    }
    @GetMapping("/get_salon_by_id/{id}")
    public ResponseEntity<BusinessDto> getBusinessById(@PathVariable Long id) {
        return  businessServices.getById(id);
    }
}
