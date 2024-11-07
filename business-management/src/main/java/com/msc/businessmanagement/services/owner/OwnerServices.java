package com.msc.businessmanagement.services.owner;

import com.msc.businessmanagement.model.Owner;
import com.msc.businessmanagement.repository.OwnerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class OwnerServices {

    private final OwnerRepository ownerRepository;

    public OwnerServices(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Transactional
    public ResponseEntity<String> addOwner(Owner owner) {
        ownerRepository.save(owner);
        System.out.println( owner.getId());
        return ResponseEntity.ok("Success");
    }

    @Transactional
    public ResponseEntity<String> updateOwner(Owner owner) {
        ownerRepository.save(owner);
        return ResponseEntity.ok("Success");
    }

    @Transactional
    public ResponseEntity<String> deleteOwner(long id) {
        ownerRepository.deleteById(id);
        return ResponseEntity.ok("Success deleted : " + id);
    }

    @Transactional
    public ResponseEntity<List<Owner>> getAllOwner() {
        List<Owner> owners = ownerRepository.findAll();
        return ResponseEntity.ok(owners);
    }
}
