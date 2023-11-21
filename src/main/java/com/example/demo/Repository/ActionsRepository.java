package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Actions;

@Repository
public interface ActionsRepository extends JpaRepository<Actions,Integer>{
    
}