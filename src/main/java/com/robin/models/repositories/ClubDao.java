package com.robin.models.repositories;

import com.robin.models.Club;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClubDao extends CrudRepository<Club, Integer> {

    public List<Club> findAll();
    public Club findByClubId(Integer clubId);
    public List<Club> findByClubName(Integer clubName);
}
