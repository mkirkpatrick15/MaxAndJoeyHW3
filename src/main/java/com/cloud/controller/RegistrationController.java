package com.cloud.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegistrationController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
