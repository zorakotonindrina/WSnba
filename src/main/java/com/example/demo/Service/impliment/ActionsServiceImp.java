package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Actions;
import com.example.demo.Repository.ActionsRepository;
import com.example.demo.Service.ActionsService;

@Service
public class ActionsServiceImp implements ActionsService{
    
    public final ActionsRepository actrepo;

    public ActionsServiceImp(ActionsRepository actrepo) {
        this.actrepo = actrepo;
    }

    @Override
    public Actions CreateActions(Actions equip) {
        // TODO Auto-generated method stub
        return actrepo.save(equip);
    }

    @Override
    public void deleteActions(int id) {
        // TODO Auto-generated method stub
        actrepo.deleteById(id);
    }

    @Override
    public List<Actions> findAllActions() {
        // TODO Auto-generated method stub
          return actrepo.findAll();
    }

    @Override
    public Optional<Actions> findById(int id) {
        // TODO Auto-generated method stub
        return actrepo.findById(id);
    }

    @Override
    public Actions updateActions(Actions equip) {
        // TODO Auto-generated method stub
        return actrepo.save(equip);
    }

    
}
