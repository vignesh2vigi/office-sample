/**
 * 
 */
var app = angular.module("app", [ 'ngRoute'])
app.config(function($routeProvider) {

	$routeProvider
	.when("/home", {
        templateUrl : 'home.html'
    })
	.when("/register", {
        templateUrl : 'register.html',
        	controller:'UserController'
    })
    
    .when("/getuser", {
        templateUrl : 'userdetails.html',
        	controller:'UserController'
    })
    
    .otherwise("/home",{templateurl:"home.html"})
	
})