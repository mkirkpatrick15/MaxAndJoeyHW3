package com.cloud.controller;
import com.cloud.model.Attendee;
import com.cloud.repository.AttendeeRepository;
import com.cloud.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.stream.Collectors;

@Controller
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("attendee", new Attendee());
        return "index";
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public String register(@ModelAttribute Attendee attendee, RedirectAttributes redirectAttributes){
        registrationService.addAttendee(attendee);
        redirectAttributes.addFlashAttribute("attendees", registrationService.getAttendee());
        return "redirect:/";
    }

}
