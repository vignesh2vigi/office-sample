package com.kuwy.service;

import java.util.List;

import com.kuwy.dao.UserDao;
import com.kuwy.dao.UserDaoImpl;
import com.kuwy.model.User;

public class UserServiceImpl implements UserService{
 
	public User insertOrUpdate(User User) {
		UserDao userDao = new UserDaoImpl();
		User user = userDao.insertOrUpdate(User);
		
		return user;
	}
	
	public List<User>list(){
	      UserDao userDao=new UserDaoImpl();
	   
	      List<User> list=userDao.list();
	      return list;
	    
	}
	@Override
	public User update(int userId) {
		// TODO Auto-generated method stub
		UserDao userDao= new UserDaoImpl();
		User user=userDao.update(userId);
		return user;
	}
	@Override
	public User delete(int userId) {
		// TODO Auto-generated method stub
		UserDao userDao=new UserDaoImpl();
		User user=userDao.delete(userId);
		return user;
		
	}
	

	
}
