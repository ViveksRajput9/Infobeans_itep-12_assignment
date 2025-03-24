package jdbc;

import java.sql.SQLException;

public class CreateOpearation {
	public static boolean createTable() {
		System.out.println();
		if (Input.getConfirmation()) {
			System.out.println("Creating a new table...");
			String lTableName ="create table "+ Input.getTableName()+"(";
			try {
				System.out.println("write query....");
				System.out.println("columnName  datatype  Attribute ,");
				String query = Input.getEntrie();
				boolean flag = Service.getConnection().execute(query);
				
				if(!flag) {System.out.println("not created ");return false;} 
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