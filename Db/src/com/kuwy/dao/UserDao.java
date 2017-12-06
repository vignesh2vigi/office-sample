package com.kuwy.dao;



import com.kuwy.model.User;



public interface UserDao {
	
	public User insertOrUpdate(User user);
	public User getuser(User user);
	public void update(User user);
	public void delete(int userId);
}
