package com.robin.service;

import com.robin.models.MatchDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatabaseService {

    private static final Logger log = LoggerFactory.getLogger(DatabaseService.class);

    public DatabaseService(){}

    public List<String> getTeamPlayers(String team){
        log.info("test");
        return null;
    }

    public List<String> getTeams() {
        return null;
    }

    public List<String> getStandings(){
        return null;
    }

    public String recordMatch(MatchDTO message){
        return null;
    }
}
