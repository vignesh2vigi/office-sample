/**
 * 
 */
app.controller('UserController',function($scope,UserService,$location,$rootScope,$cookieStore){
	
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
		UserService.getuser().then(function(response){
             console.log(response.data)
			console.log(response.status)
			
			$scope.listofGetuser=response.data
            },function(response){
			console.log(response.data)
			$location.path('/home')
		})
		
	}
	$scope.login=function(){
		console.log($scope.user)
	UserService.login($scope.user).then(function(response){
		console.log(response.data)
		console.log(response.status)
		$rootScope.currentUser=response.data//username
		$cookieStore.put('currentUser',response.data)
		$location.path('/home')
		
	},function(response){
		$scope.error=response.data.message
	console.log(response.status)
	$location.path('/login')
	})
	}
	if($rootScope.currentUser!=undefined){
		UserService.getuser().then(function(response){
			$scope.user=response.data
		},function(response){
			console.log(response.status)
			if(response.status==401){
				delete $rootScope.currentUser;
				$cookieStore.remove('userDetails')
				$location.path('/login')

			}
				
			})
		}
	getuser()
	
})