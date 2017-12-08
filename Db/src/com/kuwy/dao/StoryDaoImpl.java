package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.Story;

public class StoryDaoImpl implements StoryDao {

	@Override
	public Story save(Story story) {
		// TODO Auto-generated method stub
		Story outputObj = new Story();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		@SuppressWarnings("unused")
		ResultSet resultSet = null;

		try {
			@SuppressWarnings("unused")
			int userId = 0;
			connection = ConnectionDAO.mysqlConnect();
			String insertOrUpdateQuery = "INSERT INTO story(storyid,storyhead,story)VALUES(?,?,?)";
			preparedStatement = connection
					.prepareStatement(insertOrUpdateQuery);
			preparedStatement.setInt(1, story.getStoryid());
			preparedStatement.setString(2, story.getStoryhead());
			preparedStatement.setString(3, story.getStory());
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

	@Override
	public List<Story> list() {
		// TODO Auto-generated method stub
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<Story> list = new ArrayList<Story>();
		try {
			
			String sql = "SELECT storyid,storyhead,story FROM story";
			connection = ConnectionDAO.mysqlConnect();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				Story out = new Story();
				//outob.set
				/*User user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setPhonenumber(resultSet.getString("phonenumber"));*/
				
				out.setStoryid(resultSet.getInt("storyId"));
               out.setStoryhead(resultSet.getString("storyhead"));
               out.setStory(resultSet.getString("story"));
			list.add(out);
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
	public Story delete(int storyid) {
		// TODO Auto-generated method stub
		Story outObj = new Story();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		try {
			
			connection = ConnectionDAO.mysqlConnect();
			String delete = "DELETE FROM story WHERE storyid=?";
			preparedStatement = connection
					.prepareStatement(delete);
		    preparedStatement.setInt(1, storyid);
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
	@Override
	public Story update(Story story) {
		
					Story outputObj = new Story();
					Connection connection = null;
					PreparedStatement preparedStatement = null;
					
					
					
		try {
						
						connection = ConnectionDAO.mysqlConnect();
						String del = "UPDATE story SET storyhead=?,story=? WHERE storyid=?";
						preparedStatement = connection
								.prepareStatement(del);
						preparedStatement.setString(1, story.getStoryhead());
						preparedStatement.setString(2, story.getStory());
						preparedStatement.setInt(3, story.getStoryid());
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


}
