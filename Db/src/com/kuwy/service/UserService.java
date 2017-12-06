package com.kuwy.service;

import com.kuwy.model.User;

public interface UserService {
	public User insertOrUpdate(User user);
	public User getuser(User user);
}
