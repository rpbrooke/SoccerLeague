angular.module('soccerLeague').controller('teamController', ['$scope', '$log', 'mainFactory', teamController]);

function teamController($scope, $log, mainFactory) {
    "use strict";
    
    $scope.players=[];
    $scope.homeGames=[];
    $scope.awayGames=[];
    
    $scope.retrieveStats = function(){
    	$scope.retrieveTeamPlayers();
    	$scope.retrieveTeamStats();
    }

    $scope.retrieveTeamPlayers = function(){
    	$scope.players=[];
        mainFactory.retrieveTeamPlayers($scope.team).then(
            function mySuccess(response) {
                angular.forEach(response.data, function(value){
                    $scope.players.push(value);
                })
        }).catch(function myError(response) {
            $log.error(response.data);
            $scope.players.push(response.statusText);
        });
    }
    
    $scope.retrieveTeamStats = function(){
    	$scope.homeGames = [];
    	$scope.awayGames = [];
        mainFactory.retrieveTeamStats($scope.team).then(
            function mySuccess(response) {
            	$log.info(response.data.homeGames);
            	$log.info(response.data.awayGames);
                angular.forEach(response.data.homeGames, function(value){
                    $scope.homeGames.push(value);
                });
                angular.forEach(response.data.awayGames, function(value){
                    $scope.awayGames.push(value);
                })
        }).catch(function myError(response) {
            $log.error(response.data);
            $scope.players.push(response.statusText);
        });
    }
    
}