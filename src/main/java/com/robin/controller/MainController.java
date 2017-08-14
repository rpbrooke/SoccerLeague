package com.robin.controller;

import com.robin.models.MatchDTO;
import com.robin.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by rpbro on 8/10/2017.
 */
@RestController
@RequestMapping("/")
public class MainController
{
    @Autowired
    DatabaseService dbService;

    @RequestMapping(method = RequestMethod.GET, value = "getTeamPlayers", params = "teamName")
    ResponseEntity<List<String>> getTeamPlayers(@RequestParam("teamName") String teamName) {
       List<String> result = dbService.getTeamPlayers(teamName);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getTeams")
    ResponseEntity<List<String>> getTeams() {
        List<String> result = dbService.getTeams();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "getStandings")
    ResponseEntity<List<String>> getStandings() {
        List<String> result = dbService.getStandings();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "recordMatch")
    ResponseEntity<String> recordMatch(@RequestBody MatchDTO match ) {
        String result = dbService.recordMatch(match);
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
