package com.msc.businessmanagement.services.business;

import com.msc.businessmanagement.api.dto.BusinessDto;
import com.msc.businessmanagement.api.mapper.BusinessMapper;
import com.msc.businessmanagement.model.Business;
import com.msc.businessmanagement.model.Owner;
import com.msc.businessmanagement.repository.BusinessRepository;
import com.msc.businessmanagement.repository.OwnerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BusinessServices {

    private final BusinessRepository businessRepository;
    private final OwnerRepository ownerRepository;
    private final BusinessMapper businessMapper;

    public BusinessServices(BusinessRepository businessRepository, OwnerRepository ownerRepository, BusinessMapper businessMapper) {
        this.businessRepository = businessRepository;
        this.ownerRepository = ownerRepository;
        this.businessMapper = businessMapper;
    }

    @Transactional
    public ResponseEntity<Void> save(Business business, long id) {
        Owner owner = ownerRepository.findById(id);
        business.setOwner(owner);
        businessRepository.save(business);
        return ResponseEntity.ok().build();
    }

    @Transactional
    public ResponseEntity<String> update(Business business, long id) {
        Owner owner = ownerRepository.findById(id);
        business.setOwner(owner);
        businessRepository.save(business);
        return ResponseEntity.ok("Business updated successfully-> id :" + business.getId() + " name :  " + business.getName());
    }

    @Transactional
    public ResponseEntity<String> delete(long id) {
        businessRepository.deleteById(id);
        return ResponseEntity.ok(" deleted successfully-> id :" + id);
    }

    @Transactional
    public ResponseEntity<List<Business>> getAll() {
        List<Business> businesses = businessRepository.findAll();
        return ResponseEntity.ok(businesses);
    }

    @Transactional
    public ResponseEntity<BusinessDto> getById(long id) {
        Business business = businessRepository.findById(id);
        if (business != null) {
            BusinessDto dto= businessMapper.toDto(business);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // kullanıcı puanları çekilip ortalama alınıp bu ortalama ile puanlama çekilecek !!

}
