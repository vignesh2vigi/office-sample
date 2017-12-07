package com.kuwy.config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class ConnectionDAO {
	

		public static Connection mysqlConnect(){
			Connection connection = null;
			java.sql.ResultSet resultSet = null;
			PreparedStatement preparedStatement = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "ROOT");
				/*String query  ="select * from fes_models" ;
				preparedStatement=connection.prepareStatement(query); 
				resultSet=preparedStatement.executeQuery();  
				while(resultSet.next())  
				{
					System.out.println("ModelID----->"+resultSet.getString("makeId")+"----ModelName-------)"+resultSet.getString("modelName"));
				}*/
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return connection;
		}
		public static void main(String args[])
		{
			ConnectionDAO.mysqlConnect();
		}

}

