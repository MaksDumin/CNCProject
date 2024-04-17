package com.example.CNCProject.services;

import com.example.CNCProject.models.WorkCenter;
import com.example.CNCProject.repository.WorkCenterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class EditWorkCenterServices {
    private final WorkCenterRepository workCenterRepository;


    public List<WorkCenter> listWorkCenters(String center) {
      //  List<WorkCenter> workRepository = workCenterRepository.findAll();
        if (center != null) return workCenterRepository.findByCenter(center);
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
