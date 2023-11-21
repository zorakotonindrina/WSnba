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

import com.example.demo.Models.Saison;
import com.example.demo.Service.SaisonService;


@RestController
@RequestMapping("/saison")
public class SaisonController{
    public final SaisonService sais;

    public SaisonController(SaisonService sais) {
        this.sais = sais;
    }

      @GetMapping
    public List<Saison> findAllSaison(){
        return sais.findAllSaison();
    }

    @GetMapping("/{id}")
    public Optional<Saison> findSaisonById(@PathVariable("id") int id){
        return sais.findById(id);
    }

    @PostMapping
    public Saison CreateSaison(@RequestBody Saison v){
        return sais.CreateSaison(v);
    }

    @PutMapping
    public Saison updatSaison(@RequestBody Saison v){
        return sais.updateSaison(v);
    }

    @DeleteMapping("/{id}")
    public void deleteSaison(@PathVariable("id") int id){
         sais.deleteSaison(id);
    }

    
}
