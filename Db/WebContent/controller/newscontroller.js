/**
 * 
 */
app.controller('NewsController',function($scope,NewsService,$location){
	
	$scope.addnews=function(){
		console.log("News DATA IS"+$scope.news)
	NewsService.addnews($scope.news).then(function(response){
		console.log(response.data)
		console.log(response.status)
		$location.path('/home')
		
	},function(response){
		console.log(response.data)
		
	console.log(response.status)
	$location.path('/news')
	})
	
	}
	function getnews(){
		NewsService.getnews().then(function(response){
             console.log(response.data)
			console.log(response.status)
			
			$scope.listofGetnews=response.data
            
			
		},function(response){
			console.log(response.data)
			$location.path('/home')
		})
		
	}
	getnews()
	
	
})