package com.msc.businessmanagement.repository;

import com.msc.businessmanagement.model.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusinessRepository extends JpaRepository<Business, Long> {
    public Business findById(long id);
}
