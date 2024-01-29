package model;

import jakarta.persistence.*;

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
    @OneToOne
    @JoinColumn(name = "company_id")
    private Companies company;
    @OneToOne
    @JoinColumn(name = "candidatures_id")
    private Candidatures candidatures;
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
