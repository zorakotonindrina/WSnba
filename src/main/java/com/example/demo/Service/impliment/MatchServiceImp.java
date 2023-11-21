package com.example.demo.Service.impliment;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.Models.Match;
import com.example.demo.Repository.MatchRepository;
import com.example.demo.Service.MatchService;

@Service
public class MatchServiceImp implements MatchService{
    
    public final MatchRepository mrepo;

    public MatchServiceImp(MatchRepository mrepo) {
        this.mrepo = mrepo;
    }

    @Override
    public Match CreateMatch(Match equip) {
        // TODO Auto-generated method stub
        return mrepo.save(equip);
    }

    @Override
    public void deleteMatch(int id) {
        // TODO Auto-generated method stub
        mrepo.deleteById(id);
    }

    @Override
    public List<Match> findAllMatch() {
        // TODO Auto-generated method stub
          return mrepo.findAll();
    }

    @Override
    public Optional<Match> findById(int id) {
        // TODO Auto-generated method stub
        return mrepo.findById(id);
    }

    @Override
    public Match updateMatch(Match equip) {
        // TODO Auto-generated method stub
        return mrepo.save(equip);
    }

    
}
