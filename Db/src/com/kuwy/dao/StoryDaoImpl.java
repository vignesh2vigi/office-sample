package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.Story;

public class StoryDaoImpl implements StoryDao {

	@Override
	public void upload(Story story) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		try {
			@SuppressWarnings("unused")
			int userId = 0;
			connection = ConnectionDAO.mysqlConnect();
			String Query = "INSERT INTO story(storyid,storyhead,story)VALUES(?,?,?,NOW(),?)";
			preparedStatement = connection
					.prepareStatement(Query);
		    preparedStatement.setInt(1, story.getStoryid());
		    preparedStatement.setString(2, story.getStoryhead());
			preparedStatement.setString(3, story.getStory());
			
			resultSet = preparedStatement.executeQuery();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	@Override
	public List<Story> getstory() {
		// TODO Auto-generated method stub
		return null;
	}

}
