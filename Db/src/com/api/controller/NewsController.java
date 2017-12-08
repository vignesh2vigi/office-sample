package com.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kuwy.model.News;
import com.kuwy.service.NewsServiceImpl;

@Path("/news")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class NewsController {
	
    @GET
    @Path(value="/getnews")
    public List<News>getnews() {
    	NewsServiceImpl newsService = new NewsServiceImpl();
		List<News> list = newsService.list();
   	 return list;
	}
    @POST
    @Path(value="/addnews")
	public News savenews(News news){
        	NewsServiceImpl newsService = new NewsServiceImpl(); 
        	News news1 =  newsService.savenews(news);
        	return news1;
    }
    @POST
	@Path(value="/delete/{id}")
	public News delete(@PathParam("id") int newsid){
		NewsServiceImpl newsService= new NewsServiceImpl();
		News news= newsService.delete(newsid);
		return news;
	}
    @POST
	@Path(value="/update")
	public News update(News news){
		
		NewsServiceImpl newsService= new NewsServiceImpl();
		News user2= newsService.update(news);
		return user2;
	}
	
}
