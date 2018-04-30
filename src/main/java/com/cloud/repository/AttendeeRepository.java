package com.cloud.repository;

import java.util.ArrayList;
import java.util.List;
import com.cloud.model.Attendee;
import org.springframework.stereotype.Component;

@Component
public class AttendeeRepository {
    private List<Attendee> attendees = new ArrayList<>();

    public List<Attendee> findall(){
        return attendees;
    }
    public void addAttendee(Attendee attendee){
        attendees.add(attendee);
    }
    public String allAttendeesAsString(){
        String attendeeStr = "";
        for(Attendee attendee:attendees){
            attendeeStr = attendeeStr + attendee.getEmail() + ", ";
        }
        return attendeeStr;
    }
}
