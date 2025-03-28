package com.Info.Dao;

import java.net.PasswordAuthentication;
import java.sql.*;

import com.Info.services.Input;
import com.Info.services.Menu;

public class Database {
	private static final Database instance = new Database();
	private  Statement st;
	private   String databaseName;
	private  String tableName;
    private  Connection connection;
    private String Password;
    private String userName;
    private Connection database;
    private Database() {
    	
    }
    public static Database database() {return instance;}
    
	public  String getDatabaseName() {
		if (!databaseName.isBlank())
			return databaseName;
		else {
			String localdatabaseName = Input.setDatabaseName();
			while (!localdatabaseName.isBlank()) {
				databaseName = Input.setDatabaseName();
			}
			return databaseName;
		}
	}
	public  String getTableName() {
		return tableName;
	}

	public  Connection getConnection() {
		return connection;
	}
    public ResultSet getDatabases() throws SQLException {
		return database.createStatement().executeQuery("SHOW DATABASES");

    }
    public ResultSet getTables() throws SQLException{
    	return database.createStatement().executeQuery("SHOW TABLES");
    }

    public boolean isTableExist(String tableName) throws SQLException {
        // Use a prepared statement to prevent SQL injection
        String query = "SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = ? AND table_name = ?";
        PreparedStatement   preparedStatement = connection.prepareStatement(query);
        System.out.println(databaseName);
        preparedStatement.setString(1, databaseName);
        preparedStatement.setString(2, tableName);
 	   
        if(databaseName.isBlank()) {
        	System.out.println("Database name is null");
        }
        ResultSet resultSet = preparedStatement.executeQuery();
        // Check if the result set has data
        if (resultSet.next()) {
            int count = resultSet.getInt(1);
            if(count>=0) return true;
            else return false;
        }
	    // Close the ResultSet and PreparedStatement in the finally block
	    try {
	            if (resultSet != null) {
	                resultSet.close();
	            }
	            if (preparedStatement != null) {
	                preparedStatement.close();
	            }
	        } catch (SQLException e) {
	            System.err.println("Error closing resources: " + e.getMessage());
	            return false;
	        }
	    return false;
    }
	public  boolean selectTable(String tableName) {
	    try {
	        // Check if the result set has data
	            if (isTableExist(tableName)) {
	            	System.out.println("Table selected: " + tableName);
	            	this.tableName = tableName;
	                return true;
	            }
	            System.err.println("Table does not exist.");
	             return false;
	            
	        
	    } catch (SQLException e) {
	        // Handle SQL exceptions specifically
	        System.err.println("SQL error: " + e.getMessage());
	    } catch (Exception e) {
	        // Handle any other exceptions
	        System.err.println("Error: " + e.getMessage());
	    }
		return false; 
	}
	public boolean selectDatabase(String DatabaseName) throws SQLException {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+DatabaseName, userName,Password);
				st = connection.createStatement();
				return true;
			} catch (SQLException e) {
				if (e.getErrorCode() == 1045) { // Access denied for user

					System.err.println("Error: Access denied Please check your username and password.");

				} else if (e.getErrorCode() == 1049) { // Unknown database

					System.err.println("Error: Unknown database '" + databaseName + "'. Please check the database name.");

				} else if (e.getErrorCode() == 0) { // General connection error

					System.err.println("Error: Unable to connect to the database. Please check your connection settings.");

				} else {
					System.err.println("SQL Error: " + e.getMessage());
				}
				return false;
			} catch (Exception e) {

				System.err.println("An unexpected error occurred: " + e.getMessage());
				return false;
			}
    }
	
	public boolean connectDatabase() {
		System.out.println();
		System.out.println("Enter Database Details...");
		userName = Input.getUsername();
		Password = Input.getPassword();
         
		try {
			database= DriverManager.getConnection("jdbc:mysql://localhost:3306", userName,
					Password);
			return true;
		} catch (SQLException e) {
			if (e.getErrorCode() == 1045) { // Access denied for user

				System.err.println("Error: Access denied for user '" + userName + "'. Please check your username and password.");

			} else if (e.getErrorCode() == 1049) { // Unknown database

				System.err.println("Error: Unknown database '" + databaseName + "'. Please check the database name.");

			} else if (e.getErrorCode() == 0) { // General connection error

				System.err.println("Error: Unable to connect to the database. Please check your connection settings.");

			} else {
				System.err.println("SQL Error: " + e.getMessage());
			}
			return false;
		} catch (Exception e) {

			System.err.println("An unexpected error occurred: " + e.getMessage());
			return false;
		}
	}
//	public boolean createStudentTable() {
//		String query = "CREATE TABLE IF NOT EXISTS +"
//	}
}
