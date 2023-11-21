package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Possession;

public interface PossessionService {
    List<Possession> findAllPossession();
    Optional<Possession> findById(int id);
    Possession CreatePossession(Possession poss);
    Possession updatePossession(Possession poss);
    void deletePossession(int id);
}
