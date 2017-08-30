angular.module('soccerLeague').controller('mainController', ['$scope', '$log', 'mainFactory', mainController]);

function mainController($scope, $log, mainFactory) {
    "use strict";
// rest of controller and model
    $scope.teams=[];
    $scope.standing=[];
    
    $scope.tabData = [
    	 {
    	     heading: 'League Info',
    	     route: 'leagueInfo',
    	     disabled: false
    	 }, 
    	{
    	     heading: 'Team Info',
    	     route: 'teamInfo',
    	     disabled: false
    	 },
    	 {
    	     heading: 'Add Match',
    	     route: 'addMatch',
    	     disabled: false
    	 }
    	];

$scope.retrieveTeams = function(){
    $scope.teams=[];
    mainFactory.retrieveTeams().then(
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
    mainFactory.retrieveStandings().then(
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
    mainFactory.addMatch(match).then(
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
    $scope.retrieveStandings();
}
}
