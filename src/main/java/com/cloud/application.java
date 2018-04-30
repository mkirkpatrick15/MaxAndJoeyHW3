package com.cloud;

import com.cloud.model.Attendee;
import com.cloud.repository.AttendeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class application extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
        return app.sources(application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(application.class, args);
    }

}