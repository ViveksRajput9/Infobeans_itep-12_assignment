package jdbc;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteOperation {
    public static boolean warning() {
        System.err.println("Warning : After delete data you can't rollback ");
    	return Input.getConfirmation();
    }
    public static boolean dropTable(){
    	String table_name = Input.getTableName();
    	try {
    		if(warning()) {
    			Service.getConnection().executeUpdate("drop table "+table_name);
    			return true;    			
    		}
    		else {
    			System.out.println("Execution declined");
    			return false;
    		}
    	}
    	catch(SQLException e) {
             e.getMessage();
             return false;
    	}
    }
    public static boolean truncateTable(){
    	String table_name = Input.getTableName();
    	try {
    		if(warning()) {
    			Service.getConnection().executeUpdate("truncate table "+table_name);
    			return true;    			
    		}
    		else {
    			System.out.println("Execution declined");
    			return false;
    		}
    	}
    	catch(SQLException e) {
             e.getMessage();
             return false;
    	}
    }
    public static boolean dropColumn(){
    	String table_name = Input.getTableName();
    	String column_name = Input.getColumnName();
    	try {
    		if(warning()) {
    			Service.getConnection().executeUpdate("ALTER TABLE "+table_name+" DROP COLUMN "+column_name);
    			return true;    			
    		}
    		else {
    			System.out.println("Execution declined");
    			return false;
    		}
    	}
    	catch(SQLException e) {
             e.getMessage();
             return false;
    	}
	}
    
    public static void deleteRow() throws SQLException{
    	String table_name = Input.getTableName();
    	String column_name = Input.getColumnName();
    	String condition = Input.getCondition();
    	String query = "DELETE FROM "+table_name+" WHERE "+column_name+" = "+condition;
    	System.out.println(query);
    	while(true) {
    	System.out.println("choose one of these...");
    	System.out.println("1.execute");
    	System.out.println("2.declined");
    	System.out.println("3.rewrite");

        int flag = Input.getDecision();
    	if(flag==1) {
    		if(warning()) {
    			int row = Service.getConnection().executeUpdate(query);  
    			System.out.println(row +" row effected ");
    			System.out.println("Query execute successfully");
    			break;
    		}
    		else {
    			System.out.println("Execution declined");
    			break;
    		}
    	}else if(flag == 2){
    		System.out.println("Declined");
    		break;
    	}else if (flag==3){
			deleteRow();
		}else{
			System.out.println("Oops... Wrong input choose again");
		}
    	}
	}
}