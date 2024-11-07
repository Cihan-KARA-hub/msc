package com.msc.businessmanagement.api.controller;


import com.msc.businessmanagement.model.Pricing;
import com.msc.businessmanagement.services.princing.PricingServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pricing")
public class PricingController {
    private final PricingServices pricingServices;

    public PricingController(PricingServices pricingServices) {
        this.pricingServices = pricingServices;
    }

    @PostMapping("/create/{business_id}")
    public ResponseEntity<String> createPricing(@RequestBody Pricing pricing, @PathVariable("business_id") long businessId) {
        return pricingServices.addPricing(pricing, businessId);
    }

    @GetMapping("/getAll/{id}")
    public ResponseEntity<List<Pricing>> getAllPricings(@PathVariable long id) {
        return pricingServices.getAllPricing(id);
    }

    @PostMapping("/update")
    public ResponseEntity<String> updatePricing(@RequestBody Pricing pricing) {
        return pricingServices.updatePricing(pricing);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePricing(@PathVariable long id) {
        return pricingServices.deletePricing(id);
    }
}
