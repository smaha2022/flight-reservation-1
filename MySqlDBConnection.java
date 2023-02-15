package com.test;
import java.sql.*;

import java.sql.DriverManager;

public class MySqlDBConnection {

	
		
			private static final String url = "jdbc:mysql://localhost:3306/flightresv";
			private static final String userName = "root";
			private static final String passWord = "root";
			
			
			public static Connection getConnection() throws SQLException{
				 
				return DriverManager.getConnection(url,userName,passWord);
			}

		

	


	}


