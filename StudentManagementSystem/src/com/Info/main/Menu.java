package com.Info.main;

import java.sql.*;

import com.Info.Dao.DeleteOperation;
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
			case 1 -> DeleteOperation.dropTable();
			case 2 -> DeleteOperation.truncateTable();
			case 3 -> DeleteOperation.dropColumn();
			case 4 -> DeleteOperation.deleteRow();
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

			case 1 -> Database.printTable();
			case 2 -> {

				boolean flag = Database.insertData();

				while (!flag)
					flag = Database.insertData();
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
					boolean flag = Database.createTable();
					while (!flag) showTableOptions();
				}
				case 2 -> Database.selectTable();

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
