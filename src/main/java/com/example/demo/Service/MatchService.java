package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Match;

public interface MatchService {
    List<Match> findAllMatch();
    Optional<Match> findById(int id);
    Match CreateMatch(Match m);
    Match updateMatch(Match m);
    void deleteMatch(int id);
}
