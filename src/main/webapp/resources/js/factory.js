angular.module('soccerLeague').factory('mainFactory', ['$http', mainFactory]);

function mainFactory($http){
    "use strict";

    var mainFactory = {}

    mainFactory.retrieveTeamPlayers = function(team){
        return $http.get("soccerLeague/getTeamPlayers/?teamName="+team);
    }

    mainFactory.retrieveTeams = function(){
        return $http.get("soccerLeague/getTeams");
    }
    
    mainFactory.retrieveTeamStats = function(team){
        return $http.get("soccerLeague/getTeamStats/?teamName="+team);
    }

    mainFactory.retrieveStandings = function(){
        return $http.get("soccerLeague/getStandings");
    }

    mainFactory.addMatch = function(match){
        return $http.post("soccerLeague/recordMatch", match);
    }

    return mainFactory;


}

