package com.springbeershop.springbeershop.controllers.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserRegistrationController {

  @GetMapping(path = "/registration-page")
  public String showRegistrationPage() {
    return "registration/user-registration";
  }

}
