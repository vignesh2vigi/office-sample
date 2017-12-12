package com.kuwy.service;

import java.util.List;

import com.kuwy.dao.UserDao;
import com.kuwy.dao.UserDaoImpl;
import com.kuwy.model.User;

public class UserServiceImpl implements UserService{
 
	public User registerUser(User user) {
		UserDao userDao = new UserDaoImpl();
		User user4= userDao.registerUser(user);
		
		return user4;
	}
	
	public List<User>list(){
	      UserDao userDao=new UserDaoImpl();
	   
	      List<User> list=userDao.list();
	      return list;
	    
	}
	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		UserDao userDao= new UserDaoImpl();
		User user2=userDao.update(user);
		return user2;
	}
	@Override
	public User delete(int userId) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		User user=userDao.delete(userId);
		return user;
		
	}
	

	
}
