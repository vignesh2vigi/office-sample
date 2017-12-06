package com.api.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.kuwy.model.User;
import com.kuwy.service.UserService;

@Path("/user")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
public class UserController {
	
	private UserService userService;
     
	@POST
    @Path(value="/adduser")
	public User insertOrUpdate(User user) {
        try {
            userService.insertOrUpdate(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
	@GET
    @Path(value="/getuser")
	public User getuser(User user) {
   	 try {
            userService.getuser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
   	 return user;
	}
	
	
}