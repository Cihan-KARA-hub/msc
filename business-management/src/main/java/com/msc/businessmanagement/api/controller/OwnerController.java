package com.msc.businessmanagement.api.controller;

import com.msc.businessmanagement.model.Owner;
import com.msc.businessmanagement.services.owner.OwnerServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/owner")
public class OwnerController {

    private final OwnerServices ownerServices;

    public OwnerController(OwnerServices ownerServices) {
        this.ownerServices = ownerServices;
    }

    @PostMapping("/create")
    public ResponseEntity<String> createOwner(@RequestBody Owner owner) {
        return ownerServices.addOwner(owner);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updateOwner(@RequestBody Owner owner) {
        return ownerServices.updateOwner(owner);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteOwner(@PathVariable("id") long id) {
        return ownerServices.deleteOwner(id);
    }
    @GetMapping("/getlAll")
    public ResponseEntity<List<Owner>> getAllOwners() {
        return  ownerServices.getAllOwner();
    }

}
