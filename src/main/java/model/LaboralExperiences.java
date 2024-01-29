package model;

import jakarta.persistence.*;

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
    @OneToOne
    @JoinColumn(name = "company_id")
    private Companies company;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public LaboralExperiences() {
    }

    public LaboralExperiences(int id, String jobTittle, String location, boolean current, String description, int initDate, int endDate) {
        this.id = id;
        this.jobTittle = jobTittle;
        this.location = location;
        this.current = current;
        this.description = description;
        this.initDate = initDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobTittle() {
        return jobTittle;
    }

    public void setJobTittle(String jobTittle) {
        this.jobTittle = jobTittle;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isCurrent() {
        return current;
    }

    public void setCurrent(boolean current) {
        this.current = current;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInitDate() {
        return initDate;
    }

    public void setInitDate(int initDate) {
        this.initDate = initDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }
}
