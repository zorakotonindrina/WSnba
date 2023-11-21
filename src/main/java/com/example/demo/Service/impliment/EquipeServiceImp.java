package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Equipe;
import com.example.demo.Repository.EquipeRepository;
import com.example.demo.Service.EquipeService;

@Service
public class EquipeServiceImp implements EquipeService{
    
    public final EquipeRepository equirepo;

    public EquipeServiceImp(EquipeRepository equirepo) {
        this.equirepo = equirepo;
    }

    @Override
    public Equipe CreateEquipe(Equipe equip) {
        // TODO Auto-generated method stub
        return equirepo.save(equip);
    }

    @Override
    public void deleteEquipe(int id) {
        // TODO Auto-generated method stub
        equirepo.deleteById(id);
    }

    @Override
    public List<Equipe> findAllEquipe() {
        // TODO Auto-generated method stub
          return equirepo.findAll();
    }

    @Override
    public Optional<Equipe> findById(int id) {
        // TODO Auto-generated method stub
        return equirepo.findById(id);
    }

    @Override
    public Equipe updateEquipe(Equipe equip) {
        // TODO Auto-generated method stub
        return equirepo.save(equip);
    }

    
}
