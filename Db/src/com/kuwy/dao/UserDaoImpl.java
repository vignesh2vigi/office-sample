package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.User;


public class UserDaoImpl implements UserDao {

	

	
	@Override
	
	public User insertOrUpdate(User user) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		User user1= new User();

		try {
			@SuppressWarnings("unused")
			int userId = 0;
			connection = ConnectionDAO.mysqlConnect();
			String insertOrUpdateQuery = "INSERT INTO viewers(userId,username,password,phonenumber,email)VALUES(?,?,?,?,?,NOW(),?)";
			preparedStatement = connection
					.prepareStatement(insertOrUpdateQuery);
		    preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getPhonenumber());
			resultSet = preparedStatement.executeQuery();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return user1;
	}
		// TODO Auto-generated method stub
		@Override
		public User getuser(User User) {
			User user = new User();
			Connection connection = null;
			ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
			try {
				String sql = "SELECT * FROM viewers WHERE viewers.username = ?";
				connection = ConnectionDAO.mysqlConnect();
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, User.getUsername());
				// System.out.println(sql);
				// preparedStatement.executeQuery();
				resultSet = preparedStatement.executeQuery();
				
					user.setUsername(resultSet.getString("viewers.username"));
				
			} catch (Exception e) {
				
				e.printStackTrace();
			
			} 
			return user;
		

	}
		@Override
		public void update(User user) {
			// TODO Auto-generated method stub
			
			
		}
		@Override
		public void delete(int userId) {
			// TODO Auto-generated method stub
			
		}

}
