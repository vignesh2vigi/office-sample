package com.kuwy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kuwy.config.ConnectionDAO;
import com.kuwy.model.News;
import com.kuwy.model.User;

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
	public News update(News news) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
					News outputObj = new News();
					Connection connection = null;
					PreparedStatement preparedStatement = null;
					
					
					
		try {
						
						connection = ConnectionDAO.mysqlConnect();
						String del = "UPDATE news SET headnews=?,content=? WHERE newsid=?";
						preparedStatement = connection
								.prepareStatement(del);
						preparedStatement.setString(1, news.getHeadnews());
						preparedStatement.setString(2, news.getContent());
						preparedStatement.setInt(3, news.getNewsid());
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
	public List<News> list() {
		// TODO Auto-generated method stub
		Connection connection = null;
		ResultSet resultSet = null;
		PreparedStatement preparedStatement = null;
		List<News> list = new ArrayList<News>();
		try {
			
			String sql = "SELECT newsid,headnews,content FROM news";
			connection = ConnectionDAO.mysqlConnect();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while (resultSet.next()){
				News out = new News();
				//outob.set
				/*User user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setPhonenumber(resultSet.getString("phonenumber"));*/
				out.setNewsid(resultSet.getInt("newsid"));
				out.setHeadnews(resultSet.getString("headnews"));
				out.setContent(resultSet.getString("content"));
               
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
	public News delete(int newsid) {
		// TODO Auto-generated method stub
		News outObj = new News();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		
		@SuppressWarnings("unused")
		ResultSet resultSet = null;
		try {
			
			connection = ConnectionDAO.mysqlConnect();
			String delete = "DELETE FROM news WHERE newsid=?";
			preparedStatement = connection
					.prepareStatement(delete);
		    preparedStatement.setInt(1, newsid);
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
