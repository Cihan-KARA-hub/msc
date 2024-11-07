package com.msc.businessmanagement.api.controller;

import com.msc.businessmanagement.services.calendar.CalendarServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calendar")
public class CalendarController {
    public final CalendarServices calendarServices;

    public CalendarController(final CalendarServices calendarServices) {
        this.calendarServices = calendarServices;
    }

    @GetMapping("/getAll")
    public ResponseEntity<String> getAll() {
        return new ResponseEntity<>(calendarServices.getAll(), HttpStatus.OK);
    }
}
