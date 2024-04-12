package com.example.CNCProject.controller;

import com.example.CNCProject.models.WorkCenter;
import com.example.CNCProject.models.WorkCenter1;
import com.example.CNCProject.services.EditWorkCenter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProjectController {
    private final EditWorkCenter editWorkCenter;

    public ProjectController(EditWorkCenter editWorkCenter) {
        this.editWorkCenter = editWorkCenter;
    }

    @GetMapping ("/")
    public String machines(@RequestParam(name = "title", required = false) String title, Model model) {
        model.addAttribute("machines",editWorkCenter.listWorkCenters(title));
        return "machines";
    }
    @GetMapping("/WorkCenter/{id}")
    public String infoWorkCenter(@PathVariable Long id, Model model) {
        model.addAttribute("machines", editWorkCenter.getWorkCenterById(id));
        return "infoworkcenter";
    }
    @PostMapping("/WorkCenter/create")
    public String createWorkCenter(WorkCenter workCenter) {
        editWorkCenter.saveWorkCenter(workCenter);
        return "redirect:/";
    }
    @PostMapping("WorkCenter/delete/{id}")
    public String deleteWorkCenter(@PathVariable Long id) {
        editWorkCenter.deleteWorkCenter(id);
        return "redirect:/";
    }

}
