package com.cloud.repository;

import com.cloud.model.Attendee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AttendeeRepository extends CrudRepository<Attendee, Integer> {

}
