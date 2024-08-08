package com.gatepro.gatepro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // @GetMapping("/")
    // public ModelAndView home() {
    // var modelAndView = new ModelAndView("base");
    // return modelAndView;
    // }
    @GetMapping("/")
    public String home() {
        return "home";
    }

}
