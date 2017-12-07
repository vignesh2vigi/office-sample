package com.api.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kuwy.model.User;
import com.kuwy.service.UserServiceImpl;

@Path("/user")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class UserController {
	
     
	@POST
    @Path(value="/adduser")
	public User insertOrUpdate(User user) {
        	UserServiceImpl userService = new UserServiceImpl(); 
        	User user2 =  userService.insertOrUpdate(user);
        	return user2;
    }
	
	@GET
	@Path(value="/getuser")
	public List<User>list(){
		
		UserServiceImpl userService= new UserServiceImpl();
		List<User> list = userService.list();
		return list;
		
	}
	
	@POST
	@Path(value="/delete/{id}")
	public User delete(@PathParam("id") int userId){
		/*System.out.println("userId---->"+userId);*/
		UserServiceImpl userService= new UserServiceImpl();
		User user = userService.delete(userId);
		return user;
	}
	@PUT
	@Path(value="/update/{id}")
	public User update(@PathParam("id") int userId){
		UserServiceImpl userService= new UserServiceImpl();
		User user3 = userService.update(userId);
		return user3;
	}
	
}