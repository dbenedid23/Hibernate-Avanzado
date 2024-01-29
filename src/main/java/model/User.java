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
    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    private List<Skills> skills;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "descripcion")
    String description;

    @Column(name = "telefono", nullable = false)
    int telephone;

    @Column(name = "e-mail", nullable = false)
    String mail;
    @OneToMany(mappedBy = "user")
    List<AcademicInfo> academicInfos;
    @OneToMany(mappedBy = "user")
    List<Candidatures> candidatures;
    @OneToMany(mappedBy = "user")
    List<LaboralExperiences> laboralExperiences;
    public User() {
    }

    public User(int id, String nombre, String description, int telephone, String mail) {
        this.id = id;
        this.nombre = nombre;
        this.description = description;
        this.telephone = telephone;
        this.mail = mail;
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
