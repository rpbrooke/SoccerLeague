package com.robin.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.robin.models.entity.Club;
import com.robin.models.entity.Match;

import java.util.List;

/**
 * Match Repository (Dao) Interface extends Crud Repository.
 */
public interface MatchDao extends CrudRepository<Match,Integer>{

    public List<Match> findAll();
    public Match findByMatchId(int matchId);
    public List<Match> findByHomeClub(Club homeClub);
    public List<Match> findByAwayClub(Club awayClub);
    public List<Match> findByHomeScore(int score);
    public List<Match> findByAwayScore(int score);
}
