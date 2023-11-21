package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Joueur;

@Repository
public interface JoueurRepository extends JpaRepository<Joueur,Integer>{
    
}

