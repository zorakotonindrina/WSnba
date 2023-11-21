package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Equipe;

public interface EquipeService {
    List<Equipe> findAllEquipe();
    Optional<Equipe> findById(int id);
    Equipe CreateEquipe(Equipe equip);
    Equipe updateEquipe(Equipe equip);
    void deleteEquipe(int id);
}
