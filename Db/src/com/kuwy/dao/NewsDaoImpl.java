package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.News;

public class NewsDaoImpl implements NewsDao {

	@Override
	public News savenews(News news) {
		// TODO Auto-generated method stub
		News Obj = new News();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		@SuppressWarnings("unused")
		ResultSet resultSet = null;

		try {
			@SuppressWarnings("unused")
			int newsid = 0;
			connection = ConnectionDAO.mysqlConnect();
			String Query = "INSERT INTO news(newsid,headnews,content)VALUES(?,?,?)";
			preparedStatement = connection
					.prepareStatement(Query);
		    preparedStatement.setInt(1, news.getNewsid());
		    preparedStatement.setString(2, news.getHeadnews());
		    preparedStatement.setString(3, news.getContent());
			int insert =  preparedStatement.executeUpdate();
			if(insert>0)
			{
				Obj.setStatus(true);
			}else
			{
				Obj.setStatus(false);
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			Obj.setStatus(false);
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
		return Obj;
	}
		// TODO Auto-generated method stub
	

	@Override
	public List<News> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
