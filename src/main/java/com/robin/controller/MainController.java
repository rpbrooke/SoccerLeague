package com.robin.controller;

import com.robin.models.dto.MatchDTO;
import com.robin.models.entity.Club;
import com.robin.models.entity.Match;
import com.robin.models.entity.Player;
import com.robin.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Main Rest Controller to handle AJAX calls from front-end site.
 */
@RestController
@RequestMapping("/soccerLeague")
public class MainController
{
    @Autowired
    DatabaseService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "/getTeamPlayers", params = "teamName")
    ResponseEntity<List<Player>> getTeamPlayers(@RequestParam("teamName") String teamName) {
    	List<Player> result = dbService.getTeamPlayers(teamName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getTeams")
    ResponseEntity<List<Club>> getTeams() {
        List<Club> result = dbService.getTeams();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/getTeamStats", params = "teamName")
    ResponseEntity<Map<String, List<MatchDTO>>> getTeamStats(@RequestParam("teamName") String teamName) {
    	Map<String, List<MatchDTO>> result = dbService.getTeamStats(teamName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getStandings")
    ResponseEntity<List<Club>> getStandings() {
        List<Club> result = dbService.getStandings();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/recordMatch")
    ResponseEntity<Map<String, String>> recordMatch(@RequestBody MatchDTO match ) {
        String result = dbService.recordMatch(match);
        Map<String, String> map = Collections.singletonMap("message", result);
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

//    public String index(){
//        return "Greetings from Spring Boot!";
//    }
//    @RequestMapping(name = "/teams", method = RequestMethod.GET)
//    public List<String> teams() {
//        List<String> teams = new ArrayList<>();
//        return teams;
//    }
//    @RequestMapping(name = "/standing", method = RequestMethod.GET)
//    public List<String> standing() {
//        service returns current standing
//    }


}
