package jdbc;

import java.sql.*;

public class Service {
	private static Statement st;
	private static String databaseName;
	private static String tableName;

	public static String getDatabaseName() {
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

	public static String getTableName() {
		return tableName;
	}

	public static Statement getConnection() {
		return st;
	}

	public static boolean createTable() {
		System.out.println();
		if (Input.getConfirmation()) {
			System.out.println("Creating a new table...");
			String lTableName = Input.getTableName();
			try {
				st.executeUpdate("create table " + lTableName
						+ "(id INT PRIMARY KEY AUTO_INCREMENT,firstName VARCHAR(30),lastName VARCHAR(30),MobileNumber varchar(15))");
				System.out.println("Table Created successfully");
				tableName = lTableName;
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

	public static void printSpace(int len) {
		if (len > 0)
			for (int i = 0; i < len; i++) {
				System.out.print(" ");
			}
	}

	public static void printTable() {
		System.out.println();
		try {
			int whiteSpace = 18;
			String query = "select * from " + tableName;
			ResultSet rs = st.executeQuery(query);
			int columnCount = rs.getMetaData().getColumnCount();
			for (int i = 1; i <= columnCount; i++) {
				String result = rs.getMetaData().getColumnName(i);

				System.out.print("|");
				printSpace((whiteSpace - result.length() + 1) / 2);
				System.out.print(result);
				printSpace((whiteSpace - result.length() + 2) / 2);

			}
			System.out.println();
			System.out.println();
			while (rs.next()) {
				for (int i = 1; i <= columnCount; i++) {
					String result = rs.getString(i);
					System.out.print("|");
					printSpace((whiteSpace - result.length() + 1) / 2);
					System.out.print(result);
					printSpace((whiteSpace - result.length() + 2) / 2);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("printing completed...");
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static boolean insertData() throws SQLException {
		System.out.println();

		ResultSet rs = null;
		try {
			System.out.print("Enter table name :-");
			rs = st.executeQuery("select * from " + tableName);
			int columnCount = rs.getMetaData().getColumnCount();
			System.out.println("Enter data:-");
			StringBuilder query = new StringBuilder("insert into " + tableName + "(");
			StringBuilder values = new StringBuilder("VALUES(");
			for (int i = 1; i <= columnCount; i++) {
				String columnName = rs.getMetaData().getColumnName(i);
				System.out.print(columnName + " :- ");
				String entrie = Input.getEntrie();
				query.append(columnName);
				if (!Character.isDigit(entrie.charAt(0)))
					values.append("'" + entrie + "'");
				else
					values.append(entrie);
				if (i != columnCount)
					query.append(',');
				if (i != columnCount)
					values.append(',');
			}
			query.append(")");
			values.append(")");
			System.out.println(query + " " + values);
			int r = st.executeUpdate(query + " " + values);
			System.out.println("--> " + r + " row effected data inserted successfully");
			System.out.println();

			return true;
		} catch (Exception e) {
//			e.printStackTrace();

			e.getMessage();
			return false;
			// TODO: handle exception
		} finally {
			if (rs != null)
				rs.close();
		}
	}

	public static void selectTable() {
		try {
			String tablename = Input.getTableName();
			int result = st.executeUpdate("SELECT COUNT(*) FROM information_schema.tables WHERE table_schema = "
					+ databaseName + " AND table_name = " + tablename);
			if (result <= 0) {
				System.out.println("Table not exists");
			    Menu.showMainOptions();
			  }
			else
				tableName = tablename;
			System.out.println("Table selected :- " + tableName);
			Menu.showTableOptions();
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

	public static boolean connectDatabase() {
		System.out.println();
		System.out.println("Enter Database Details...");
		String databasename = Input.setDatabaseName();
		String username = Input.getUsername();
		String password = Input.getPassword();

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + databasename, username,
					password);
			st = con.createStatement();
			return true;
		} catch (SQLException e) {
			if (e.getErrorCode() == 1045) { // Access denied for user
				
				System.err.println("Error: Access denied for user '" + username + "'. Please check your username and password.");

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
}