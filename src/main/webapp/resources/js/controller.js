angular.module('soccerLeague').controller("controller", controller);

function controller($scope, $log, Factory) {
    "use strict";
//rest of controller and model
    $scope.players=[];
    $scope.teams=[];
    $scope.standing=[]


    //function match



    Factory.retrieveTeamPlayers($scope.team).then(
        function mySuccess(response) {
            angular.forEach(response.data, function(value){
                $scope.players.push(value);
            })
    }).catch(function myError(response) {
        $log.error(response.data);
        $scope.players.push(response.statusText);
    });

    Factory.retrieveTeams().then(
        function mySuccess(response) {
            angular.forEach(response.data, function(value){
                $scope.teams.push(value);
            })
        }).catch( function myError(response) {
        $log.error(response.data);
        $scope.teams.push(response.statusText);
        });

    Factory.retrieveStandings().then(
        function mySuccess(response) {
            angular.forEach(response.data, function(value){
                $scope.standing.push(value);
            })
        }).catch( function myError(response) {
        $log.error(response.data);
        $scope.standing.push(response.statusText);
        });

    Factory.addMatch(new Match(

        )).then(
        function mySuccess(response) {
            $scope.matchResponse = response.data;
        }).catch( function myError(response) {
        $log.error(response.data);
            $scope.matchResponse = response.statusText;
        });

}
