package com.cloud.service;


import com.cloud.model.Attendee;
import com.cloud.repository.AttendeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    @Autowired
    AttendeeRepository attendeeRepository;

    public Attendee addAttendee(Attendee attendee){

        attendeeRepository.save(attendee);
        return attendee;
    }

    public Iterable <Attendee> getAttendee(){

        return attendeeRepository.findAll();
    }

    
}
