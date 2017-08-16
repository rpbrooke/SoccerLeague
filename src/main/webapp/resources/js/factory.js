angular.module('soccerLeague').factory('Factory', ['$http', Factory]);

function Factory($http){
    "use strict";

    var Factory = {}

    Factory.retrieveTeamPlayers = function(team){
        return $http.get("soccerLeague/getTeamPlayers/?teamName="+team);
    }

    Factory.retrieveTeams = function(){
        return $http.get("soccerLeague/getTeams");
    }

    Factory.retrieveStandings = function(){
        return $http.get("soccerLeague/getStandings");
    }

    Factory.addMatch = function(match){
        return $http.post("soccerLeague/recordMatch", match);
    }

    return Factory;


}

