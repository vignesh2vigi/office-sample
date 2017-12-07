package com.kuwy.dao;



import java.util.List;

import com.kuwy.model.User;



public interface UserDao {
	
	public User insertOrUpdate(User user);
	 public List<User>list();
	public User  update(User user);
	public User delete(int userId);
}
