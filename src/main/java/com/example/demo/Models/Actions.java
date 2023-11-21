package com.example.demo.Models;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actions")
public class Actions {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idaction;
    int idmatch;
    int idjoueur;
    int idactiontype;
    Time temps;
    int statu;

     public Actions(int idmatch, int idjoueur, int idactiontype, Time temps, int statu) {
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.idactiontype = idactiontype;
        this.temps = temps;
        this.statu = statu;
    }



    public Actions(int idaction, int idmatch, int idjoueur, int idactiontype, Time temps, int statu) {
        this.idaction = idaction;
        this.idmatch = idmatch;
        this.idjoueur = idjoueur;
        this.idactiontype = idactiontype;
        this.temps = temps;
        this.statu = statu;
    }



    public Actions() {
    }

    

    public int getIdaction() {
        return idaction;
    }

    public void setIdaction(int idaction) {
        this.idaction = idaction;
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

    public int getIdactiontype() {
        return idactiontype;
    }

    public void setIdactiontype(int idactiontype) {
        this.idactiontype = idactiontype;
    }

    public Time getTemps() {
        return temps;
    }

    public void setTemps(Time temps) {
        this.temps = temps;
    }

    public int getStatu() {
        return statu;
    }

    public void setStatu(int statu) {
        this.statu = statu;
    }

    



    
}
