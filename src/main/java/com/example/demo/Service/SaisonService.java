package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Saison;

public interface SaisonService {
    List<Saison> findAllSaison();
    Optional<Saison> findById(int id);
    Saison CreateSaison(Saison sais);
    Saison updateSaison(Saison sais);
    void deleteSaison(int id);
}