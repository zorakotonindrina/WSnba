package com.example.demo.Models;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "possession")
public class Possession {
  
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    int idpossession;
    int idmatch;
    int idjoueur;
    Time tempsdebut;
    Time tempsfin;

      public Possession(int idpossession, int idmatch, int idjoueur, Time tempsdebut, Time tempsfin) {
        this.idpossession = idpossession;
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.tempsdebut = tempsdebut;
        this.tempsfin = tempsfin;
    }

    public Possession(int idmatch, int idjoueur, Time tempsdebut, Time tempsfin) {
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.tempsdebut = tempsdebut;
        this.tempsfin = tempsfin;
    }

    public Possession() {
    }

    public int getIdpossession() {
        return idpossession;
    }

    public void setIdpossession(int idpossession) {
        this.idpossession = idpossession;
    }

    public int getIdmatch() {
        return idmatch;
    }

    public void setIdmatch(int idmatch) {
        this.idmatch = idmatch;
    }

    public int getIdjoueur() {
        return idjoueur;
    }

    public void setIdjoueur(int idjoueur) {
        this.idjoueur = idjoueur;
    }

    public Time getTempsdebut() {
        return tempsdebut;
    }

    public void setTempsdebut(Time tempsdebut) {
        this.tempsdebut = tempsdebut;
    }

    public Time getTempsfin() {
        return tempsfin;
    }

    public void setTempsfin(Time tempsfin) {
        this.tempsfin = tempsfin;
    }


    
}
