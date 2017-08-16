package com.robin.service;

import com.robin.models.Club;
import com.robin.models.Match;
import com.robin.models.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {

    private static final Logger log = LoggerFactory.getLogger(DatabaseService.class);

    public DatabaseService(){}

    public List<Player> getTeamPlayers(String team){
        log.info("getTeamPlayers");
        return null;
    }

    public List<Club> getTeams() {
        log.info("getTeams");
        return null;
    }

    public List<Club> getStandings(){
        log.info("getStandings");
        return null;
    }

    public List<Club> recordMatch(Match message){
        log.info("recordMatch");
        return null;
    }
}
