package com.Info.services;

import java.sql.SQLException;

import com.Info.Dao.Database;

public class Main {
	public static void main(String[] args) throws SQLException {
    	System.out.println("Welcome to Java Data Base Connectivity");
        boolean flag;
		do{
    		 flag = Database.database().connectDatabase();
    		 
    	}while(!flag);
		Menu.showChooseDatabaseOption();
	}
}