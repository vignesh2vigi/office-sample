/**
 * 
 */
app.controller('UserController',function($scope,UserService,$location){
	
	$scope.registerUser=function(){
		console.log("USER DATA IS"+$scope.user)
	UserService.registerUser($scope.user).then(function(response){
		console.log(response.data)
		console.log(response.status)
		$location.path('/home')
		
	},function(response){
		console.log(response.data)
		
	console.log(response.status)
	$location.path('/register')
	})
	
	}
	function getuser(){
		userService.getuser().then(function(response){
             console.log(response.data)
			console.log(response.status)
			$scope.user=response.data
			
		},function(response){
			console.log(response.data)
			
			console.log(response.status)
			$location.path('/home')
				
		})
		getuser()
	}
	
})