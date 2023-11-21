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

import com.example.demo.Models.Joueur;
import com.example.demo.Service.JoueurService;


@RestController
@RequestMapping("/joueur")
public class JoueurController{
    public final JoueurService j;

    public JoueurController(JoueurService j) {
        this.j = j;
    }

      @GetMapping
    public List<Joueur> findAllJoueur(){
        return j.findAllJoueur();
    }

    @GetMapping("/{id}")
    public Optional<Joueur> findJoueurById(@PathVariable("id") int id){
        return j.findById(id);
    }

    @PostMapping
    public Joueur CreateJoueur(@RequestBody Joueur v){
        return j.CreateJoueur(v);
    }

    @PutMapping
    public Joueur updatJoueur(@RequestBody Joueur v){
        return j.updateJoueur(v);
    }

    @DeleteMapping("/{id}")
    public void deleteJoueur(@PathVariable("id") int id){
         j.deleteJoueur(id);
    }

    
}
