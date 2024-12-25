package com.example.Duetchland.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



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
    @GetMapping("/german-language-courses")
    public String germanLanguageCourses() {
        return "germanLanguageCourses";
    }
    @GetMapping("/course-highlights")
    public String coursehighlights() {
        return "coursehighlights";
    }
    @GetMapping("/learn-german-online")
    public String learnGermanOnline() {
        return "learnGermanOnline";
    }
    @GetMapping("/osd-exam")
    public String osdExam() {
        return "osdExam";
    }
    @GetMapping("/ausbildung-program")
    public String ausbildungProgram() {
        return "ausbildungProgram";
    }
    @GetMapping("/faqs-vocational-training")
    public String faqsVocationalTraining() {
        return "faqsVocationalTraining";
    }
    @GetMapping("/why-study-in-germany")
    public String whyStudyInGermany() {
        return "whyStudyInGermany";
    }
    @GetMapping("/bachelor-courses-in-germany")
    public String bachelorCoursesInGermany() {
        return "bachelorCoursesInGermany";
    }
    @GetMapping("/masters-in-germany")
    public String masterInGermany() {
        return "masterInGermany";
    }
    @GetMapping("/studienkolleg-in-germany")
    public String studienkollegInGermany() {
        return "studienkollegInGermany";
    }
    @GetMapping("/blogs")
    public String blogs() {
        return "blogs";
    }
    @GetMapping("/feed")
    public String feed() {
        return "feed";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
    @GetMapping("/our-services")
    public String ourServices() {
        return "ourServices";
    }
    

    
}  