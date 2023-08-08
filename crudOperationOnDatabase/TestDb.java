package com.techlabs.dbmsCrud;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.Scanner;

public class TestDb {

	public static void main(String[] args) throws SQLException, ParseException {
		DbConnection dbConnection=DbConnection.getdbconnection();
		dbConnection.connect();
//		dbConnection.insertintoDepartment();
//		dbConnection.insertintoEmployee();
		dbConnection.AccessDatabase();
		

	}

}
