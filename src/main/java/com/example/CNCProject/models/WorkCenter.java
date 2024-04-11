package com.example.CNCProject.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkCenter {
    private long id;
    private String title;
    private String code;
    private String plm;
}

