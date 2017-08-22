package com.robin.service;

import com.robin.models.entity.Club;
import com.robin.models.dto.MatchDTO;
import com.robin.models.entity.Match;
import com.robin.models.entity.Player;
import com.robin.models.repository.ClubDao;
import com.robin.models.repository.MatchDao;
import com.robin.models.repository.PlayerDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    PlayerDao playerDao;

    @Autowired
    MatchDao matchDao;

    @Autowired
    ClubDao clubDao;

    public DatabaseService() {
    }

    public List<Player> getTeamPlayers(String team) {
        System.out.println("getTeamPlayers");
        Club club = clubDao.findByClubName(team);
        return club.getPlayers();
    }

    public List<Club> getTeams() {
        System.out.println("getTeams");
        return clubDao.findAll();
    }

    public List<Club> getStandings() {
        System.out.println("getStandings");
        return clubDao.findAllByOrderByPointsDesc();
    }

    public String recordMatch(MatchDTO message) {
        System.out.println("recordMatch");
        Club homeClub = clubDao.findByClubName(message.getHomeClub());
        Club awayClub = clubDao.findByClubName(message.getAwayClub());
        Match match = new Match(homeClub, awayClub, message.getHomeScore(), message.getAwayScore());
        matchDao.save(match);
        updateClubs(homeClub, awayClub, message.getHomeScore(), message.getAwayScore());
        return "Match has been successfully added.";
    }

    private void updateClubs(Club homeClub, Club awayClub, int homeScore, int awayScore) {
        int result = Integer.compare(homeScore, awayScore);
        if (result == 0) {
            homeClub.addTie();
            awayClub.addTie();
        } else if (result < 0) {
            homeClub.addLoss();
            awayClub.addWin();
        } else {
            homeClub.addWin();
            awayClub.addLoss();
        }
        clubDao.save(homeClub);
        clubDao.save(awayClub);
    }

}