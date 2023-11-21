package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Possession;

@Repository
public interface PossessionRepository extends JpaRepository<Possession,Integer>{
    
}