package com.msc.businessmanagement.repository;

import com.msc.businessmanagement.model.Calendar;
import com.msc.businessmanagement.model.enums.CalendarStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.OffsetDateTime;
import java.util.Optional;

@Repository
public interface CalendarRepository extends JpaRepository<Calendar, Integer> {
    Optional<Calendar> findByAvailableAndDateAndBusinessId(boolean isAvailable, OffsetDateTime date, long businessId);

    Optional<Calendar> findByDateAndStatusAndBusinessId(OffsetDateTime date, CalendarStatus status, long businessId);
    Page<Calendar> findByBusinessIdAndDateAndStatusAndAvailable(Pageable pageable,Long businessId, OffsetDateTime date,CalendarStatus status,boolean availble);
}
