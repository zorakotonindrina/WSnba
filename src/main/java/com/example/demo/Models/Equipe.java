package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipe")
public class Equipe {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int idequipe;
    String nomequipe;
    int genre;


    public Equipe(String nomequipe, int genre) {
        this.nomequipe = nomequipe;
        this.genre = genre;
    }


    public Equipe() {
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


    public int getGenre() {
        return genre;
    }


    public void setGenre(int genre) {
        this.genre = genre;
    }

    

    
}
