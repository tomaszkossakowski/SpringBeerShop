package com.springbeershop.springbeershop.controllers.registration;

import com.springbeershop.springbeershop.entities.User;
import com.springbeershop.springbeershop.services.registration.RegistrationUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class UserRegistrationController {

  private final RegistrationUserService registrationUserService;

  public UserRegistrationController(RegistrationUserService registrationUserService) {
    this.registrationUserService = registrationUserService;
  }

  @GetMapping("/registration-page")
  public String showRegistrationPage(Model model) {
    model.addAttribute("newUser", new User());

    return "registration/user-registration";
  }

  @PostMapping("/registration")
  public String registrationUser(@ModelAttribute User user) {
    registrationUserService.addNewUser(user);

    return "index";
  }

}
