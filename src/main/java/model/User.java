/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.persistence.*;

import java.util.List;

/**
 *
 * @author dev
 */

@Entity
@Table(name = "users")
public class User {
    @ManyToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private List<Skill> skills;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre", nullable = false, unique = true)
    private String nombre;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "telefono", nullable = false)
    private int telephone;

    @Column(name = "e-mail", nullable = false)
    private String mail;
    @OneToMany(mappedBy = "user")
    private List<AcademicInfo> academicInfos;
    @OneToMany(mappedBy = "user")
    private List<Candidature> candidatures;
    @OneToMany(mappedBy = "user")
    private List<LaboralExperience> laboralExperiences;
    public User() {
    }

    public User(int id, String nombre, String description, int telephone, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.telephone = telephone;
        this.mail = mail;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<AcademicInfo> getAcademicInfos() {
        return academicInfos;
    }

    public void setAcademicInfos(List<AcademicInfo> academicInfos) {
        this.academicInfos = academicInfos;
    }

    public List<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidatures) {
        this.candidatures = candidatures;
    }

    public List<LaboralExperience> getLaboralExperiences() {
        return laboralExperiences;
    }

    public void setLaboralExperiences(List<LaboralExperience> laboralExperiences) {
        this.laboralExperiences = laboralExperiences;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }


}
