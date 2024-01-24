package model;

import jakarta.persistence.*;

import java.util.List;

public class JobOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "titulo", nullable = false)
    private String title;
    @Column(name = "nombre")
    private int maxSalary;
    @Column(name = "nombre")
    private String details;
    @Column(name = "nombre", nullable = false)
    private boolean open;
    @Column(name = "nombre", nullable = false)
    private String location;
    @Column(name = "nombre")
    private int requiredCandidates;
    @Column(name = "nombre")
    private int minSalary;
    @OneToOne
    @JoinColumn(name = "company_id")
    private Companies company;
    @OneToOne(mappedBy = "jobOffer")
    private List<JobOffer> jobOffers;
    public JobOffer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRequiredCandidates() {
        return requiredCandidates;
    }

    public void setRequiredCandidates(int requiredCandidates) {
        this.requiredCandidates = requiredCandidates;
    }

    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public JobOffer(int id, String title, int maxSalary, String details, boolean open, String location, int requiredCandidates, int minSalary) {
        this.id = id;
        this.title = title;
        this.maxSalary = maxSalary;
        this.details = details;
        this.open = open;
        this.location = location;
        this.requiredCandidates = requiredCandidates;
        this.minSalary = minSalary;
    }


}
