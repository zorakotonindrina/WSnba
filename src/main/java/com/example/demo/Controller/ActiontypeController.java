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

import com.example.demo.Models.Actiontype;
import com.example.demo.Service.ActiontypeService;


@RestController
@RequestMapping("/actiontype")
public class ActiontypeController{
    public final ActiontypeService acttyp;

    public ActiontypeController(ActiontypeService acttyp) {
        this.acttyp = acttyp;
    }

      @GetMapping
    public List<Actiontype> findAllActiontype(){
        return acttyp.findAllActiontype();
    }

    @GetMapping("/{id}")
    public Optional<Actiontype> findActiontypeById(@PathVariable("id") int id){
        return acttyp.findById(id);
    }

    @PostMapping
    public Actiontype CreateActiontype(@RequestBody Actiontype v){
        return acttyp.CreateActiontype(v);
    }

    @PutMapping
    public Actiontype updatActiontype(@RequestBody Actiontype v){
        return acttyp.updateActiontype(v);
    }

    @DeleteMapping("/{id}")
    public void deleteActiontype(@PathVariable("id") int id){
         acttyp.deleteActiontype(id);
    }

    
}
