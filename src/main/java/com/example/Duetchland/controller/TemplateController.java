package com.example.Duetchland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class TemplateController {
    

    @GetMapping("/")
    public String dashboard() {
        return "index";
    }
    
     
    
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/about-us")
    public String aboutUs() {
        return "aboutUs";
    }

    
   

    
}  