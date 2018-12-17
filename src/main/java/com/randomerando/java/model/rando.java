package com.randomerando.java.model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "randonnees")

public class rando {
    @JsonBackReference //évite la boucle infini en many to many
    @ManyToMany(mappedBy = "randonnees", fetch = FetchType.EAGER)
    private List<utilisateur> utilisateurs;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_r;

    private String nom_r;
    private String lieu_r;
    private String duree_r;
    private Integer note_r;
    private String niv_r;
    private Boolean adnim_r;
    private Integer dist_r;


    //Equals & hasCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        rando rando = (rando) o;
        return Objects.equals(id_r, rando.id_r) &&
                Objects.equals(nom_r, rando.nom_r) &&
                Objects.equals(lieu_r, rando.lieu_r) &&
                Objects.equals(duree_r, rando.duree_r) &&
                Objects.equals(niv_r, rando.niv_r) &&
                Objects.equals(adnim_r, rando.adnim_r) &&
                Objects.equals(dist_r, rando.dist_r);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_r, nom_r, lieu_r, duree_r, niv_r, adnim_r, dist_r);
    }

    //toString
    @Override
    public String toString() {
        return "rando{" +
                "id_r=" + id_r +
                ", nom_r='" + nom_r + '\'' +
                ", lieu_r='" + lieu_r + '\'' +
                ", duree_r='" + duree_r + '\'' +
                ", niv_r='" + niv_r + '\'' +
                ", adnim_r=" + adnim_r +
                ", dist_r=" + dist_r +
                '}';
    }

    //Constructeur
    public rando() {}

    public rando(String nom_r, String lieu_r, String duree_r, String niv_r, Boolean adnim_r, Integer dist_r) {
        this.nom_r = nom_r;
        this.lieu_r = lieu_r;
        this.duree_r = duree_r;
        this.niv_r = niv_r;
        this.adnim_r = adnim_r;
        this.dist_r = dist_r;
    }

    //Getters & Setters
    public Integer getId_r() {
        return id_r;
    }

    public void setId_r(Integer id_r) {
        this.id_r = id_r;
    }

    public String getNom_r() {
        return nom_r;
    }

    public void setNom_r(String nom_r) {
        this.nom_r = nom_r;
    }

    public String getLieu_r() {
        return lieu_r;
    }

    public void setLieu_r(String lieu_r) {
        this.lieu_r = lieu_r;
    }

    public String getDuree_r() {
        return duree_r;
    }

    public void setDuree_r(String duree_r) {
        this.duree_r = duree_r;
    }

    public String getNiv_r() {
        return niv_r;
    }

    public void setNiv_r(String niv_r) {
        this.niv_r = niv_r;
    }

    public Boolean getAdnim_r() {
        return adnim_r;
    }

    public void setAdnim_r(Boolean adnim_r) {
        this.adnim_r = adnim_r;
    }

    public Integer getDist_r() {
        return dist_r;
    }

    public void setDist_r(Integer dist_r) {
        this.dist_r = dist_r;
    }

    public List<utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

    public Integer getNote_r() {
        return note_r;
    }

    public void setNote_r(Integer note_r) {
        this.note_r = note_r;
    }

}
