package com.example.CNCProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    @GetMapping ("/")
    public String machines() {
        return "machines";
    }
}
