package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Models.Actions;

public interface ActionsService {
    List<Actions> findAllActions();
    Optional<Actions> findById(int id);
    Actions CreateActions(Actions act);
    Actions updateActions(Actions act);
    void deleteActions(int id);
}
