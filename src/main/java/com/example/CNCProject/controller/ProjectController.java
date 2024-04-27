package com.example.CNCProject.controller;

import com.example.CNCProject.models.WorkCenter;
import com.example.CNCProject.services.EditWorkCenterServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProjectController {
    private final EditWorkCenterServices editWorkCenterServices;

    public ProjectController(EditWorkCenterServices editWorkCenterServices) {
        this.editWorkCenterServices = editWorkCenterServices;
    }

    @GetMapping ("/")
    public String machines(@RequestParam(name = "center", required = false) String center, Model model) {
        model.addAttribute("machines", editWorkCenterServices.listWorkCenters(center));
        return "machines";
    }
    @GetMapping("/WorkCenter/{id}")
    public String infoWorkCenter(@PathVariable Long id, Model model) {
        model.addAttribute("machines", editWorkCenterServices.getWorkCenterById(id));
        return "infoworkcenter";
    }
    @PostMapping("/WorkCenter/create")
    public String createWorkCenter(WorkCenter workCenter) {
        editWorkCenterServices.saveWorkCenter(workCenter);
        return "index";
    }
    @PostMapping("WorkCenter/delete/{id}")
    public String deleteWorkCenter(@PathVariable Long id) {
        editWorkCenterServices.deleteWorkCenter(id);
        return "redirect:/";
    }
}
