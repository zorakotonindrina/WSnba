package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Possession;
import com.example.demo.Repository.PossessionRepository;
import com.example.demo.Service.PossessionService;

@Service
public class PossessionServiceImp implements PossessionService{
    
    public final PossessionRepository possrepo;

    public PossessionServiceImp(PossessionRepository possrepo) {
        this.possrepo = possrepo;
    }

    @Override
    public Possession CreatePossession(Possession equip) {
        // TODO Auto-generated method stub
        return possrepo.save(equip);
    }

    @Override
    public void deletePossession(int id) {
        // TODO Auto-generated method stub
        possrepo.deleteById(id);
    }

    @Override
    public List<Possession> findAllPossession() {
        // TODO Auto-generated method stub
          return possrepo.findAll();
    }

    @Override
    public Optional<Possession> findById(int id) {
        // TODO Auto-generated method stub
        return possrepo.findById(id);
    }

    @Override
    public Possession updatePossession(Possession equip) {
        // TODO Auto-generated method stub
        return possrepo.save(equip);
    }

    
}
