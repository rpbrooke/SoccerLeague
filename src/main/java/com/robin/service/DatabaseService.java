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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    
    public Map<String, List<MatchDTO>> getTeamStats(String team) {
    	System.out.println("getTeamStats");
    	Map<String, List<MatchDTO>> teamStatsMap = new HashMap<>();
    	Club club = clubDao.findByClubName(team);
    	List<MatchDTO> homeGames = convertToMatchDTO(club.getHomeGames());
    	List<MatchDTO> awayGames = convertToMatchDTO(club.getAwayGames());
    	teamStatsMap.put("homeGames", homeGames);
    	teamStatsMap.put("awayGames", awayGames);
    	return teamStatsMap;
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

    private List<MatchDTO> convertToMatchDTO (List<Match> matches){
    	List<MatchDTO> result = new ArrayList<>();
    	for (Match match : matches) {
			String homeClub = match.getHomeClub().getClubName();
			String awayClub = match.getAwayClub().getClubName();
			int homeScore = match.getHomeScore();
			int awayScore = match.getAwayScore();
			result.add(new MatchDTO(homeClub, awayClub, homeScore, awayScore));
		}
    	return result;
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