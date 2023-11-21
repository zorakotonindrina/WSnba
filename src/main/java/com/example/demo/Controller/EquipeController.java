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

import com.example.demo.Models.Equipe;
import com.example.demo.Service.EquipeService;


@RestController
@RequestMapping("/equipe")
public class EquipeController{
    public final EquipeService equip;

    public EquipeController(EquipeService equip) {
        this.equip = equip;
    }

      @GetMapping
    public List<Equipe> findAllEquipe(){
        return equip.findAllEquipe();
    }

    @GetMapping("/{id}")
    public Optional<Equipe> findEquipeById(@PathVariable("id") int id){
        return equip.findById(id);
    }

    @PostMapping
    public Equipe CreateEquipe(@RequestBody Equipe v){
        return equip.CreateEquipe(v);
    }

    @PutMapping
    public Equipe updatEquipe(@RequestBody Equipe v){
        return equip.updateEquipe(v);
    }

    @DeleteMapping("/{id}")
    public void deleteEquipe(@PathVariable("id") int id){
         equip.deleteEquipe(id);
    }

    
}
