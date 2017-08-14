package com.robin.models.repositories;

import com.robin.models.Match;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchDao extends CrudRepository<Match,Integer>{

    public List<Match> findAll();
    public Match findByMatchId(Integer matchId);
    public List<Match> findByHomeTeam(String homeTeam);
    public List<Match> findByAwayTeam(String awayTeam);
    public List<Match> findByHomeScore(Integer score);
    public List<Match> findByAwayScore(Integer score);
}
