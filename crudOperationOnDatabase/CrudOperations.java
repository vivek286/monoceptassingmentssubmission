package com.techlabs.dbmsCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.text.ParseException;
import java.util.Scanner;

public class CrudOperations {
	public CrudOperations() throws SQLException {
		
	}
	DbConnection	dbConnection=DbConnection.getdbconnection();
	Connection connection;
	CrudOperations operations=new CrudOperations();
	Statement statement=operations.getStatement();
	
	void  createDatabase() throws SQLException {
//		Scanner scanner = new Scanner(System.in);
//		
//		
//		if(!databaseName.isEmpty()) {
//			System.out.print("Enter the name of the database: ");
//	        databaseName = scanner.next();
//	        
//	        String url = "jdbc:mysql://localhost/";
//	        try {
//	            connection = DriverManager.getConnection(url, username, password);
//
//	            String createDatabaseQuery = "CREATE DATABASE " + databaseName;
//	            
//	            statement =operations.getStatement();
//
//	            statement.executeUpdate(createDatabaseQuery);
//
//	            System.out.println("Database '" + databaseName + "' created successfully.");
//	        } catch (SQLException e) {
//	            e.printStackTrace();
//	        } finally {
//	        
//	            if (statement != null) {
//	                try {
//	                    statement.close();
//	                } catch (SQLException e) {
//	                    e.printStackTrace();
//	                }
//	            }
//	            if (connection != null) {
//	                try {
//	                    connection.close();
//	                } catch (SQLException e) {
//	                    e.printStackTrace();
//	                }
//	            }
//	        }
//		}
//		else {
//        	System.out.println("Database already Created");
//        }
	try {
		System.out.println("Enter database name");
		Scanner scanner=new Scanner(System.in);
		String dataBaseName=scanner.next();
		statement =operations.getStatement();
			
		statement.executeUpdate("CREATE DATABASE"+dataBaseName);
		
		System.out.println("Database created Successfully");
	} catch (Exception e) {
		e.printStackTrace();
	}	
	}

	void AccessDatabase() throws SQLException, ParseException {
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("Database management System for Emp & dep\n"
					+ "1. Create database\n"
					+ "2 Create employee table\n"
					+ "3 Create department table\n"
					+ "4. Insert Records into Department\n"
					+ "5. insert records into employee\n"
					+ "6.  update records of emloyees. increase commision by 20%\n"
					+ "8. delete employees having salary less than ............. . accept salary from user\n"
					+ "9. display all employees\n"
					+ "10. dispay all departments\n"
					+ "11. display all employees in a perticular department. Accept department name from user.\n"
					+ "12 For exit\n"
					+ "Enter Values");
			int value=scanner.nextInt();
			scanner.nextLine();
			switch (value) {
			case 1:
				operations.createDatabase();
				break;
			case 2:
				operations.createEmployeeTable();
				break;
			case 3:
				operations.createDepartmentTable();
				break;
			case 4:
				operations.insertintoDepartment();
				break;
			case 5:
				operations.insertintoEmployee();
				break;
			case 6:
					operations.updateCommision();
				break;
			case 8:
				operations.deletebysalary();
				break;
			case 9:
				operations.displayEmployee();
				break;
			case 10:
				operations.displaydepartment();
				break;
			case 11:
				operations.getEmployeeBydepartment();
				break;
			default:
				System.out.println("Enter appropriate value from given menu");
				break;
			}
		}
		
	}
	
	
	
	
	
void createEmployeeTable() throws SQLException{
try {
	Statement statement=operations.getStatement();
	statement.executeUpdate("use company");
	String tablequery="CREATE TABLE emp ("
            + " empno INT PRIMARY KEY ,"
            + "ename VARCHAR(255) NOT NULL,"
            +"job VARCHAR(20),"
            +"manager INT,"
            +"hireDate Datetime,"
            +"sal DOUBLE,"
            +"comm INT,"
            +"deptno INT"
            + ")";
	statement.executeUpdate(tablequery);
} catch (SQLException e) {
	e.printStackTrace();
}
}
	
