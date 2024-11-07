package com.msc.businessmanagement.services.calendar;

import com.msc.businessmanagement.api.dto.PageModelResponseDto;
import com.msc.businessmanagement.model.Calendar;
import com.msc.businessmanagement.model.enums.CalendarStatus;
import com.msc.businessmanagement.repository.CalendarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.OffsetDateTime;
import java.util.Optional;


@Service
public class CalendarServices {
    // takvimdeki boş yerleri listeleme takvimdeki  dolu yerleri listele
    // aklıma başka bir şey gelmedi genel olarak listeleme işi yapılacak
    private final CalendarRepository calendarRepository;

    public CalendarServices(CalendarRepository calendarRepository) {
        this.calendarRepository = calendarRepository;
    }

    @Transactional
    public Optional<Calendar> getOpenCalendarAppointments(OffsetDateTime date, long businessId, boolean avaible) {
        return calendarRepository.findByAvailableAndDateAndBusinessId(avaible, date, businessId);
    }

    @Transactional
    public Optional<Calendar> getDateAndStatusAndBusinessId(OffsetDateTime date, CalendarStatus status, long businessId) {
        return calendarRepository.findByDateAndStatusAndBusinessId(date, status, businessId);
    }

    @Transactional
    public PageModelResponseDto<Calendar> getBusinessAppointments(Pageable pageable, long businessId, OffsetDateTime date, CalendarStatus status, boolean avaible) {
        Page<Calendar> pageData;
        if (pageable == null) {
            pageData = calendarRepository.findByBusinessIdAndDateAndStatusAndAvailable(pageable, businessId, date, status, avaible);
        } else {
            pageData = calendarRepository.findByBusinessIdAndDateAndStatusAndAvailable(pageable, businessId, date, status, avaible);
        }
        return new PageModelResponseDto<>(pageData.toList(), pageData.getTotalPages(), pageable);
    }

    @Transactional
    public String createAppointment(Calendar calendar, OffsetDateTime date, CalendarStatus status, boolean avaible) {

        calendar.setStatus(status);
        calendar.setAvailable(avaible);
        calendarRepository.save(calendar);
        return "Appointment created";
    }
    @Transactional
    public String updateStatus(int id, OffsetDateTime date, CalendarStatus status, boolean avaible) {
        Calendar calendar = calendarRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Entity with id: " + id + " not found."));
        calendar.setStatus(status);
        return status +" Status  updated";
    }
    @Transactional
    public String getAll(){
        return calendarRepository.findAll().toString();
    }


}
