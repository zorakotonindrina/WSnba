package com.example.demo.Models;

import java.sql.Time;

public class DetailMatchs extends Motherobj{

    int idsaison;
    int idjouer;
    String nomJoueur;
    String photo;
    int idequipe;
    String nomequipe;
    int nbmatch;
    int matchjoue;
    String timetotal;
    
    public String getTimetotal() {
        return timetotal;
    }

    public void setTimetotal(String timetotal) {
        this.timetotal = timetotal;
    }

    public DetailMatchs(int idsaison, int idjouer, String nomJoueur, String photo, int idequipe, String nomequipe,
            int nbmatch, int matchjoue) {
        this.idsaison = idsaison;
        this.idjouer = idjouer;
        this.nomJoueur = nomJoueur;
        this.photo = photo;
        this.idequipe = idequipe;
        this.nomequipe = nomequipe;
        this.nbmatch = nbmatch;
        this.matchjoue = matchjoue;
    }

    public DetailMatchs() {
    }

    public int getIdsaison() {
        return idsaison;
    }

    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }

    public int getIdjouer() {
        return idjouer;
    }

    public void setIdjouer(int idjouer) {
        this.idjouer = idjouer;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getIdequipe() {
        return idequipe;
    }

    public void setIdequipe(int idequipe) {
        this.idequipe = idequipe;
    }

    public String getNomequipe() {
        return nomequipe;
    }

    public void setNomequipe(String nomequipe) {
        this.nomequipe = nomequipe;
    }

    public int getNbmatch() {
        return nbmatch;
    }

    public void setNbmatch(int nbmatch) {
        this.nbmatch = nbmatch;
    }

    public int getMatchjoue() {
        return matchjoue;
    }

    public void setMatchjoue(int matchjoue) {
        this.matchjoue = matchjoue;
    }


    

}
