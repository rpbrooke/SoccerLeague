package com.robin.models.repositories;

import com.robin.models.League;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LeagueDao extends CrudRepository<League, String>{

    public List<League> findAll();
    public League findByClubName(String clubName);
    public List<League> findByPosition(Integer position);
    public List<League> findByGamesPlayed(Integer gamesPlayed);
    public List<League> findByWins(Integer wins);
    public List<League> findByLosses(Integer losses);
    public List<League> findByTies(Integer ties);
    }
