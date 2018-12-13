package com.randomerando.java.model;
import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "utilisateur")

public class utilisateur {

    @ManyToMany(mappedBy = "utilisateurs")
    private List<rando> randonnees;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer Id_Utilisateur;

    private String Pseudo_Utilisateur;
    private String Nom_Utilisateur;
    private String Prenom_Utilisateur;
    private String Email_Utilisateur;
    private Integer Age_Utilisateur;
    private Boolean Enfants_Utilisateur;
    private Date date_i;
    private Boolean admin_i;
    private Boolean modo_i;
    private Integer Mot_De_Passe_Utilisateur;


    //Equals & hascode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        utilisateur that = (utilisateur) o;
        return Id_Utilisateur.equals(that.Id_Utilisateur) &&
                Pseudo_Utilisateur.equals(that.Pseudo_Utilisateur) &&
                Nom_Utilisateur.equals(that.Nom_Utilisateur) &&
                Prenom_Utilisateur.equals(that.Prenom_Utilisateur) &&
                Email_Utilisateur.equals(that.Email_Utilisateur) &&
                Age_Utilisateur.equals(that.Age_Utilisateur) &&
                Enfants_Utilisateur.equals(that.Enfants_Utilisateur) &&
                date_i.equals(that.date_i) &&
                admin_i.equals(that.admin_i) &&
                modo_i.equals(that.modo_i) &&
                Mot_De_Passe_Utilisateur.equals(that.Mot_De_Passe_Utilisateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id_Utilisateur, Pseudo_Utilisateur, Nom_Utilisateur, Prenom_Utilisateur, Email_Utilisateur, Age_Utilisateur, Enfants_Utilisateur, date_i, admin_i, modo_i, Mot_De_Passe_Utilisateur);
    }

    //toString
    @Override
    public String toString() {
        return "utilisateur{" +
                "Id_Utilisateur=" + Id_Utilisateur +
                ", Pseudo_Utilisateur='" + Pseudo_Utilisateur + '\'' +
                ", Nom_Utilisateur='" + Nom_Utilisateur + '\'' +
                ", Prenom_Utilisateur='" + Prenom_Utilisateur + '\'' +
                ", Email_Utilisateur='" + Email_Utilisateur + '\'' +
                ", Age_Utilisateur=" + Age_Utilisateur +
                ", Enfants_Utilisateur=" + Enfants_Utilisateur +
                ", date_i=" + date_i +
                ", admin_i=" + admin_i +
                ", modo_i=" + modo_i +
                ", Mot_De_Passe_Utilisateur=" + Mot_De_Passe_Utilisateur +
                '}';
    }

    //Constructeurs
    public utilisateur() {}

    public utilisateur(String pseudo_Utilisateur, String nom_Utilisateur, String prenom_Utilisateur, String email_Utilisateur, Integer age_Utilisateur, Boolean enfants_Utilisateur, Date date_i, Boolean admin_i, Boolean modo_i, Integer mot_De_Passe_Utilisateur) {
        Pseudo_Utilisateur = pseudo_Utilisateur;
        Nom_Utilisateur = nom_Utilisateur;
        Prenom_Utilisateur = prenom_Utilisateur;
        Email_Utilisateur = email_Utilisateur;
        Age_Utilisateur = age_Utilisateur;
        Enfants_Utilisateur = enfants_Utilisateur;
        this.date_i = date_i;
        this.admin_i = admin_i;
        this.modo_i = modo_i;
        Mot_De_Passe_Utilisateur = mot_De_Passe_Utilisateur;
    }

    //Getters & Setters
    public Integer getId_Utilisateur() {
        return Id_Utilisateur;
    }

    public void setId_Utilisateur(Integer id_Utilisateur) {
        Id_Utilisateur = id_Utilisateur;
    }

    public String getPseudo_Utilisateur() {
        return Pseudo_Utilisateur;
    }

    public void setPseudo_Utilisateur(String pseudo_Utilisateur) {
        Pseudo_Utilisateur = pseudo_Utilisateur;
    }

    public String getNom_Utilisateur() {
        return Nom_Utilisateur;
    }

    public void setNom_Utilisateur(String nom_Utilisateur) {
        Nom_Utilisateur = nom_Utilisateur;
    }

    public String getPrenom_Utilisateur() {
        return Prenom_Utilisateur;
    }

    public void setPrenom_Utilisateur(String prenom_Utilisateur) {
        Prenom_Utilisateur = prenom_Utilisateur;
    }

    public String getEmail_Utilisateur() {
        return Email_Utilisateur;
    }

    public void setEmail_Utilisateur(String email_Utilisateur) {
        Email_Utilisateur = email_Utilisateur;
    }

    public Integer getAge_Utilisateur() {
        return Age_Utilisateur;
    }

    public void setAge_Utilisateur(Integer age_Utilisateur) {
        Age_Utilisateur = age_Utilisateur;
    }

    public Boolean getEnfants_Utilisateur() {
        return Enfants_Utilisateur;
    }

    public void setEnfants_Utilisateur(Boolean enfants_Utilisateur) {
        Enfants_Utilisateur = enfants_Utilisateur;
    }

    public Date getDate_i() {
        return date_i;
    }

    public void setDate_i(Date date_i) {
        this.date_i = date_i;
    }

    public Boolean getAdmin_i() {
        return admin_i;
    }

    public void setAdmin_i(Boolean admin_i) {
        this.admin_i = admin_i;
    }

    public Boolean getModo_i() {
        return modo_i;
    }

    public void setModo_i(Boolean modo_i) {
        this.modo_i = modo_i;
    }

    public Integer getMot_De_Passe_Utilisateur() {
        return Mot_De_Passe_Utilisateur;
    }

    public void setMot_De_Passe_Utilisateur(Integer mot_De_Passe_Utilisateur) {
        Mot_De_Passe_Utilisateur = mot_De_Passe_Utilisateur;
    }
}
