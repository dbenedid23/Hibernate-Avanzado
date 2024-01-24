package model;

import jakarta.persistence.*;
import org.checkerframework.checker.nullness.qual.Nullable;

@Entity
@Table(name = "InfoAcademica")
public class AcademicInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "titulo", nullable = false)
    String tittle;
    @Column(name = "Fecha Inicial")
    int initialDate;
    @Column(name = "Fecha fin")
    int endDate;
    @Column(name = "current")
    String current;
    @Column(name = "mean_score")
    String meanScore;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    public AcademicInfo(int id, String tittle, int initialDate, int endDate, String current, String meanScore) {
        this.id = id;
        this.tittle = tittle;
        this.initialDate = initialDate;
        this.endDate = endDate;
        this.current = current;
        this.meanScore = meanScore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(int initialDate) {
        this.initialDate = initialDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getMeanScore() {
        return meanScore;
    }

    public void setMeanScore(String meanScore) {
        this.meanScore = meanScore;
    }

    public AcademicInfo() {
    }



}
