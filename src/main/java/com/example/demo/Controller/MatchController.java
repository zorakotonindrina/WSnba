package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Match;
import com.example.demo.Service.MatchService;


@RestController
@RequestMapping("/match")
public class MatchController{
    public final MatchService matchs;

    public MatchController(MatchService matchs) {
        this.matchs = matchs;
    }

      @GetMapping
    public List<Match> findAllMatch(){
        return matchs.findAllMatch();
    }

    @GetMapping("/{id}")
    public Optional<Match> findMatchById(@PathVariable("id") int id){
        return matchs.findById(id);
    }

    @PostMapping
    public Match CreateMatch(@RequestBody Match v){
        return matchs.CreateMatch(v);
    }

    @PutMapping
    public Match updatMatch(@RequestBody Match v){
        return matchs.updateMatch(v);
    }

    @DeleteMapping("/{id}")
    public void deleteMatch(@PathVariable("id") int id){
         matchs.deleteMatch(id);
    }

    
}
