package com.kuwy.dao;



import java.util.List;

import com.kuwy.model.User;



public interface UserDao {
	
	public User registerUser(User user);
	 public List<User>list();
	public User  update(User user);
	public User delete(int userId);
	public User login(User user);
	
}
