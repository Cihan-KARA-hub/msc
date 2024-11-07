package com.msc.businessmanagement.repository;

import com.msc.businessmanagement.model.Business;
import com.msc.businessmanagement.model.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PricingRepository extends JpaRepository<Pricing, Long> {

    List<Pricing> findByBusinessId(Long businessId);
}
