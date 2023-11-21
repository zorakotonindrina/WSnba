package com.example.demo.Models;

public class DetailActions extends Motherobj{
   
    int idsaison;
    int idjoueur;
    int idactiontype;
    String nomaction;
    int sumpoints;
    int nbaction;
    
     public DetailActions() {
    }

    public DetailActions(int idsaison, int idjoueur, int idactiontype, String nomaction, int sumpoints, int nbaction) {
        this.idsaison = idsaison;
        this.idjoueur = idjoueur;
        this.idactiontype = idactiontype;
        this.nomaction = nomaction;
        this.sumpoints = sumpoints;
        this.nbaction = nbaction;
    }

    public int getIdsaison() {
        return idsaison;
    }

    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }

    public int getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    public int getIdactiontype() {
        return idactiontype;
    }

    public void setIdactiontype(int idactiontype) {
        this.idactiontype = idactiontype;
    }

    public String getNomaction() {
        return nomaction;
    }

    public void setNomaction(String nomaction) {
        this.nomaction = nomaction;
    }

    public int getSumpoints() {
        return sumpoints;
    }

    public void setSumpoints(int sumpoints) {
        this.sumpoints = sumpoints;
    }

    public int getNbaction() {
        return nbaction;
    }

    public void setNbaction(int nbaction) {
        this.nbaction = nbaction;
    }
}
