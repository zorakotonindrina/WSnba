package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Actiontype;

@Repository
public interface ActiontypeRepository extends JpaRepository<Actiontype,Integer>{
    
}
