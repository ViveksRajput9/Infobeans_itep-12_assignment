package jdbc;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {
    	System.out.println("Welcome to Java Data Base Connectivity");
        boolean flag;
		do{
    		 flag = Service.connectDatabase();
    	}while(!flag);
		Menu.showMainOptions();
	}
}
