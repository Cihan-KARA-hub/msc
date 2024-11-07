package com.msc.businessmanagement.services.princing;

import com.msc.businessmanagement.model.Business;
import com.msc.businessmanagement.model.Pricing;
import com.msc.businessmanagement.repository.BusinessRepository;
import com.msc.businessmanagement.repository.PricingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PricingServices {
    private final PricingRepository pricingRepository;
    private final BusinessRepository businessRepository;

    public PricingServices(PricingRepository pricingRepository, BusinessRepository businessRepository) {
        this.pricingRepository = pricingRepository;
        this.businessRepository = businessRepository;
    }

    @Transactional
    public ResponseEntity<String> addPricing(Pricing pricing, long businesId) {
        Business business = businessRepository.getById(businesId);
        pricing.setbusiness(business);
        pricingRepository.save(pricing);
        return ResponseEntity.ok("saved");
    }

    @Transactional
    public ResponseEntity<String> updatePricing(Pricing pricing) {
        pricingRepository.save(pricing);
        return ResponseEntity.ok("updated");
    }

    @Transactional
    public ResponseEntity<String> deletePricing( long id) {
        pricingRepository.deleteById(id);
        return ResponseEntity.ok("deleted");
    }

    @Transactional
    public ResponseEntity<List<Pricing>> getAllPricing(long businesId) {
        List<Pricing> pricings = pricingRepository.findByBusinessId(businesId);
        return ResponseEntity.ok(pricings);
    }
}
