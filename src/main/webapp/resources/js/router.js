angular.module('soccerLeague').config(function ($stateProvider, $urlRouterProvider) {
	$stateProvider
	.state('leagueInfo',{
		templateUrl : 'resources/html/league.html',
		controller : 'mainController'
	})
	.state('addMatch', {
		templateUrl : 'resources/html/match.html',
		controller : 'mainController'
	})
	.state('teamInfo', {
		templateUrl : 'resources/html/team.html',
		controller : 'teamController'
	})
//	.state("otherwise", {
//		url : "*path",
//		templateUrl: 'resources/html/league.html'
//	})
	;

});

//ng-Route method
//$routeProvider.when('/home', {
//templateUrl : 'resources/html/league.html'
//}).when('/match', {
//templateUrl : 'resources/html/match.html'
//}).when('/team', {
//templateUrl : 'resources/html/team.html',
//controller : 'teamController'
//}).otherwise({
//redirectTo: '/home'
//});