package model;

import jakarta.persistence.*;

import java.util.List;
@Entity
@Table(name = "Institucion")
public class Institutions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "nombre" , nullable = false, unique = true)
    String name;
    @OneToMany(mappedBy = "institution")
    List<AcademicInfo> academicInfos;
    @OneToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})

    private List<AcademicInfo> aca;
    public Institutions() {
    }

    public Institutions(int id, String name) {
        this.id = id;
        this.name = name;
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


}
