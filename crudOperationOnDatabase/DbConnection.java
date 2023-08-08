package com.techlabs.dbmsCrud;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import com.techlabs.jdbc.Dbconnection;

public class DbConnection {
		private static DbConnection dbConnection;
		private String username = "root";
        private String password = "admin";
        Connection connection = null;
        Statement statement = null;
		private DbConnection() throws SQLException {
			
		}
		
		void connect() {
			try {
				//Registering driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/company",username,password);
//				dbConnection.createDepartmentTable();
//				dbConnection.createEmployeeTable();
//				System.out.println("Connection eastablished successfully");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		public static DbConnection getdbconnection() throws SQLException {
			if(dbConnection==null) 
				dbConnection=new DbConnection();
			return dbConnection;
		}
		
		

		
}
