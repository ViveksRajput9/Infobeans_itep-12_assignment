package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class p {
public static void main(String[] args)throws SQLException {
	  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","Root");
	  Statement st = con.createStatement();
	  System.out.println("connected");
	  }
}