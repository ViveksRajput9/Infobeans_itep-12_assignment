package com.Info.Dao;
import java.sql.*;
import com.Info.main.Input;

public class CreateOperation {
	private static final CreateOperation instance = new CreateOperation();
	private  CreateOperation() {}
	public boolean createTable() throws SQLException {
		System.out.println();
		if (Input.getConfirmation()) {
			System.out.println("Creating a new table...");
			String lTableName ="create table "+ Input.getTableName()+"(";
			System.out.println("write query....");
			System.out.println("columnName  datatype  Attribute ,");
			String query = Input.getEntrie();
			boolean flag = false;
			try {
				flag = Database.getConnection().createStatement().execute(query);
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
}