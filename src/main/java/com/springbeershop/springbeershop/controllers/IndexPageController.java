package com.springbeershop.springbeershop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexPageController {

  @GetMapping(path = "/index")
  public String goToIndexPage() {
    return "index";
  }
}
