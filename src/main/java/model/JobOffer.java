package model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "titulo", nullable = false)
    String title;
    @Column(name = "nombre")
    int maxSalary;
    @Column(name = "nombre")
    String details;
    @Column(name = "nombre", nullable = false)
    boolean open;
    @Column(name = "nombre", nullable = false)
    String location;
    @Column(name = "nombre")
    int requiredCandidates;
    @Column(name = "nombre")
    int minSalary;
}
