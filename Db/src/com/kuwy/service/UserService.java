package com.kuwy.service;

import java.util.List;

import com.kuwy.model.User;

public interface UserService {
	public User insertOrUpdate(User user);
	
	public List<User>list();
	
	public User update(int userId);
	
	public User delete(int userId);
}
