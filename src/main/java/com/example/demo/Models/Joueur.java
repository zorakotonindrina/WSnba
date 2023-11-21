package com.example.demo.Models;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur")
public class Joueur {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)



    int idjoueur ;
    String nomjoueur;
    String photo;
    Date datenaissance;
    int genre;
    int idequipe;
    
    public Joueur(int idjoueur, String nomjoueur, String photo, Date datenaissance, int genre, int idequipe) {
        this.idjoueur = idjoueur;
        this.nomjoueur = nomjoueur;
        this.photo = photo;
        this.datenaissance = datenaissance;
        this.genre = genre;
        this.idequipe = idequipe;
    }
    public Joueur(String nomjoueur, String photo, Date datenaissance, int genre, int idequipe) {
        this.nomjoueur = nomjoueur;
        this.photo = photo;
        this.datenaissance = datenaissance;
        this.genre = genre;
        this.idequipe = idequipe;
    }
    public Joueur() {
    }
    public int getIdjoueur() {
        return idjoueur;
    }
    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }
    public String getNomjoueur() {
        return nomjoueur;
    }
    public void setNomjoueur(String nomjoueur) {
        this.nomjoueur = nomjoueur;
    }
    public String getPhoto() {
        return photo;
    }
    public void setPhoto(String photo) {
        this.photo = photo;
    }
    public Date getDatenaissance() {
        return datenaissance;
    }
    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }
    public int getGenre() {
        return genre;
    }
    public void setGenre(int genre) {
        this.genre = genre;
    }
    public int getIdequipe() {
        return idequipe;
    }
    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }


}
