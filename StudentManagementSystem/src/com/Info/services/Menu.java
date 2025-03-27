package com.Info.services;

import java.sql.*;

import com.Info.Dao.DeleteOperation;
import com.Info.Dao.UpdateOperation;
import com.Info.Dao.CreateOperation;
import com.Info.Dao.Database;
public class Menu {
	public static void showDeleteOptions() throws SQLException {

		System.out.println();
		while (true) {

			System.out.println("Choose one of these options:");
			System.out.println("1. Drop table");
			System.out.println("2. Truncate table");
			System.out.println("3. Drop column");
			System.out.println("4. Delete row ");
			System.out.println("5. Exit");

			int result;
			System.out.println();

			try {
				result = Input.getDecision();

			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number between 1 and 5.");
				continue;
			}

			if (result < 1 || result > 5) {
				System.out.println("Oops... wrong option. Please choose between 1 to 5.");
				continue;
			}
			switch (result) {
			case 1 -> DeleteOperation.delete().dropTable();
			case 2 -> DeleteOperation.delete().truncateTable();
			case 3 -> DeleteOperation.delete().dropColumn();
			case 4 -> DeleteOperation.delete().deleteRow();
			case 5 -> showTableOptions();

			}
		}
	}

	public static void showTableOptions() throws SQLException {
		System.out.println();

		while (true) {

			System.out.println("Choose one of these options:");
			System.out.println("1. Print table");
			System.out.println("2. Insert data");
			System.out.println("3. Delete Operation");
			System.out.println("4. Change database");
			System.out.println("5. Main Menu");
			System.out.println("6. Exit");
			int result;
			System.out.println();

			try {
				result = Input.getDecision();

			} catch (NumberFormatException e) {
				System.out.println("Invalid input. Please enter a number between 1 and 6.");
				continue;
			}

			if (result < 1 || result > 5) {
				System.out.println("Oops... wrong option. Please choose between 1 to 6.");
				continue;
			}
			switch (result) {

			case 1 -> {
				String tableName = Input.getTableName();
				ResultSet rs = Database.getConnection().prepareStatement("select * from "+tableName).executeQuery();
				Print.print().printTable(rs);
			}
			case 2 -> {
                String tableName = Input.getTableName();
				boolean flag ;
				do{
					flag= UpdateOperation.update().insertData(Database.getConnection(),tableName);
				}while(!flag);
			}

			case 3 -> showDeleteOptions();

			case 4 -> {

				boolean flag = Database.connectDatabase();
				while (!flag)
					flag = Database.connectDatabase();

				System.out.println("Database changed successfully");
			}
			case 5 -> showMainOptions();
			case 6 -> {
				System.out.println("Exiting the options menu.");
				return;
			}
			default -> System.out.println("Wrong option");
			}
		}
	}

	public static void showMainOptions() throws SQLException {
		System.out.println();
		try {
			while (true) {

				System.out.println("Choose one of these options:");
				System.out.println("1. Create table");
				System.out.println("2. Select table");
				System.out.println("3. Change database");
				System.out.println("4. Exit");
				int result;
				System.out.println();

				try {
					result = Input.getDecision();

				} catch (NumberFormatException e) {
					System.out.println("Invalid input. Please enter a number between 1 and 4.");
					continue;
				}

				if (result < 1 || result > 4) {
					System.err.println("Invalid input. Please enter a number between 1 and 4.");
					continue;
				}
				switch (result) {
				case 1 -> {
					boolean flag = CreateOperation.create().createTablewithFixedfield();
					while (!flag) showTableOptions();
				}
				case 2 ->{
					String tableName = Input.getTableName();
					Database.database().selectTable(Database.getConnection(),tableName);
				}

				case 3 -> {
					boolean flag = Database.connectDatabase();
					while (!flag)
						flag = Database.connectDatabase();
					System.out.println("Database changed successfully");
				}
				case 4 -> {
					System.out.println("Exiting the options menu.");
					return;
				}
				default -> System.out.println("Wrong option");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
			showMainOptions();
		}
	}
}
