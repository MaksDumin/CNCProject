package com.example.CNCProject.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "workcenter")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id")
    private long id;

    @Column(name = "title", columnDefinition = "text")
    private String title;

    @Column(name = "code")
    private String code;

    @Column(name = "plm")
    private String plm;
}

