package com.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kuwy.model.Story;
import com.kuwy.service.StoryServiceImpl;

@Path("/story")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class StoryController {
	@POST
    @Path(value="/addstory")
	public Story save(Story story) {
        	StoryServiceImpl storyService = new StoryServiceImpl(); 
        	Story user2 =  storyService.save(story);
        	return user2;
    }
	@GET
    @Path(value="/getstory")
    public List<Story>list() {
    	StoryServiceImpl storyService = new StoryServiceImpl();
		List<Story> list = storyService.list();
   	 return list;
	}
	@POST
	@Path(value="/delete/{id}")
	public Story delete(@PathParam("id") int storyid){
		StoryServiceImpl storyService= new StoryServiceImpl();
		Story story= storyService.delete(storyid);
		return story;
	}
	@POST
	@Path(value="/update")
	public Story update(Story story){
		
		StoryServiceImpl storyService= new StoryServiceImpl();
		Story user2= storyService.update(story);
		return user2;
	}

}
