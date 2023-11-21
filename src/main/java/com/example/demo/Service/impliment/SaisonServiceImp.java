package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Saison;
import com.example.demo.Repository.SaisonRepository;
import com.example.demo.Service.SaisonService;

@Service
public class SaisonServiceImp implements SaisonService{
    
    public final SaisonRepository saisrepo;

    public SaisonServiceImp(SaisonRepository saisrepo) {
        this.saisrepo = saisrepo;
    }

    @Override
    public Saison CreateSaison(Saison equip) {
        // TODO Auto-generated method stub
        return saisrepo.save(equip);
    }

    @Override
    public void deleteSaison(int id) {
        // TODO Auto-generated method stub
        saisrepo.deleteById(id);
    }

    @Override
    public List<Saison> findAllSaison() {
        // TODO Auto-generated method stub
          return saisrepo.findAll();
    }

    @Override
    public Optional<Saison> findById(int id) {
        // TODO Auto-generated method stub
        return saisrepo.findById(id);
    }

    @Override
    public Saison updateSaison(Saison equip) {
        // TODO Auto-generated method stub
        return saisrepo.save(equip);
    }

    
}
