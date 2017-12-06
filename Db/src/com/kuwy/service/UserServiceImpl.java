package com.kuwy.service;

import com.kuwy.dao.UserDao;
import com.kuwy.dao.UserDaoImpl;
import com.kuwy.model.User;

public class UserServiceImpl implements UserService{
 
	
	UserDao userdao;
	
	/*@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userdao.list();
	}*/

	public User insertOrUpdate(User User) {
		UserDao userDao = new UserDaoImpl();
		User user = userDao.insertOrUpdate(User);
		
		return user;
	}
	public User getuser(User User) {
		User getuser =new User();
		UserDao userDao = new UserDaoImpl();  
		getuser=userDao.getuser(User);
		return getuser;
	}

	
}
