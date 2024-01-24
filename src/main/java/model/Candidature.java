package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Candidature")
public class Candidature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", nullable = false, unique = true)
    private String name;
    @Column(name = "Descripción")
    private String description;
    @Column(name = "Estado")
    private int Status;
    @Column(name = "CoverLetter")
    private String coverLetterPath;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "jobOffer_id")
    private List<JobOffer> jobOffers;

    public Candidature() {
    }

    public Candidature(int id, String name, String description, int status, String coverLetterPath) {
        this.id = id;
        this.name = name;
        this.description = description;
        Status = status;
        this.coverLetterPath = coverLetterPath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public String getCoverLetterPath() {
        return coverLetterPath;
    }

    public void setCoverLetterPath(String coverLetterPath) {
        this.coverLetterPath = coverLetterPath;
    }
}
