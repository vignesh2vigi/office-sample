package com.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kuwy.model.News;
import com.kuwy.service.NewsService;

@Path("/news")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class NewsController {
	private NewsService newsService;
    @GET
    @Path(value="/getnews/}")
    public List<News>getnews() {
   	 try {
            newsService.getnews();
        } catch (Exception e) {
            e.printStackTrace();
        }
   	 return getnews();
	}
	@POST
   @Path(value="/addnews")
	public void savenews(News news) {
       try {
           newsService.savenews(news);;
       } catch (Exception e) {
           e.printStackTrace();
       }
      
   }
	
}
