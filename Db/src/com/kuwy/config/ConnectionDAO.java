package com.kuwy.config;
import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionDAO {
	

		public static Connection mysqlConnect(){
			Connection connection = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Db", "root", "root");
				
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return connection;
		}

}

