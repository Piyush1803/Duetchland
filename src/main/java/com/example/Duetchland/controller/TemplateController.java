package com.example.Duetchland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TemplateController {
    

    @GetMapping("/")
    public String dashboard() {
        return "index";
    }
    
    @GetMapping("/why-duetchland")
    public String whyDuetchland() {
        return "whyDuetchland";
    }

    @GetMapping("/why-german")
    public String whyGerman() {
        return "whyGerman";
    }

    @GetMapping("/benefits-of-learing-german")
    public String benefitsOfLearnigGerman() {
        return "benefitsOfLearningGerman";
    }
}  