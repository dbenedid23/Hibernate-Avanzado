package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Compañia")
public class Companies {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "nombre", nullable = false, unique = true)
    String name;
    @Column(name = "descripcion")
    String description;
    @OneToMany (mappedBy = "company")
    List<JobOffer>jobOffers;
    @OneToMany (mappedBy = "company")
    List<LaboralExperiences> laboralExperiences;

    public Companies() {
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

    public Companies(int id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }


}
