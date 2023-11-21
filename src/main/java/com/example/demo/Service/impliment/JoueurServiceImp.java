package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Joueur;
import com.example.demo.Repository.JoueurRepository;
import com.example.demo.Service.JoueurService;

@Service
public class JoueurServiceImp implements JoueurService{
    
    public final JoueurRepository jrepo;

    public JoueurServiceImp(JoueurRepository jrepo) {
        this.jrepo = jrepo;
    }

    @Override
    public Joueur CreateJoueur(Joueur equip) {
        // TODO Auto-generated method stub
        return jrepo.save(equip);
    }

    @Override
    public void deleteJoueur(int id) {
        // TODO Auto-generated method stub
        jrepo.deleteById(id);
    }

    @Override
    public List<Joueur> findAllJoueur() {
        // TODO Auto-generated method stub
          return jrepo.findAll();
    }

    @Override
    public Optional<Joueur> findById(int id) {
        // TODO Auto-generated method stub
        return jrepo.findById(id);
    }

    @Override
    public Joueur updateJoueur(Joueur equip) {
        // TODO Auto-generated method stub
        return jrepo.save(equip);
    }

    
}
