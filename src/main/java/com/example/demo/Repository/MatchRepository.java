package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match,Integer>{
    
}