void createDepartmentTable() throws SQLException {
		
		try {
			Statement statement=operations.getStatement();
			statement.executeUpdate("use company");
			String tablequery="CREATE TABLE dept (" +
                    "deptno INT PRIMARY KEY," +
                    "dname VARCHAR(50) NOT NULL," +
                    "loc VARCHAR(50) " +
                    ")";
			statement.executeUpdate(tablequery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
}

void insertintoEmployee() throws SQLException, ParseException {
try {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter Emp No");
	int emp_no=scanner.nextInt();
	System.out.println("Enter Name");
	String ename=scanner.next();
	System.out.println("Enter Job ");
	String job=scanner.next();
	System.out.println("Enter Manager type");
	String manager=scanner.next();
	System.out.println("Enter hireDate in formate (yyyy/mm/dd)");
	String date=scanner.next();
	System.out.println("Enter your salary");
	double salary=scanner.nextDouble();
	System.out.println("Enter Commision");
	String comm=scanner.next();
	System.out.println("Enter deptno");
	int deptno=scanner.nextInt();
	
	PreparedStatement preparedStatement=connection.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
	preparedStatement.setInt(1, emp_no);
	preparedStatement.setString(2, ename);
	preparedStatement.setString(3, job);
	
	if(manager.equals("NULL")) {
		preparedStatement.setNull(4, Types.NULL);
	}
	else {
		int value=Integer.parseInt(manager);
		preparedStatement.setInt(4, value);
	}
	preparedStatement.setString(5,date);
	preparedStatement.setDouble(6, salary);
	
	if(comm.equals("NULL")) {
		preparedStatement.setNull(7, Types.NULL);
	}
	else {
		double com=Double.parseDouble(comm);
		preparedStatement.setDouble(7, com);
	}
	preparedStatement.setInt(8, deptno);
	
	preparedStatement.executeUpdate();
	System.out.println("Inserted Succesfully");
} catch (Exception e) {
	e.printStackTrace();
}
	
}
void insertintoDepartment() throws SQLException, ParseException {
try {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter dept No");
	int deptno=scanner.nextInt();
	System.out.println("Enter Name");
	String dname=scanner.next();
	System.out.println("Enter location ");
	String loc=scanner.next();
	
	PreparedStatement preparedStatement=connection.prepareStatement("insert into dept values(?,?,?)");
	preparedStatement.setInt(1,deptno);
	preparedStatement.setString(2, dname);
	preparedStatement.setString(3, loc);
	preparedStatement.executeUpdate();
	System.out.println("Inserted in department Succesfully");
} catch (Exception e) {
	e.printStackTrace();
}

}

void displayEmployee() {
try {
    statement = operations.getStatement();
    statement.executeUpdate("USE COMPANY");
    // Execute your specific SQL query
    String query = "SELECT * FROM emp";
    ResultSet resultSet = statement.executeQuery(query);
    ResultSetMetaData metaData = resultSet.getMetaData();
	 
	 int colCount = metaData.getColumnCount();

       System.out.println("Table Name : " + metaData.getTableName(2));
       for(int i=1;i<colCount;i++) {
       	System.out.print("\t"+metaData.getColumnName(i)+"\t\t  ");
//       	 System.out.print("|");
       }
       System.out.println();

    // Process the result set
    while (resultSet.next()) {
    	int emp_no= resultSet.getInt("empno");
    	String ename= resultSet.getString("ename");
    	String job= resultSet.getString("job");
    	String manager= resultSet.getString("manager");
    	String dt= resultSet.getString("hireDate");
    	double salary= resultSet.getDouble("sal");
    	int comm= resultSet.getInt("comm");
    	int deptno= resultSet.getInt("deptno");

        System.out.println("\t"+emp_no + "\t\t " + ename+"\t\t " + job+ "\t\t " + manager+ "\t\t " + dt+ 
        		"\t\t" + salary+ "\t\t" + comm+ "\t\t" + deptno);
    }
} catch (SQLException e) {
    e.printStackTrace();
}

}

void displaydepartment() {
try {

	statement.executeUpdate("USE COMPANY");
    statement = operations.getStatement();

    // Execute your specific SQL query
    String query = "SELECT * FROM dept";
    ResultSet resultSet = statement.executeQuery(query);

    // Process the result set
    while (resultSet.next()) {
    	int deptno= resultSet.getInt("deptno");
    	String dname= resultSet.getString("dname");
    	String loc= resultSet.getString("loc");
    	
        System.out.println("deptno: " +deptno + ", dname: " + dname+", loc: " + loc);
    }
} catch (SQLException e) {
    e.printStackTrace();
}
}

void getEmployeeBydepartment() {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter department name");
String deptname=scanner.next();


try {       
    statement = operations.getStatement();
    statement.executeUpdate("USE COMPANY");
    // Execute your specific SQL query
    String query = "select * from emp join dept on emp.deptno=dept.deptno having dname="+deptname;
    ResultSet resultSet = statement.executeQuery(query);
    ResultSetMetaData metaData = resultSet.getMetaData();
	 
	 int colCount = metaData.getColumnCount();

      System.out.println("Table Name : " + metaData.getTableName(2));
      for(int i=1;i<colCount;i++) {
      	System.out.print("\t"+metaData.getColumnName(i)+"\t\t  ");
//      	 System.out.print("|");
      }
      System.out.println();

    // Process the result set
    while (resultSet.next()) {
    	int emp_no= resultSet.getInt("empno");
    	String ename= resultSet.getString("ename");
    	String job= resultSet.getString("job");
    	String manager= resultSet.getString("manager");
    	String dt= resultSet.getString("hireDate");
    	double salary= resultSet.getDouble("sal");
    	int comm= resultSet.getInt("comm");

    	System.out.println("\t"+emp_no + "\t\t " + ename+"\t\t " + job+ "\t\t " + manager+ "\t\t " + dt+ 
        		"\t\t" + salary+ "\t\t" + comm+ "\t\t");
    }
} catch (SQLException e) {
    e.printStackTrace();
}
}


void updateCommision() throws SQLException {
try {
	PreparedStatement preparedStatement=connection.prepareStatement("update emp set comm=0.2*IFNULL(comm,0) + IFNULL(comm,0); ");
	preparedStatement.executeUpdate();	
	System.out.println("commision updated Succesfully");
} catch (Exception e) {
	e.printStackTrace();
}

}

void deletebysalary() throws SQLException {
Scanner scanner=new Scanner(System.in);
System.out.println("Enter salary to delete");
int sal=scanner.nextInt();
PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where salary<?");
preparedStatement.setInt(1, sal);
System.out.println("delete Succesfully");

}

public Statement getStatement() throws SQLException {
	Statement st=dbConnection.connection.createStatement();
	return st;
}
}
