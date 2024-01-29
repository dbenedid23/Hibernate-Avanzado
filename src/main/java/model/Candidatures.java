package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Candidature")
public class Candidatures {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre", nullable = false, unique = true)
    String name;
    @Column(name = "Descripción")
    String description;
    @Column(name = "Estado")
    int Status;
    @Column(name = "CoverLetter")
    String coverLetterPath;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @OneToOne(mappedBy = "company")
    List<JobOffer> jobOffers;
    public Candidatures() {
    }

    public Candidatures(int id, String name, String description, int status, String coverLetterPath) {
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
