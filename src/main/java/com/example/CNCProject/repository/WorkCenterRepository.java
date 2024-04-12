package com.example.CNCProject.repository;

import com.example.CNCProject.models.WorkCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WorkCenterRepository extends JpaRepository<WorkCenter, Long> {
    List<WorkCenter> findByTitle(String title);
}
