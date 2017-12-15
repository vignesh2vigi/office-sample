/**
 * 
 */
var app = angular.module("app", [ 'ngRoute','ngCookies'])
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
    
    .when("/addnews", {
        templateUrl : 'news.html',
        	controller:'NewsController'
    })
    .when("/getnews", {
        templateUrl : 'newslist.html',
        	controller:'NewsController'
    })
    .when("/login", {
        templateUrl : 'login.html',
        	controller:'UserController'
    })
    .otherwise("/home",{templateurl:"home.html"})
    
    
	
})
app.run(function($rootScope,$cookieStore,$location,UserService){
	
	if($rootScope.currentUser==undefined){
		$rootScope.currentUser=$cookieStore.get('currentUser')
}
		$rootScope.logout=function(){
		UserService.logout().then(function(response){
			delete $rootScope.currentUser;
			$cookieStore.remove('currentUser')
			$location.path('/login')
			
		},function(response){
			console.log(response.status)
			/*if(response.status){
				delete $rootScope.currentUser;
				$cookieStore.remove('currentUser')
				$location.path('/login')

			}*/
			$location.path('/login')
				
		})
	}

})