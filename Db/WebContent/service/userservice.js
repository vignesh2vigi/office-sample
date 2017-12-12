/**
 * 
 */
app.factory('UserService',function($http){
	var userService={}
	var BASE_URL="http://localhost:8080/Db"
	
	userService.registerUser=function(user){
		return	$http.post(BASE_URL + "/servlet/rest/user/registerUser",user)
	}
	userService.getuser=function(){
	return	$http.get(BASE_URL + "/servlet/rest/user/getuser")
	}
	
	
	return userService;
	
})