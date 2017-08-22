angular.module('soccerLeague').controller('Controller', ['$scope', '$log', 'Factory', Controller]);

function Controller($scope, $log, Factory) {
    "use strict";
//rest of controller and model
    $scope.players=[];
    $scope.teams=[];
    $scope.standing=[];


$scope.retrieveTeamPlayers = function(){
	$scope.players=[];
    Factory.retrieveTeamPlayers($scope.team).then(
        function mySuccess(response) {
            angular.forEach(response.data, function(value){
                $scope.players.push(value);
            })
    }).catch(function myError(response) {
        $log.error(response.data);
        $scope.players.push(response.statusText);
    });
}

$scope.retrieveTeams = function(){
    $scope.teams=[];
    Factory.retrieveTeams().then(
        function mySuccess(response) {
            angular.forEach(response.data, function(value){
                $scope.teams.push(value);
            })
        }).catch( function myError(response) {
        $log.error(response.data);
        $scope.teams.push(response.statusText);
        });
}

$scope.retrieveStandings = function(){
	  $scope.standing=[];
    Factory.retrieveStandings().then(
        function mySuccess(response) {
            angular.forEach(response.data, function(value){
                $scope.standing.push(value);
            })
        }).catch( function myError(response) {
        $log.error(response.data);
        $scope.standing.push(response.statusText);
        });
}
$scope.addMatch = function () {
    var match = {
        homeClub : $scope.homeClub,
        awayClub : $scope.awayClub,
        homeScore : $scope.homeScore,
        awayScore : $scope.awayScore};
    Factory.addMatch(match).then(
        function mySuccess(response) {
            $scope.matchResponse = response.data.message;
        }).catch(function myError(response) {
            $log.info(response);
        $log.error(response.data);
        $scope.matchResponse = response.data;
    });
    $scope.homeClub = "";
    $scope.awayClub = "";
    $scope.homeScore = "";
    $scope.awayScore = "";
    $scope.retrieveTeams();
    $scope.retrieveStandings();
}
}
