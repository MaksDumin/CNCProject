package com.example.CNCProject.services;

import com.example.CNCProject.models.WorkCenter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EditWorkCenter {
    private List<WorkCenter> workCenters = new ArrayList<>();
    private long ID = 0;

    {
        workCenters.add(new WorkCenter(++ID, "Продольно-фрезерный обрабатывающий центр c ЧПУ(LBV-2219)", "3.1.5", "Цех №3"));
        workCenters.add(new WorkCenter(++ID, "Токарная группа с ЧПУ", "3.1.2", "Цех №3"));
        workCenters.add(new WorkCenter(++ID, "Вертикальный обрабатывающий центр с ЧПУ, модель: ММ-800", "3.1.1", "Цех №3"));
        workCenters.add(new WorkCenter(++ID, "Продольно фрезерный обрабатывающий центр с ЧПУ(VF-4000,VB-3016)", "3.1.4", "Цех №3"));
        workCenters.add(new WorkCenter(++ID, "Горизонтально-расточной 2А656Ф4", "3.1.3", "Цех №3"));
        workCenters.add(new WorkCenter(++ID, "Расточной 2620Г", "3.2.1", "Цех №3"));
    }

    public List<WorkCenter> listWorkCenters() {
        return workCenters;
    }

    public void saveWorkCenter(WorkCenter workCenter) {
        workCenter.setId(++ID);
        workCenters.add(workCenter);
    }

    public void deleteWorkCenter(Long id) {
        workCenters.removeIf(workCenter -> workCenter.getId() == id);
    }

    public WorkCenter getWorkCenterById(Long id) {
            for (WorkCenter workCenter1 : workCenters) {
                if (workCenter1.getId() == (id)) return workCenter1;
            }
            return null;
        }
    }
