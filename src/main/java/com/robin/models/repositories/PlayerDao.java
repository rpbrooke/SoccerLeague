package com.robin.models.repositories;

import com.robin.models.Club;
import com.robin.models.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Player Repository (Dao) Interface extends Crud Repository.
 */
public interface PlayerDao extends CrudRepository<Player,Integer>{

    public List<Player> findAll();
    public Player findByPlayerId(int id);
    public List<Player> findByPlayerName(String name);
    public List<Player> findByPlayerNumber(int number);
    public List<Player> findByClub(Club club);
}
