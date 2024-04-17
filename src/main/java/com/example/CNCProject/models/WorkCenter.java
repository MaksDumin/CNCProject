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

    @Column(name = "center", columnDefinition = "text")
    private String center;

    @Column(name = "error")
    private String error;

    @Column(name = "data")
    private String data;
}

