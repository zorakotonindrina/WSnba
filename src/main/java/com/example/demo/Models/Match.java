package com.example.demo.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "match")
public class Match {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    
    int idmatch;
    int idsaison;
    LocalDateTime datedebut;
    LocalDateTime datefin;
    int idequipe1;
    int idequipe2;
    int typematch;
    
    public Match(int idmatch, int idsaison, LocalDateTime datedebut, LocalDateTime datefin, int idequipe1,
            int idequipe2, int typematch) {
        this.idmatch = idmatch;
        this.idsaison = idsaison;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.idequipe1 = idequipe1;
        this.idequipe2 = idequipe2;
        this.typematch = typematch;
    }

    public Match(int idsaison, LocalDateTime datedebut, LocalDateTime datefin, int idequipe1, int idequipe2,
            int typematch) {
        this.idsaison = idsaison;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.idequipe1 = idequipe1;
        this.idequipe2 = idequipe2;
        this.typematch = typematch;
    }

    public Match() {
    }

    public int getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public int getIdsaison() {
        return idsaison;
    }

    public void setIdsaison(int idsaison) {
        this.idsaison = idsaison;
    }

    public LocalDateTime getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(LocalDateTime datedebut) {
        this.datedebut = datedebut;
    }

    public LocalDateTime getDatefin() {
        return datefin;
    }

    public void setDatefin(LocalDateTime datefin) {
        this.datefin = datefin;
    }

    public int getIdequipe1() {
        return idequipe1;
    }

    public void setIdequipe1(int idequipe1) {
        this.idequipe1 = idequipe1;
    }

    public int getIdequipe2() {
        return idequipe2;
    }

    public void setIdequipe2(int idequipe2) {
        this.idequipe2 = idequipe2;
    }

    public int getTypematch() {
        return typematch;
    }

    public void setTypematch(int typematch) {
        this.typematch = typematch;
    }


}
