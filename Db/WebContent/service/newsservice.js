/**
 * 
 */
app.factory('NewsService',function($http){
	var newsService={}
	var BASE_URL="http://localhost:8080/Db"
	
	newsService.addnews=function(news){
		return	$http.post(BASE_URL + "/servlet/rest/news/addnews",news)
	}
	
	newsService.getnews=function(){
		return	$http.get(BASE_URL + "/servlet/rest/news/getnews")
		}
	
	
	
	return newsService;
	
})