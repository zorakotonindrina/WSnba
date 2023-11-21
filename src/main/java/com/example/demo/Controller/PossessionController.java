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

import com.example.demo.Models.Possession;
import com.example.demo.Service.PossessionService;


@RestController
@RequestMapping("/possession")
public class PossessionController{
    public final PossessionService poss;

    public PossessionController(PossessionService poss) {
        this.poss = poss;
    }

      @GetMapping
    public List<Possession> findAllPossession(){
        return poss.findAllPossession();
    }

    @GetMapping("/{id}")
    public Optional<Possession> findPossessionById(@PathVariable("id") int id){
        return poss.findById(id);
    }

    @PostMapping
    public Possession CreatePossession(@RequestBody Possession v){
        return poss.CreatePossession(v);
    }

    @PutMapping
    public Possession updatPossession(@RequestBody Possession v){
        return poss.updatePossession(v);
    }

    @DeleteMapping("/{id}")
    public void deletePossession(@PathVariable("id") int id){
         poss.deletePossession(id);
    }

    
}
