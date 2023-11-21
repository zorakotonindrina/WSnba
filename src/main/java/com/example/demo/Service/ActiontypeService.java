package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Actiontype;

public interface ActiontypeService {
    List<Actiontype> findAllActiontype();
    Optional<Actiontype> findById(int id);
    Actiontype CreateActiontype(Actiontype equip);
    Actiontype updateActiontype(Actiontype equip);
    void deleteActiontype(int id);
}
