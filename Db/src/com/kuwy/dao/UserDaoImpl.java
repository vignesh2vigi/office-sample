package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.User;


public class UserDaoImpl implements UserDao {

	

	
	@Override
	
	public User registerUser(User user) {
		User outputObj = new User();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		@SuppressWarnings("unused")
		ResultSet resultSet = null;

		try {
			@SuppressWarnings("unused")
			int userId = 0;
			connection = ConnectionDAO.mysqlConnect();
			String insertOrUpdateQuery = "INSERT INTO viewers(userId,username,email,password,phonenumber,role)VALUES(?,?,?,?,?,?)";
			preparedStatement = connection
					.prepareStatement(insertOrUpdateQuery);
		    preparedStatement.setInt(1, user.getUserId());
			preparedStatement.setString(2, user.getUsername());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setString(4, user.getPassword());
			preparedStatement.setString(5, user.getPhonenumber());
			preparedStatement.setString(6, user.getRole());
			int insertCount =  preparedStatement.executeUpdate();
			if(insertCount >0)
			{
				outputObj.setStatus(true);
			}else
			{
				outputObj.setStatus(false);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			outputObj.setStatus(false);
		} 
		finally
		{
			try {
				preparedStatement.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return outputObj;
	}
		// TODO Auto-generated method stub
	
		@Override
		
		public List<User>list() {
			/*User user=new User();*/
			
			
			Connection connection = null;
			ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
			List<User> list = new ArrayList<User>();
			try {
				
				String sql = "SELECT userId,username,password,phonenumber,email,role FROM viewers";
				connection = ConnectionDAO.mysqlConnect();
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()){
					User outob = new User();
					//outob.set
					/*User user = new User();
					user.setUsername(resultSet.getString("username"));
					user.setEmail(resultSet.getString("email"));
					user.setPassword(resultSet.getString("password"));
					user.setPhonenumber(resultSet.getString("phonenumber"));*/
					outob.setUsername(resultSet.getString("username"));
					outob.setEmail(resultSet.getString("email"));
					outob.setPassword(resultSet.getString("password"));
					outob.setPhonenumber(resultSet.getString("phonenumber"));
	                outob.setUserId(resultSet.getInt("userId"));
	                outob.setRole(resultSet.getString("role"));
				list.add(outob);
				}
	
				
				
				
			} catch (Exception e) {
	
				e.printStackTrace();
			    
			} 
			finally{
				try {
					preparedStatement.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			return list;
		

	}
		@Override
		public User update(User user) {
			// TODO Auto-generated method stub
			User outputObj = new User();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			
			
try {
				
				connection = ConnectionDAO.mysqlConnect();
				String del = "UPDATE viewers SET username=?,password=?,phonenumber=?,email=? WHERE userId=?";
				preparedStatement = connection
						.prepareStatement(del);
				preparedStatement.setString(1, user.getUsername());
			    preparedStatement.setString(2, user.getPassword());
			    preparedStatement.setString(3, user.getPhonenumber());
			    preparedStatement.setString(4, user.getEmail());
			    preparedStatement.setInt(5, user.getUserId());
				int deleteCount =  preparedStatement.executeUpdate();
				if(deleteCount >0)
				{
					outputObj.setStatus(true);
				}else
				{
					outputObj.setStatus(false);
				}
				
			}
			
			catch (Exception e) {
				
				e.printStackTrace();
				
				outputObj.setStatus(false);
			} 
			finally
			{
				try {
					preparedStatement.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return outputObj;
		}
		
			
			
		@Override
		public User login(User user) {
			// TODO Auto-generated method stub
			Connection connection = null;
			ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
try {
				
				String sql = "SELECT username,password FROM viewers WHERE username=?,password=?";
				connection = ConnectionDAO.mysqlConnect();
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				while (resultSet.next()){
					User user1 = new User();
					//outob.set
					/*User user = new User();
					user.setUsername(resultSet.getString("username"));
					user.setEmail(resultSet.getString("email"));
					user.setPassword(resultSet.getString("password"));
					user.setPhonenumber(resultSet.getString("phonenumber"));*/
					user1.setUsername(resultSet.getString("username"));
					
					user1.setPassword(resultSet.getString("password"));
					
				
				}
	
				
				
				
			} catch (Exception e) {
	
				e.printStackTrace();
			    
			} 
			finally{
				try {
					preparedStatement.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			return user;
		}

		@Override
		public User delete(int userId) {
			// TODO Auto-generated method stub
			User outObj = new User();
			Connection connection = null;
			PreparedStatement preparedStatement = null;
			
			@SuppressWarnings("unused")
			ResultSet resultSet = null;
			try {
				
				connection = ConnectionDAO.mysqlConnect();
				String delete = "DELETE FROM viewers WHERE userId=?";
				preparedStatement = connection
						.prepareStatement(delete);
			    preparedStatement.setInt(1, userId);
				int deleteCount =  preparedStatement.executeUpdate();
				if(deleteCount >0)
				{
					outObj.setStatus(true);
				}else
				{
					outObj.setStatus(false);
				}
				
			}
         catch (Exception e) {
				
				e.printStackTrace();
			    
			} 
			finally{
				try {
					preparedStatement.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
			return outObj;
			
		}

}
