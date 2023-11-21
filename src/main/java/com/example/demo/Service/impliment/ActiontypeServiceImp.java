package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Actiontype;
import com.example.demo.Repository.ActiontypeRepository;
import com.example.demo.Service.ActiontypeService;

@Service
public class ActiontypeServiceImp implements ActiontypeService{
    
    public final ActiontypeRepository acttyprepo;

    public ActiontypeServiceImp(ActiontypeRepository acttyprepo) {
        this.acttyprepo = acttyprepo;
    }

    @Override
    public Actiontype CreateActiontype(Actiontype equip) {
        // TODO Auto-generated method stub
        return acttyprepo.save(equip);
    }

    @Override
    public void deleteActiontype(int id) {
        // TODO Auto-generated method stub
        acttyprepo.deleteById(id);
    }

    @Override
    public List<Actiontype> findAllActiontype() {
        // TODO Auto-generated method stub
          return acttyprepo.findAll();
    }

    @Override
    public Optional<Actiontype> findById(int id) {
        // TODO Auto-generated method stub
        return acttyprepo.findById(id);
    }

    @Override
    public Actiontype updateActiontype(Actiontype equip) {
        // TODO Auto-generated method stub
        return acttyprepo.save(equip);
    }

    
}
