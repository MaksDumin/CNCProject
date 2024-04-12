package com.example.CNCProject.services;

import com.example.CNCProject.models.WorkCenter;
import com.example.CNCProject.models.WorkCenter1;
import com.example.CNCProject.repository.WorkCenterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EditWorkCenter {
    private final WorkCenterRepository workCenterRepository;


    public List<WorkCenter> listWorkCenters(String title) {
      //  List<WorkCenter> workRepository = workCenterRepository.findAll();
        if (title != null) return workCenterRepository.findByTitle(title);
        return workCenterRepository.findAll();
    }

    public void saveWorkCenter(WorkCenter workCenter) {
        log.info("Saving new {}", workCenter);
        workCenterRepository.save(workCenter);
    }

    public void deleteWorkCenter(Long id) {
        workCenterRepository.deleteById(id);
    }

    public WorkCenter getWorkCenterById(Long id) {
           return workCenterRepository.findById(id).orElse(null);
        }
    }
