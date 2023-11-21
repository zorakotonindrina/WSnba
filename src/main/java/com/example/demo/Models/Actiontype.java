package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "actiontype")
public class Actiontype {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    int idactiontype;
    String nomaction;
    int points;

    public Actiontype(int idactiontype, String nomaction, int points) {
        this.idactiontype = idactiontype;
        this.nomaction = nomaction;
        this.points = points;
    }

    public Actiontype(String nomaction, int points) {
        this.nomaction = nomaction;
        this.points = points;
    }

    public Actiontype() {
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    

    
}
