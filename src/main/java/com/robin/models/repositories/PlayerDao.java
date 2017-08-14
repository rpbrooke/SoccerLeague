package com.robin.models.repositories;

import com.robin.models.Player;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerDao extends CrudRepository<Player,String>{

    public List<Player> findAll();
    public Player findByPlayerName(String name);
    public List<Player> findByPlayerNumber(Integer number);
    public List<Player> findByClubId(Integer clubId);
}
