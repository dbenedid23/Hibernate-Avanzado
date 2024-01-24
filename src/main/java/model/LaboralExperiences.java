package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class LaboralExperiences {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "Titulo_trabajo", nullable = false)
    String jobTittle;
    @Column(name = "localización")
    String location;
    @Column(name = "Titulo_trabajo")
    boolean current;
    @Column(name = "Titulo_trabajo")
    String description;
    @Column(name = "Titulo_trabajo")
    int initDate;
    @Column(name = "Titulo_trabajo")
    int endDate;
}
