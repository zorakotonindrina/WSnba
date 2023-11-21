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

import com.example.demo.Models.Actions;
import com.example.demo.Service.ActionsService;


@RestController
@RequestMapping("/actions")
public class ActionsController{
    public final ActionsService act;

    public ActionsController(ActionsService act) {
        this.act = act;
    }

      @GetMapping
    public List<Actions> findAllActions(){
        return act.findAllActions();
    }

    @GetMapping("/{id}")
    public Optional<Actions> findActionsById(@PathVariable("id") int id){
        return act.findById(id);
    }

    @PostMapping
    public Actions CreateActions(@RequestBody Actions v){
        return act.CreateActions(v);
    }

    @PutMapping
    public Actions updatActions(@RequestBody Actions v){
        return act.updateActions(v);
    }

    @DeleteMapping("/{id}")
    public void deleteActions(@PathVariable("id") int id){
         act.deleteActions(id);
    }

    
}
