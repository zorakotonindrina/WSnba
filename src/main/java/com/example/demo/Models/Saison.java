package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "saison")
public class Saison {


     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    int idsaison;
    String nomsaison;
    int anneedebut;
    int anneefin;



    
    public Saison(String nomsaison, int anneedebut, int anneefin) {
        this.nomsaison = nomsaison;
        this.anneedebut = anneedebut;
        this.anneefin = anneefin;
    }


    public Saison() {
    }

    
    public int getIdsaison() {
        return idsaison;
    }
    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }
    public String getNomsaison() {
        return nomsaison;
    }
    public void setNomsaison(String nomsaison) {
        this.nomsaison = nomsaison;
    }
    public int getAnneedebut() {
        return anneedebut;
    }
    public void setAnneedebut(int anneedebut) {
        this.anneedebut = anneedebut;
    }
    public int getAnneefin() {
        return anneefin;
    }
    public void setAnneefin(int anneefin) {
        this.anneefin = anneefin;
    }


    
}
