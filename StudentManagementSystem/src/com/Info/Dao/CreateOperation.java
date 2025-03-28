package com.Info.Dao;
import java.sql.*;

import com.Info.services.Input;

public class CreateOperation {
	private static final CreateOperation instance = new CreateOperation();
	private  CreateOperation() {}
	public static CreateOperation create() { return instance;}
	
	public boolean createTablewithQuery() throws SQLException {
		System.out.println();
		if (Input.getConfirmation()) {
			System.out.println("Creating a new table...");
			String lTableName ="create table "+ Input.getTableName()+"(";
			System.out.println("write query....");
			System.out.println("columnName  datatype  Attribute ,");
			String query = Input.getEntrie();
			boolean flag = false;
			try {
				flag = Database.database().getConnection().createStatement().execute(query);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!flag) {System.out.println("not created ");return false;} 
			System.out.println("Table Created successfully");
			
			return true;
		} else
			return true;
	}
   public  boolean createTablewithFixedfield() {
	System.out.println();
	if (Input.getConfirmation()) {
		System.out.println("Creating a new table...");
		String lTableName ="create table "+ Input.getTableName()+"(";
		try {
			Database.database().getConnection().prepareStatement("create table " + lTableName
			+ "(id INT PRIMARY KEY AUTO_INCREMENT,firstName VARCHAR(30),"
			+ "lastName VARCHAR(30),MobileNumber varchar(15))").executeUpdate();
			System.out.println("Table Created successfully");
			return true;
		} catch (SQLException e) {
			// TODO: handle exception
			if (e.getErrorCode() == 1050) {
				System.out.println("Table already exist");
				return true;
			} else {
				System.out.println("An error occurred while creating the table: " + e.getMessage());
				return true;
			}
		}
	} else
		return true;
}
   }
