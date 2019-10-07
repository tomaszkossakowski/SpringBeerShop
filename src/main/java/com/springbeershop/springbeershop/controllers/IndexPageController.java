package com.springbeershop.springbeershop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IndexPageController
{

    @GetMapping(path = "/index")
    public String goToIndexPage()
    {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage()
    {
        return "login";
    }

    @RequestMapping("/logout-success")
    public String logoutPage()
    {
        return "logout";
    }
}
