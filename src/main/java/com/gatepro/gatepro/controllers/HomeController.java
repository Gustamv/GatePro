package com.gatepro.gatepro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    // @GetMapping("/")
    // public ModelAndView home() {
    // var modelAndView = new ModelAndView("base");
    // return modelAndView;
    // }
    @GetMapping("/")
    public ModelAndView base() {
        var modelAndView = new ModelAndView("base");
        return modelAndView;
    }

}
