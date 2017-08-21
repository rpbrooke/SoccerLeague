package com.robin.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.robin.models.entity.Club;

import java.util.List;

/**
 * Club Repository (Dao) Interface extends Crud Repository.
 */
public interface ClubDao extends CrudRepository<Club, Integer> {

    public List<Club> findAll();
    public List<Club> findAllByOrderByPositionAsc();
    public Club findByClubId(int clubId);
    public Club findByClubName(String clubName);
    public List<Club> findByGames(int games);
    public List<Club> findByPosition(int position);
    public List<Club> findByWins(int wins);
    public List<Club> findByLosses(int losses);
    public List<Club> findByTies(int ties);
}
