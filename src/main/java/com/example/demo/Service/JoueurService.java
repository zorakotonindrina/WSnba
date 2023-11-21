package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Joueur;

public interface JoueurService {
    List<Joueur> findAllJoueur();
    Optional<Joueur> findById(int id);
    Joueur CreateJoueur(Joueur j);
    Joueur updateJoueur(Joueur j);
    void deleteJoueur(int id);
}
