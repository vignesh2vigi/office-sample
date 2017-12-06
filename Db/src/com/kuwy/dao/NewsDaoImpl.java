package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.News;

public class NewsDaoImpl implements  NewsDao {

	@Override
	public void savenews(News news) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		try {
			@SuppressWarnings("unused")
			int userId = 0;
			connection = ConnectionDAO.mysqlConnect();
			String Query = "INSERT INTO news(newsid,headnews,content)VALUES(?,?,?,NOW(),?)";
			preparedStatement = connection
					.prepareStatement(Query);
		    preparedStatement.setInt(1, news.getNewsid());
		    preparedStatement.setString(2, news.getHeadnews());
			preparedStatement.setString(3, news.getContent());
			
			resultSet = preparedStatement.executeQuery();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

	Connection connection = null;
	PreparedStatement preparedStatement = null;
	@SuppressWarnings("unused")
	ResultSet resultSet = null;
	@Override
	public List<News> getnews() {
		// TODO Auto-generated method stub
	
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		try {
			String sql = "SELECT news.newsid,news.headnews,news.content FROM news";
			connection = ConnectionDAO.mysqlConnect();
			preparedStatement = connection.prepareStatement(sql);
			
			// System.out.println(sql);
			// preparedStatement.executeQuery();
			resultSet = preparedStatement.executeQuery();
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
		return null;
	

}
	}

	

