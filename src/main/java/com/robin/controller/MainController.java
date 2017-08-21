package com.robin.controller;

import com.robin.models.entity.Club;
import com.robin.models.entity.Match;
import com.robin.models.entity.Player;
import com.robin.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
      System.out.println("test");
    	List<Player> result = dbService.getTeamPlayers(teamName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getTeams")
    ResponseEntity<List<Club>> getTeams() {
        List<Club> result = dbService.getTeams();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/getStandings")
    ResponseEntity<List<Club>> getStandings() {
        List<Club> result = dbService.getStandings();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/recordMatch")
    ResponseEntity<List<Club>> recordMatch(@RequestBody Match match ) {
        List<Club> result = dbService.recordMatch(match);
        return new ResponseEntity<>(result, HttpStatus.OK);
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
