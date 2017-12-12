package com.kuwy.service;

import java.util.List;

import com.kuwy.model.User;

public interface UserService {
	public User registerUser(User user);
	
	public List<User>list();
	
	public User update(User user);
	
	public User delete(int userId);
}
